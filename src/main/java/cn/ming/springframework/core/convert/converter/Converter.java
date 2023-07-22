package cn.ming.springframework.core.convert.converter;

/**
 * @Author: xuming
 * @Date: 2023-07-22 20:47
 * @Version: 1.0
 * @Description: 类型转换处理接口
 **/
public interface Converter<S, T> {

    T convert(S source);
}
