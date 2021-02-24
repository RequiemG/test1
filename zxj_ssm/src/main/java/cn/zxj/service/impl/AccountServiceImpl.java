package cn.zxj.service.impl;

import cn.zxj.domain.Account;
import cn.zxj.mapper.AccountMapper;
import cn.zxj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements AccountService {

/*

    public void save(Account account){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            //获得session工厂对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //获得session会话对象
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            //执行操作 参数：namespace+id
            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            mapper.save(account);
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
*/
    /*
    public List<Account> findAll() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            //获得session工厂对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //获得session会话对象
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            //执行操作 参数：namespace+id
            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            List<Account> all = mapper.findAll();
            sqlSession.close();
            return all;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    */

    @Autowired
    private AccountMapper accountMapper;

    public void save(Account account){
        accountMapper.save(account);
    }

    public List<Account> findAll() {
        List<Account> all = accountMapper.findAll();
        return all;
    }
}
