package cn.ming.springframework.jdbc.datasource;

import java.sql.Connection;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:23
 * @Version: 1.0
 * @Description:
 **/
public interface ConnectionHandle {

    Connection getConnection();

    default void releaseConnection(Connection con) {

    }

}
