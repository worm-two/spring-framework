package cn.ming.springframework.core.io;


/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description: 资源加载器
 **/
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
