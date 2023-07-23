package cn.ming.springframework;


import cn.ming.springframework.aop.AdvisedSupport;
import cn.ming.springframework.aop.TargetSource;
import cn.ming.springframework.aop.aspectj.AspectJExpressionPointcut;
import cn.ming.springframework.aop.framework.Cglib2AopProxy;
import cn.ming.springframework.bean.JdbcService;
import cn.ming.springframework.context.support.ClassPathXmlApplicationContext;
import cn.ming.springframework.jdbc.core.JdbcTemplate;
import cn.ming.springframework.jdbc.datasource.DataSourceTransactionManager;
import cn.ming.springframework.tx.transaction.annotation.AnnotationTransactionAttributeSource;
import cn.ming.springframework.tx.transaction.interceptor.TransactionInterceptor;
import com.alibaba.druid.pool.DruidDataSource;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.sql.SQLException;

public class ApiTest {


    private JdbcTemplate jdbcTemplate;
    private JdbcService jdbcService;
    private DataSource dataSource;

    @BeforeEach
    public void init() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        dataSource = applicationContext.getBean(DruidDataSource.class);
        jdbcService = applicationContext.getBean(JdbcService.class);
    }

    @Test
    public void test_Transaction() throws SQLException {
        AnnotationTransactionAttributeSource transactionAttributeSource = new AnnotationTransactionAttributeSource();
        transactionAttributeSource.findTransactionAttribute(jdbcService.getClass());

        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
        TransactionInterceptor interceptor = new TransactionInterceptor(transactionManager, transactionAttributeSource);

        // 组装代理信息
        AdvisedSupport advisedSupport = new AdvisedSupport();
        advisedSupport.setTargetSource(new TargetSource(jdbcService));
        advisedSupport.setMethodInterceptor(interceptor);
        advisedSupport.setMethodMatcher(new AspectJExpressionPointcut("execution(* cn.ming.springframework.bean.JdbcService.*(..))"));

        // 代理对象(Cglib2AopProxy)
        JdbcService proxy_cglib = (JdbcService) new Cglib2AopProxy(advisedSupport).getProxy();

        // 测试调用，有事务【不能同时提交2条有主键冲突的数据】
        proxy_cglib.saveData(jdbcTemplate);

        // 测试调用，无事务【提交2条有主键冲突的数据成功一条】
        // proxy_cglib.saveDataNoTransaction(jdbcTemplate);
    }
}