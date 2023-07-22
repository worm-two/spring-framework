package cn.ming.springframework.core.convert.converter;

/**
 * @Author: xuming
 * @Date: 2023-07-22 20:49
 * @Version: 1.0
 * @Description: 类型转换注册接口
 **/
public interface ConverterRegistry {


    void addConverter(Converter<?, ?> converter);


    void addConverter(GenericConverter converter);


    void addConverterFactory(ConverterFactory<?,?> converterFactory);
}
