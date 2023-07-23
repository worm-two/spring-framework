package cn.ming.springframework;


import com.alibaba.druid.pool.DruidDataSource;
import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

;


public class JdbcTest {

    private DruidDataSource dataSource;
    private Connection connection;
    private Statement statement;

    @BeforeEach
    public void init() throws SQLException {
        dataSource = new DruidDataSource();
        dataSource.setDriver(new Driver());
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?useSSL=false");
        dataSource.setPassword("root");
        dataSource.setUsername("root");
    }

    @Test
    public void test_translation() throws SQLException {
        connection = dataSource.getConnection().getConnection();
        statement = connection.createStatement();

        connection.setAutoCommit(false);
        try {
            statement.execute("insert into user (id, userId, userHead, createTime, updateTime) values (111, '184172133','01_50', now(), now())");
            statement.execute("insert into user (id, userId, userHead, createTime, updateTime) values (112, '184172133','01_50', now(), now())");
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        }
        connection.commit();
    }

}
