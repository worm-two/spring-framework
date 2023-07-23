package cn.ming.springframework.bean;

import cn.ming.springframework.jdbc.core.JdbcTemplate;
import cn.ming.springframework.tx.transaction.annotation.Transactional;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:58
 * @Version: 1.0
 * @Description: TODO
 **/
public class JdbcService {

    /**
     * 使用注解事务
     */
    @Transactional(rollbackFor = Exception.class)
    public void saveData(JdbcTemplate jdbcTemplate) {
        jdbcTemplate.execute("insert into user (id, userId, userHead, createTime, updateTime) values (1, '184172133','01_50', now(), now())");
        jdbcTemplate.execute("insert into user (id, userId, userHead, createTime, updateTime) values (1, '184172133','01_50', now(), now())");
    }

    public void saveDataNoTransaction(JdbcTemplate jdbcTemplate) {
        jdbcTemplate.execute("insert into user (id, userId, userHead, createTime, updateTime) values (1, '184172133','01_50', now(), now())");
        jdbcTemplate.execute("insert into user (id, userId, userHead, createTime, updateTime) values (1, '184172133','01_50', now(), now())");
    }

}