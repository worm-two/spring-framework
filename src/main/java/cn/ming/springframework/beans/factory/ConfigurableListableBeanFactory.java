package cn.ming.springframework.beans.factory;


import cn.ming.springframework.beans.BeansException;
import cn.ming.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.ming.springframework.beans.factory.config.BeanDefinition;
import cn.ming.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description:
 **/
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}
