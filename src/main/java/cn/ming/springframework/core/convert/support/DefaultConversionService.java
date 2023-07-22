package cn.ming.springframework.core.convert.support;

import cn.ming.springframework.core.convert.converter.ConverterRegistry;

/**
 * @Author: xuming
 * @Date: 2023-07-22 21:07
 * @Version: 1.0
 * @Description: TODO
 **/
public class DefaultConversionService extends GenericConversionService{

    public DefaultConversionService() {
        addDefaultConverters(this);
    }

    public static void addDefaultConverters(ConverterRegistry converterRegistry) {
        // 添加各类类型转换工厂
        converterRegistry.addConverterFactory(new StringToNumberConverterFactory());
    }
}
