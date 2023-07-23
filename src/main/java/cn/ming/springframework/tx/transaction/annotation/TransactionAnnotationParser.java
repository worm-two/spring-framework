package cn.ming.springframework.tx.transaction.annotation;

import cn.ming.springframework.tx.transaction.interceptor.TransactionAttribute;

import java.lang.reflect.AnnotatedElement;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:23
 * @Version: 1.0
 * @Description:
 **/
public interface TransactionAnnotationParser {

    /**
     * 基于该解析器理解的注释类型，解析给定方法或类的事务属性。
     */
    TransactionAttribute parseTransactionAnnotation(AnnotatedElement element);

}
