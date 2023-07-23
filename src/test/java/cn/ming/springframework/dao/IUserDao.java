package cn.ming.springframework.dao;


import cn.ming.springframework.po.User;

public interface IUserDao {

     User queryUserInfoById(Long id);

}
