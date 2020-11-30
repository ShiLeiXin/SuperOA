package com.qfedu.dao;

import com.qfedu.entity.BankAccount;
import com.qfedu.vo.BankAccountVo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface BankAccountDao {
    List<BankAccountVo> selectBankAccount(@Param("name") String name, @Param("beginTime") Date beginTime,
                                          @Param("endTime") Date endTime);


    void addAccount(BankAccount bankAccount);

    void deleteAccountById(String id);

    void deleteAccountByIds(List<String> list);

    void updateAccount(BankAccount bankAccount);
}
