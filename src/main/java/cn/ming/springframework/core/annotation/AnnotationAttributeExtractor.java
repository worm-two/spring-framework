package cn.ming.springframework.core.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Author: xuming
 * @Date: 2023-07-23 9:59
 * @Version: 1.0
 * @Description: TODO
 **/
public interface AnnotationAttributeExtractor<S> {

    Class<? extends Annotation> getAnnotationType();

    Object getAnnotatedElement();

    S getSource();

    Object getAttributeValue(Method attributeMethod);
}
