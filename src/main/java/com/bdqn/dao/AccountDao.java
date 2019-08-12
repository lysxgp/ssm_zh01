package com.bdqn.dao;

import com.bdqn.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    /**
     * 查询所有账户
     * @return
     */
    @Select("select * from account")
     List<Account> findAll();

    /**
     * 添加用户
     * @param account
     */
    @Insert("insert into account (name,money)values(#{name},#{money})")
    void addAccount(Account account);



}
