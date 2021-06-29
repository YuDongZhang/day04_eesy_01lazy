package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 *
 * 用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有用户,同时获取用户下所有的账户的信息
     * @return
     */
    List<User> findAll();

    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     * 根据名称模糊查询用户信息
     * @param username
     * @return
     */
    List<User> findByName(String username);

    /**
     * 更具传入的参数的条件
     * @param user 查询的条件有可能有 用户名 , 有可能有性别, 有可能什么都没有
     * @return
     */
    List<User> findUserByCondition(User user);


}
