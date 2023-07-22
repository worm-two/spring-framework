package cn.ming.springframework.context.support;


import cn.ming.springframework.beans.BeansException;
import cn.ming.springframework.beans.factory.config.BeanPostProcessor;
import cn.ming.springframework.context.ApplicationContext;
import cn.ming.springframework.context.ApplicationContextAware;
import lombok.AllArgsConstructor;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description: 通过 BeanPostProcessor 实现类感知应用上下文对象
 **/
@AllArgsConstructor
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
