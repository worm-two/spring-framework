package cn.ming.springframework.tx.transaction.support;

import cn.ming.springframework.tx.transaction.TransactionDefinition;

import java.io.Serializable;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:23
 * @Version: 1.0
 * @Description:
 **/
public abstract class DelegatingTransactionDefinition implements TransactionDefinition, Serializable {

    private final TransactionDefinition targetDefinition;

    public DelegatingTransactionDefinition(TransactionDefinition targetDefinition) {
        this.targetDefinition = targetDefinition;
    }

    @Override
    public int getPropagationBehavior() {
        return this.targetDefinition.getPropagationBehavior();
    }

    @Override
    public int getIsolationLevel() {
        return this.targetDefinition.getIsolationLevel();
    }

    @Override
    public int getTimeout() {
        return this.targetDefinition.getTimeout();
    }

    @Override
    public boolean isReadOnly() {
        return this.targetDefinition.isReadOnly();
    }

    @Override
    public String getName() {
        return this.targetDefinition.getName();
    }

    @Override
    public boolean equals(Object other) {
        return this.targetDefinition.equals(other);
    }

    @Override
    public int hashCode() {
        return this.targetDefinition.hashCode();
    }

    @Override
    public String toString() {
        return this.targetDefinition.toString();
    }

}
