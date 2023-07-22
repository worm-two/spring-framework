package cn.ming.springframework.core.convert.converter;

/**
 * @Author: xuming
 * @Date: 2023-07-22 20:48
 * @Version: 1.0
 * @Description: 类型转换工厂
 **/
public interface ConverterFactory<S, R> {

    <T extends R> Converter<S, T> getConverter(Class<T> targetType);
}
