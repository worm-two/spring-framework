package cn.ming.springframework.aop.framework;


import cn.ming.springframework.aop.AdvisedSupport;
import lombok.AllArgsConstructor;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description:
 **/
@AllArgsConstructor
public class ProxyFactory {

    private AdvisedSupport advisedSupport;

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        if (advisedSupport.isProxyTargetClass()) {
            return new Cglib2AopProxy(advisedSupport);
        }
        return new JdkDynamicAopProxy(advisedSupport);
    }

}
