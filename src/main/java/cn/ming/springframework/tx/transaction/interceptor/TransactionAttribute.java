package cn.ming.springframework.tx.transaction.interceptor;


import cn.ming.springframework.tx.transaction.TransactionDefinition;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:23
 * @Version: 1.0
 * @Description:
 **/
public interface TransactionAttribute extends TransactionDefinition {

    boolean rollbackOn(Throwable ex);

}
