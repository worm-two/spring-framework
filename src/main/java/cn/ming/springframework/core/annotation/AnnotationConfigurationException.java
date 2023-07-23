package cn.ming.springframework.core.annotation;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:26
 * @Version: 1.0
 * @Description: TODO
 **/
public class AnnotationConfigurationException extends RuntimeException {

    public AnnotationConfigurationException(String message) {
        super(message);
    }

    public AnnotationConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

}