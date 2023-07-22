package cn.ming.springframework.util;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description:
 **/
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {
            // Cannot access thread context ClassLoader - falling back to system class loader...
        }
        if (cl == null) {
            // No thread context class loader -> use class loader of this class.
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }


    public static boolean isCglibProxyClass(Class<?> clazz) {
        return (clazz != null && isCglibProxyClassName(clazz.getName()));
    }


    public static boolean isCglibProxyClassName(String className) {
        return (className != null && className.contains("$$"));
    }

}
