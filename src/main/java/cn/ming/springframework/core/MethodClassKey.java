package cn.ming.springframework.core;

import cn.ming.springframework.core.util.ObjectUtils;

import java.lang.reflect.Method;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:37
 * @Version: 1.0
 * @Description: TODO
 **/
public final class MethodClassKey implements Comparable<MethodClassKey>{

    private final Method method;

    private final Class<?> targetClass;

    public MethodClassKey(Method method, Class<?> targetClass) {
        this.method = method;
        this.targetClass = targetClass;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MethodClassKey)) {
            return false;
        }
        MethodClassKey otherKey = (MethodClassKey) other;
        return (this.method.equals(otherKey.method) &&
                ObjectUtils.nullSafeEquals(this.targetClass, otherKey.targetClass));
    }
    @Override
    public int hashCode() {
        return this.method.hashCode() + (this.targetClass != null ? this.targetClass.hashCode() * 29 : 0);
    }

    @Override
    public String toString() {
        return this.method + (this.targetClass != null ? " on " + this.targetClass : "");
    }

    @Override
    public int compareTo(MethodClassKey other) {
        int result = this.method.getName().compareTo(other.method.getName());
        if (result == 0) {
            result = this.method.toString().compareTo(other.method.toString());
            if (result == 0 && this.targetClass != null && other.targetClass != null) {
                result = this.targetClass.getName().compareTo(other.targetClass.getName());
            }
        }
        return result;
    }
}
