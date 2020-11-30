package com.qfedu.dao;

import com.qfedu.entity.Reimbursement;
import com.qfedu.vo.ReimbursementVo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ReimbursementDao {
    List<ReimbursementVo> selectAllReimbursement(@Param("name") String name, @Param("beginTime") Date beginTime,
                                                 @Param("endTime") Date endTime);

    void addReimbursement(Reimbursement reimbursement);

    void deleteReimbursementById(String id);

    void deleteReimbursementByIds(List<String> list);
}
