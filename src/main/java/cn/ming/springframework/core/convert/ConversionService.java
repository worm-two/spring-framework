package cn.ming.springframework.core.convert;

/**
 * @Author: xuming
 * @Date: 2023-07-22 21:10
 * @Version: 1.0
 * @Description: 类型转换抽象接口
 **/
public interface ConversionService {


    boolean canConvert(Class<?> sourceType, Class<?> targetType);

    <T> T convert(Object source, Class<T> targetType);
}
