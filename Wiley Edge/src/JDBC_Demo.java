
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Demo {

    private final static String url = "jdbc:mysql://127.0.0.1:3306/mysql"; //(CHANGE 3306 TO YOUR LOCALHOST)
    private final static String user = "root";
    private final static String password = "PASSWORD"; //(CHANGE TO MYSQL LOGIN PASSWORD)

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        getConnection();

    }

    public static Connection getConnection(){

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            if (conn != null) {
                System.out.println("Connected to the database!");
                return conn;
            } else {
                System.out.println("Failed to make connection!");
                return null;
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

} 