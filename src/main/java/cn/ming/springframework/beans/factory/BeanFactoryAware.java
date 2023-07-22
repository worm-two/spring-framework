package cn.ming.springframework.beans.factory;


import cn.ming.springframework.beans.BeansException;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description: 实现此接口，既能感知到所属的 BeanFactory
 **/
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
