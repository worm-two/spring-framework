package cn.ming.springframework.beans.factory;

import cn.ming.springframework.beans.BeansException;

/**
 * @Author: xuming
 * @Date: 2023-07-22 18:46
 * @Version: 1.0
 * @Description: TODO
 **/
public interface ObjectFactory<T> {

    T getObject() throws BeansException;
}
