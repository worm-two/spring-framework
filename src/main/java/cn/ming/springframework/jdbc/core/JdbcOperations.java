package cn.ming.springframework.jdbc.core;

import java.util.List;
import java.util.Map;

/**
 * @Author: xuming
 * @Date: 2023-07-22 22:37
 * @Version: 1.0
 * @Description: TODO
 **/
public interface JdbcOperations {

    <T> T execute(StatementCallback<T> action) throws Exception;

    void execute(String sql);

    <T> T query(String sql, ResultSetExtractor<T> res);

    <T> List<T> query(String sql, RowMapper<T> rowMapper);

    List<Map<String, Object>> queryForList(String sql);
}
