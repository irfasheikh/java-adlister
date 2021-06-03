import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class jdbcLecture {
    //setup an area where i can run an app

    public static void main(String[] args) throws SQLException {
        //first register driver

        DriverManager.registerDriver(new Driver());

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true", "root", "codeup"); //modification of code on curriculum example
        //path to mysql server
        //local host
        //change to database you want to use
        //? is query strings, showing key value pairs

        // we usually make the connection once and then use it again afterwards


        Statement statement = connection.createStatement();

        ResultSet selectResults = statement.executeQuery("SELECT * FROM products");

        while(selectResults.next()){ //WHILE there are rows that are NEXT

            System.out.println("Here's a product:");
//            System.out.println("name : " + selectResults.getString("name"));
//            System.out.println("price: " + selectResults.getInt("price") + );
        }

        //Example: insertion of new record + return of ID that was generated

        String insertQuery = "INSERT INTO products (name, price) VALUES ('nailgun', 250) ";

        Statement insertStatement = connection.createStatement();

        insertStatement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        ResultSet insertResults = insertStatement.getGeneratedKeys();

        if(insertResults.next()) {
            System.out.println("Admin: a new item has been created with the id of " + insertResults.getLong(1));
        }
    }
}
