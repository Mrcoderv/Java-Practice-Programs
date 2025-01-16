import java.sql.*;

public class P112JDBCExample { 
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // database URL
        String user = "root"; // database username
        String password = "password"; // database password

        try {
            // Establishing connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Creating a statement
            Statement stmt = connection.createStatement();
            String query = "SELECT * FROM users"; // Sample SQL query

            // Executing the query and getting the result set
            ResultSet resultSet = stmt.executeQuery(query);

            // Displaying the data
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name"));
            }

            // Closing connections
            resultSet.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
