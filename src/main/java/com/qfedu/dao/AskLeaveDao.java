package com.qfedu.dao;

import com.qfedu.entity.AskLeave;
import com.qfedu.vo.AskLeaveVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AskLeaveDao {

    int add(AskLeave askLeave);

    int update(AskLeave askLeave);

    List<AskLeaveVO> select(AskLeave askLeave);

    int delete(AskLeave askLeave);

    int deleteByIds(@Param("ids") String ids);

    List<AskLeaveVO> selectAllType();
}
