package cn.ming.springframework.beans.factory.config;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description: Bean 引用
 **/
@AllArgsConstructor
@Getter
public class BeanReference {

    private final String beanName;
}
