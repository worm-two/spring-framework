package cn.ming.springframework.context.event;


import cn.ming.springframework.context.ApplicationEvent;
import cn.ming.springframework.context.ApplicationListener;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description: 事件广播器
 **/
public interface ApplicationEventMulticaster {


    void addApplicationListener(ApplicationListener<?> listener);


    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);

}
