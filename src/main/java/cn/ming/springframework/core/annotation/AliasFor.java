package cn.ming.springframework.core.annotation;

import java.lang.annotation.*;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:30
 * @Version: 1.0
 * @Description: TODO
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AliasFor {

    @AliasFor("attribute")
    String value() default "";

    @AliasFor("value")
    String attribute() default "";

    Class<? extends Annotation> annotation() default Annotation.class;
}
