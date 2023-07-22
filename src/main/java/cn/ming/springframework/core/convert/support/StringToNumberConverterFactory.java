package cn.ming.springframework.core.convert.support;

import cn.ming.springframework.core.convert.converter.Converter;
import cn.ming.springframework.core.convert.converter.ConverterFactory;
import cn.ming.springframework.util.NumberUtils;
import com.sun.istack.internal.Nullable;

/**
 * @Author: xuming
 * @Date: 2023-07-22 21:10
 * @Version: 1.0
 * @Description: TODO
 **/
public class StringToNumberConverterFactory implements ConverterFactory<String, Number> {

    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToNumber<>(targetType);
    }

    private static final class StringToNumber<T extends Number> implements Converter<String, T> {

        private final Class<T> targetType;

        public StringToNumber(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        @Nullable
        public T convert(String source) {
            if (source.isEmpty()) {
                return null;
            }
            return NumberUtils.parseNumber(source, this.targetType);
        }
    }

}
