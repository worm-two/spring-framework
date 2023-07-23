package cn.ming.springframework.mybatis;

import cn.hutool.core.lang.ClassScanner;
import cn.ming.mybatisframework.SqlSessionFactory;
import cn.ming.springframework.beans.BeansException;
import cn.ming.springframework.beans.PropertyValue;
import cn.ming.springframework.beans.PropertyValues;
import cn.ming.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.ming.springframework.beans.factory.config.BeanDefinition;
import cn.ming.springframework.beans.factory.support.BeanDefinitionRegistry;
import cn.ming.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

import java.util.Set;

/**
 * @Author: xuming
 * @Date: 2023-07-23 13:12
 * @Version: 1.0
 * @Description: Mapper 扫描配置，根据包信息扫描接口类并注册
 **/
public class MapperScannerConfigurer implements BeanDefinitionRegistryPostProcessor {

    private String basePackage;
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        try {
            Set<Class<?>> classes = ClassScanner.scanPackage(basePackage);
            for (Class<?> clazz : classes) {
                // Bean 对象定义
                BeanDefinition beanDefinition = new BeanDefinition(clazz);
                PropertyValues propertyValues = new PropertyValues();
                propertyValues.addPropertyValue(new PropertyValue("mapperInterface", clazz));
                propertyValues.addPropertyValue(new PropertyValue("sqlSessionFactory", sqlSessionFactory));
                beanDefinition.setPropertyValues(propertyValues);
                beanDefinition.setBeanClass(MapperFactoryBean.class);
                // Bean 对象注册
                registry.registerBeanDefinition(clazz.getSimpleName(), beanDefinition);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // left intentionally blank
    }

}