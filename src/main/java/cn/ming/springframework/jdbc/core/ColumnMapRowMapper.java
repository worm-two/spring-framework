package cn.ming.springframework.jdbc.core;


import cn.ming.springframework.jdbc.support.JdbcUtils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: xuming
 * @Date: 2023-07-22 22:30
 * @Version: 1.0
 * @Description: TODO
 **/
public class ColumnMapRowMapper implements RowMapper<Map<String, Object>> {

    @Override
    public Map<String, Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
        ResultSetMetaData rsMetaData = rs.getMetaData();
        int columnCount = rsMetaData.getColumnCount();
        Map<String, Object> mapOfColumnValues = createColumnMap(columnCount);
        for (int i = 1; i <= columnCount; i++) {
            String columnName = JdbcUtils.lookupColumnName(rsMetaData, i);
            mapOfColumnValues.putIfAbsent(getColumnKey(columnName), getColumnValue(rs, i));
        }
        return mapOfColumnValues;
    }

    protected Map<String, Object> createColumnMap(int columnCount) {
        return new LinkedHashMap<>(columnCount);
    }

    protected String getColumnKey(String columnName) {
        return columnName;
    }

    protected Object getColumnValue(ResultSet rs, int index) throws SQLException {
        return JdbcUtils.getResultSetValue(rs, index);
    }


}
