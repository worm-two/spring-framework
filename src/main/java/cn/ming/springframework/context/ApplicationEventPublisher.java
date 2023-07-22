package cn.ming.springframework.context;


/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description: 事件发布者接口
 **/
public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);

}
