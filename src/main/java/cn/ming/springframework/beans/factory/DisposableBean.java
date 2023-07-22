package cn.ming.springframework.beans.factory;


/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description:
 **/
public interface DisposableBean {

    void destroy() throws Exception;

}
