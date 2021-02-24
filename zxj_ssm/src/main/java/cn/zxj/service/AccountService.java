package cn.zxj.service;

import cn.zxj.domain.Account;

import java.io.IOException;
import java.util.List;

public interface AccountService {
    public void save(Account account) throws IOException;
    public List<Account> findAll();
}
