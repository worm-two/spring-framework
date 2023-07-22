package cn.ming.springframework.beans.factory.config;


import cn.ming.springframework.beans.factory.HierarchicalBeanFactory;
import cn.ming.springframework.core.convert.ConversionService;
import cn.ming.springframework.util.StringValueResolver;
import com.sun.istack.internal.Nullable;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description:
 **/
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    String resolveEmbeddedValue(String value);


    void setConversionService(ConversionService conversionService);

    @Nullable
    ConversionService getConversionService();


}
