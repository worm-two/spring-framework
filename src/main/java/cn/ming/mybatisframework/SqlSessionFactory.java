package cn.ming.mybatisframework;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:23
 * @Version: 1.0
 * @Description: SqlSessionFactory
 **/
public interface SqlSessionFactory {

    SqlSession openSession();

}
