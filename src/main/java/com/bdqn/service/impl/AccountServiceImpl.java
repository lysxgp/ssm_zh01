package com.bdqn.service.impl;

import com.bdqn.dao.AccountDao;
import com.bdqn.domain.Account;
import com.bdqn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
     AccountDao accountDao;



    @Override
    public List<Account> findAll() {
        System.out.println("service层的查询方法被调用了");
        return accountDao.findAll();
    }

    @Override
    public void addAccount(Account account) {
        System.out.println("service层的增加方法被调用了");
        accountDao.addAccount(account);
    }
}
