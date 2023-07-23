package cn.ming.springframework;


import cn.ming.springframework.beans.factory.BeanFactory;
import cn.ming.springframework.context.support.ClassPathXmlApplicationContext;
import cn.ming.springframework.dao.IUserDao;
import cn.ming.springframework.po.User;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void test_ClassPathXmlApplicationContext() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserDao userDao = beanFactory.getBean("IUserDao", IUserDao.class);
        User user = userDao.queryUserInfoById(1L);
        System.out.println("测试结果：" + JSON.toJSONString(user));
    }

}
