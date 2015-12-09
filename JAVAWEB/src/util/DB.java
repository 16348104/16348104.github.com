package util;

import java.sql.*;

import com.mysql.jdbc.Driver;

/**
 * Created by dell on 2015/12/9.
 */
public class DB {
    private static final String url = "jdbc:mysql:///test";
    private static final String user = "root";
    private static final String password = "1111";

    public static Connection getConnetion() {

        try {
            new Driver();
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void close(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}




