package cn.ming.springframework.jdbc.core;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: xuming
 * @Date: 2023-07-22 22:31
 * @Version: 1.0
 * @Description: TODO
 **/
public interface RowMapper<T>{

    T mapRow(ResultSet rs, int rowNum) throws SQLException;
}
