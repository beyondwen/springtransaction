package dao;

/**
 * Created by lenovo on 2016/10/06.
 */
public interface AccountDao {
    /**
     * 转出
     *
     * @param from    转给谁
     * @param money 转多少钱
     */
    void transferOut(String from, Double money);

    /**
     * 转进
     *
     * @param to  谁转来的
     * @param money 转多少钱
     */
    void transferIn(String to, Double money);
}
