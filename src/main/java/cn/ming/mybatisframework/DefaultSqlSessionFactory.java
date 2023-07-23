package cn.ming.mybatisframework;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:23
 * @Version: 1.0
 * @Description: DefaultSqlSessionFactory
 **/
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration.connection, configuration.mapperElement);
    }

}
