package service.impl;

import dao.AccountDao;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import service.AccountService;

/**
 * Created by lenovo on 2016/10/06.
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    private TransactionTemplate transactionTemplate;


    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void transfer(final String from, final String to, final Double money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                accountDao.transferOut(from, money);
                //int i = 1 / 0;
                accountDao.transferIn(to, money);
            }
        });
    }
}

