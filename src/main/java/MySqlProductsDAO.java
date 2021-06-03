//import java.sql.DriverManager;
//        import java.sql.*;
//        import java.util.ArrayList;
//        import java.util.List;
//        import com.mysql.cj.jdbc.Driver;
//
//public class MySqlProductsDAO {
//
//
//    Connection connection;
//
//    public MySqlProductsDao() {
//        try {
//            DriverManager.registerDriver(new Driver());
//            connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost/example_db?serverTimezone=UTC&useSSL=false",
//                    "root",
//                    "codeup"
//            );} catch (SQLException e){
//            throw new RuntimeException("Error connecting to SQL database!", e);
//        };
//    }
//
//    @Override
//    public List<Product> all() {
//        try {
//            Statement stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM products");
//            return createProductsFromResults(rs);
//        } catch (SQLException e) {
//            throw new RuntimeException("Error retrieving all products.", e);
//        }
//    }
//
//    private Product extractProduct(ResultSet rs) throws SQLException {
//        return new Product(
//                rs.getString("name"),
//                rs.getDouble("price")
//        );
//    }
//
//    private List<Product> createProductsFromResults(ResultSet rs) throws SQLException {
//        List<Product> products = new ArrayList<>();
//        while (rs.next()) {
//            products.add(extractProduct(rs));
//        }
//        return products;
//    }
//
//    @Override
//    public void insert(Product product) {
//        try {
//            Statement stmt = connection.createStatement();
//            String query = "INSERT INTO products(name, price) VALUES ("
//                    + " ' " + product.getName() + "'" + " , "
//                    + product.getPrice() + ")";
//            System.out.println(query);
//            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = stmt.getGeneratedKeys();
//            rs.next();
//            System.out.println("Created new product with ID: " + rs.getLong(1));
//        } catch (SQLException e) {
//            throw new RuntimeException("Error creating a new ad.", e);
//        }
//    }
//}
//}