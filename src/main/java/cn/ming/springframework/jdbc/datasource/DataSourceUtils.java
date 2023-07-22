package cn.ming.springframework.jdbc.datasource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author: xuming
 * @Date: 2023-07-22 22:43
 * @Version: 1.0
 * @Description: TODO
 **/
public class DataSourceUtils {

    public static Connection getConnection(DataSource dataSource) {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("Failed to obtain JDBC Connection", e);
        }
    }
}
