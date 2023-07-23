package cn.ming.mybatisframework;

import java.util.List;


/**
 * @Author: xuming
 * @Date: 2023-07-23 10:23
 * @Version: 1.0
 * @Description: SqlSession 接口
 **/
public interface SqlSession {

    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object parameter);

    <T> List<T> selectList(String statement);

    <T> List<T> selectList(String statement, Object parameter);

    void close();
}
