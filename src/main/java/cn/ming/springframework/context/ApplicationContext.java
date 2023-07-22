package cn.ming.springframework.context;

import cn.bugstack.springframework.beans.factory.HierarchicalBeanFactory;
import cn.bugstack.springframework.beans.factory.ListableBeanFactory;
import cn.bugstack.springframework.core.io.ResourceLoader;

/**
 * @author 小傅哥，微信：fustack
 * @description 应用上下文接口 Central interface to provide configuration for an application.
 * This is read-only while the application is running, but may be
 * reloaded if the implementation supports this.
 * @date 2022/3/10
 * @github https://github.com/fuzhengwei
 * @copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher  {
}
