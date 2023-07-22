package cn.ming.springframework;


import cn.ming.springframework.bean.Husband;
import cn.ming.springframework.bean.StringToIntegerConverter;
import cn.ming.springframework.context.support.ClassPathXmlApplicationContext;
import cn.ming.springframework.core.convert.converter.Converter;
import cn.ming.springframework.core.convert.support.StringToNumberConverterFactory;
import cn.ming.springframework.jdbc.core.JdbcTemplate;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class ApiTest {

    @Test
    public void test_convert() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        System.out.println("测试结果：" + husband);
    }

    @Test
    public void test_StringToIntegerConverter() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer num = converter.convert("1234");
        System.out.println("测试结果：" + num);
    }

    @Test
    public void test_StringToNumberConverterFactory() {
        StringToNumberConverterFactory converterFactory = new StringToNumberConverterFactory();

        Converter<String, Integer> stringToIntegerConverter = converterFactory.getConverter(Integer.class);
        System.out.println("测试结果：" + stringToIntegerConverter.convert("1234"));

        Converter<String, Long> stringToLongConverter = converterFactory.getConverter(Long.class);
        System.out.println("测试结果：" + stringToLongConverter.convert("1234"));
    }

    private JdbcTemplate jdbcTemplate;

    @BeforeEach
    public void init() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        System.out.println("jdbcTemplate = " + jdbcTemplate);
    }

    @Test
    public void execute(){
        jdbcTemplate.execute("insert into user (id, userId, userHead, createTime, updateTime) values (100, '184172133','01_50', now(), now())");
    }

    @Test
    public void queryForListTest() {
        List<Map<String, Object>> allResult = jdbcTemplate.queryForList("select * from user");
        for (Map<String, Object> objectMap : allResult) {
            System.out.println("测试结果：" + objectMap);
        }
    }

}