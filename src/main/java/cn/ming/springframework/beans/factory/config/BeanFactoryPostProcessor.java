package cn.ming.springframework.beans.factory.config;


import cn.ming.springframework.beans.BeansException;
import cn.ming.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description: 允许自定义修改 BeanDefinition 属性信息
 **/
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
