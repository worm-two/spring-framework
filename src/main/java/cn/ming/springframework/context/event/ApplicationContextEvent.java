package cn.ming.springframework.context.event;


import cn.ming.springframework.context.ApplicationContext;
import cn.ming.springframework.context.ApplicationEvent;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description:
 **/
public class ApplicationContextEvent extends ApplicationEvent {


    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }

}
