package dao.impl;

import dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by lenovo on 2016/10/06.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    /**
     * 转出
     *
     * @param from  转给谁
     * @param money 转多少钱
     */
    public void transferOut(String from, Double money) {
        String sql = "update account set money = money-? where name = ?";
        this.getJdbcTemplate().update(sql, money, from);
    }

    /**
     * 转进
     *
     * @param to    谁转来的
     * @param money 转多少钱
     */
    public void transferIn(String to, Double money) {
        String sql = "update account set money = money+? where name = ?";
        this.getJdbcTemplate().update(sql, money, to);
    }
}
