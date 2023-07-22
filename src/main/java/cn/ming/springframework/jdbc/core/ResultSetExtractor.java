package cn.ming.springframework.jdbc.core;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: xuming
 * @Date: 2023-07-22 22:38
 * @Version: 1.0
 * @Description: TODO
 **/
public interface ResultSetExtractor<T> {

    T extractData(ResultSet rs) throws SQLException;
}
