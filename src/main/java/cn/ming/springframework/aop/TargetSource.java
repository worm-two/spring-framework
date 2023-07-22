package cn.ming.springframework.aop;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description: 被代理的目标对象
 **/
@AllArgsConstructor
@Getter
public class TargetSource {

    private final Object target;

    public Class<?>[] getTargetClass() {
        return this.target.getClass().getInterfaces();
    }
}
