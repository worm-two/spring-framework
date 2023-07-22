package cn.ming.springframework.context;


import cn.ming.springframework.beans.BeansException;
import cn.ming.springframework.beans.factory.Aware;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description: 实现此接口，既能感知到所属的 ApplicationContext
 **/
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
