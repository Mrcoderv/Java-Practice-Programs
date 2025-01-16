import java.sql.*;

public class P114JDBCExample{
    private static final String url = "jdbc:mysql://127.0.0.1:3306/sem3";
    private static final String userName = "root";
    private static final String password = "mrcoderv";
    public static void main(String[] args) {
                try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");

            // Establish connection
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to database");

            // Create statement
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM studentsdata");
            // Process result set

            while (resultSet.next()) {
                int id = resultSet.getInt("Rollnumber");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("Marks");

                System.out.println("id: " + id);
                System.out.println("name: " + name);
                System.out.println("age: " + age);
                System.out.println("marks: " + marks);
            }

            // Close connection
            connection.close();
        } catch (Exception e) {
            System.out.println("System error: " + e.getMessage());
        } 
    }
}
