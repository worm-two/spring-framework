package cn.ming.springframework.core;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:19
 * @Version: 1.0
 * @Description: TODO
 **/
public abstract class GraalDetector {

    private static final boolean imageCode = (System.getProperty("org.graalvm.nativeimage.imagecode") != null);

    public static boolean inImageCode() {
        return imageCode;
    }
}
