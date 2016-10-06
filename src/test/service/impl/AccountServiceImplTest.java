package service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.AccountService;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2016/10/06.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountServiceImplTest {

    @Autowired
    @Qualifier("accountServiceProxy")
    private AccountService accountService;

    @Test
    public void transferOut() throws Exception {
        accountService.transfer("aaa","bbb",100d);
    }

}