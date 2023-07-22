package cn.ming.springframework.context;


import cn.ming.springframework.beans.factory.HierarchicalBeanFactory;
import cn.ming.springframework.beans.factory.ListableBeanFactory;
import cn.ming.springframework.core.io.ResourceLoader;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description: 应用上下文接口
 **/
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
