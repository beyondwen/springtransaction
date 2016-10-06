package service.impl;

import dao.AccountDao;
import service.AccountService;

/**
 * Created by lenovo on 2016/10/06.
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String from, String to, Double money) {
        accountDao.transferOut(from, money);
        accountDao.transferIn(to, money);
    }
}
