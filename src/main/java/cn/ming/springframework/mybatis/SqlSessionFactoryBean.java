package cn.ming.springframework.mybatis;

import cn.ming.mybatisframework.SqlSessionFactory;
import cn.ming.mybatisframework.SqlSessionFactoryBuilder;
import cn.ming.springframework.beans.factory.FactoryBean;
import cn.ming.springframework.beans.factory.InitializingBean;
import cn.ming.springframework.core.io.DefaultResourceLoader;
import cn.ming.springframework.core.io.Resource;

import java.io.InputStream;

/**
 * @Author: xuming
 * @Date: 2023-07-23 13:16
 * @Version: 1.0
 * @Description: SqlSession 工厂
 **/
public class SqlSessionFactoryBean implements FactoryBean<SqlSessionFactory>, InitializingBean {

    private String resource;
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public void afterPropertiesSet() throws Exception {
        DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader();
        Resource resource = defaultResourceLoader.getResource(this.resource);

        try (InputStream inputStream = resource.getInputStream()) {
            this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public SqlSessionFactory getObject() throws Exception {
        return sqlSessionFactory;
    }

    @Override
    public Class<?> getObjectType() {
        return SqlSessionFactory.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

}
