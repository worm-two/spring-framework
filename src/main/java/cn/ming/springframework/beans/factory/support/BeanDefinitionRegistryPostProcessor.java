package cn.ming.springframework.beans.factory.support;

import cn.ming.springframework.beans.BeansException;
import cn.ming.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @Author: xuming
 * @Date: 2023-07-23 13:15
 * @Version: 1.0
 * @Description: TODO
 **/
public interface BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor {

    void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException;

}