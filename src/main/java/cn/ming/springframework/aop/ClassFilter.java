package cn.ming.springframework.aop;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description:
 **/
public interface ClassFilter {

    boolean matches(Class<?> clazz);

}
