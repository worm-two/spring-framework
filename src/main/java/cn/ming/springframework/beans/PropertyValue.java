package cn.ming.springframework.beans;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description: Bean 属性信息
 **/
@AllArgsConstructor
@Getter
public class PropertyValue {

    /** 属性名称 */
    private final String name;

    /** 属性值 */
    private final Object value;
}
