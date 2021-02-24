package cn.zxj.controller;

import cn.zxj.domain.Account;
import cn.zxj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Resource(description = "accountService")
    private AccountService accountService;


    // 保存
    @RequestMapping(value="/save",produces = "text/html;charset=UTF-8")
//    @ResponseBody
    public String save(Account account) throws IOException {
        //需要用到service层的内容,需要注入;这里的参数是表格传过来的
        accountService.save(account);
        return "success";
    }










    // 查询
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList",accountList);
        modelAndView.setViewName ("accountlist");
        return modelAndView;
    }
}
