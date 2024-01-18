package BankmgmtSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

 class DatabaseConnection {
    private Connection connection;
    Statement statement;

    public DatabaseConnection() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmgm", "root", "");

            // Create a statement
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            // Log or handle the exception appropriately
            e.printStackTrace();
        }
    }

    // Other methods for executing queries, closing connections, etc.

    public void closeConnection() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
