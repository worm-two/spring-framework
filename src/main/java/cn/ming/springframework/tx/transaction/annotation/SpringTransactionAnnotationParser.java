package cn.ming.springframework.tx.transaction.annotation;

import cn.ming.springframework.core.annotation.AnnotatedElementUtils;
import cn.ming.springframework.core.annotation.AnnotationAttributes;
import cn.ming.springframework.tx.transaction.interceptor.RollbackRuleAttribute;
import cn.ming.springframework.tx.transaction.interceptor.RuleBasedTransactionAttribute;
import cn.ming.springframework.tx.transaction.interceptor.TransactionAttribute;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:23
 * @Version: 1.0
 * @Description:
 **/
public class SpringTransactionAnnotationParser implements TransactionAnnotationParser, Serializable {

    @Override
    public TransactionAttribute parseTransactionAnnotation(AnnotatedElement element) {
        AnnotationAttributes attributes = AnnotatedElementUtils.findMergedAnnotationAttributes(
                element, Transactional.class, false, false);
        if (null != attributes) {
            return parseTransactionAnnotation(attributes);
        } else {
            return null;
        }
    }

    /**
     * 参照源码，简化实现
     * org.springframework.transaction.annotation.SpringTransactionAnnotationParser#parseTransactionAnnotation
     */
    protected TransactionAttribute parseTransactionAnnotation(AnnotationAttributes attributes) {
        RuleBasedTransactionAttribute rbta = new RuleBasedTransactionAttribute();

        List<RollbackRuleAttribute> rollbackRules = new ArrayList<>();
        for (Class<?> rbRule : attributes.getClassArray("rollbackFor")) {
            rollbackRules.add(new RollbackRuleAttribute(rbRule));
        }

        rbta.setRollbackRules(rollbackRules);
        return rbta;
    }

}
