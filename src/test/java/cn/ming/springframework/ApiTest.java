package cn.ming.springframework;


import cn.ming.springframework.bean.Husband;
import cn.ming.springframework.bean.IUserService;
import cn.ming.springframework.bean.Wife;
import cn.ming.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

    @Test
    public void circular() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        Wife wife = applicationContext.getBean("wife", Wife.class);
        System.out.println("老公的媳妇：" + husband.queryWife());
        System.out.println("媳妇的老公：" + wife.queryHusband());
    }

}