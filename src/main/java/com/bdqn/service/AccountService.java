package com.bdqn.service;

import com.bdqn.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();


    void addAccount(Account account);


}
