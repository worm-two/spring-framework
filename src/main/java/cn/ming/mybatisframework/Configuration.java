package cn.ming.mybatisframework;

import java.sql.Connection;
import java.util.Map;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:23
 * @Version: 1.0
 * @Description: 链接信息和数据源配置类
 **/
public class Configuration {

    protected Connection connection;
    protected Map<String, String> dataSource;
    protected Map<String, XNode> mapperElement;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setDataSource(Map<String, String> dataSource) {
        this.dataSource = dataSource;
    }

    public void setMapperElement(Map<String, XNode> mapperElement) {
        this.mapperElement = mapperElement;
    }

}
