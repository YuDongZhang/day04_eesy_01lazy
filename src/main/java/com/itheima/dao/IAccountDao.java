package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface IAccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();



}
