import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLProductsDao implements Ads {
    Connection connection;

    public MySQLAdsDao(Config config) throws SQLException{
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/example_db?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );} catch (SQLException e){
            throw new RuntimeException("Error connecting to SQL database!", e);
        };
    }

    public List<Ad> all() {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all products.", e);
        }
    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad (
                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("description")
        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }


    public Long insert(Ad ad) {
        try {
            Statement statement = connection.createStatement();
            String query = "INSERT INTO ads(title,description) VALUES ("
                    + " ' " + ad.getTitle() + "'" + " , "
                    + ad.getDescription() + "" + ")";
            System.out.println(query);
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            System.out.println("New ad ID: " + rs.getLong(1));
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }

    public static void main(String[] args){
}
}