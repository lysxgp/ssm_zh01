package com.bdqn.controller;


import com.bdqn.domain.Account;
import com.bdqn.service.AccountService;
import com.bdqn.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("acount")
public class AccountController {
    @Resource
     AccountService accountService;

    //查询所有
    @RequestMapping("/list")
    public String list(Model model){
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account.toString());
        }
        model.addAttribute("list",list);

        return "list";
    }









}
