package cn.ming.springframework.jdbc.core;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: xuming
 * @Date: 2023-07-22 22:37
 * @Version: 1.0
 * @Description: TODO
 **/
public interface StatementCallback<T> {

    T doInStatement(Statement statement) throws SQLException;
}
