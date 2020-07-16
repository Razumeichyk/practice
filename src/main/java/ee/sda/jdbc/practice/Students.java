package ee.sda.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Students {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://remotemysql.com:3306/t5a5hcwqAZ", "t5a5hcwqAZ", "j4UegnhFSO");
    }
    private static final String SQL_CREATE = "CREATE TABLE STUDENTS"
            + "("
            + " ID INT NOT NULL AUTO_INCREMENT,"
            + " NAME VARCHAR(100) NOT NULL,"
            + " SURNAME VARCHAR(100) NOT NULL,"
            + " PRIMARY KEY (ID)"
            + ")";

    private static final String SQL_INSERT = "INSERT INTO STUDENTS (NAME, SURNAME) VALUES (?,?)";

    private static final String SQL_DELETE = "DELETE FROM STUDENTS WHERE NAME=?";

    public static void main(String[] args) throws SQLException {

        try (Connection conn = Students.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE)){
//            preparedStatement.setString(1, "Yury");
//            preparedStatement.setString(2, "Raz");
            preparedStatement.setString(1, "Tan");
            //preparedStatement.setString(2, "Bat");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
