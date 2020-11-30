package com.qfedu.dao;

import com.qfedu.entity.Log;
import com.qfedu.vo.LogVO;
import com.qfedu.vo.LoginLogVO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface LogDao {
    List<LogVO> selectLog(LogVO logVO);
    List<LoginLogVO> selectLoginLog(@Param("beginTime") Date beginTime, @Param("endTime") Date endTime, @Param("loginName") String loginName);
    // 通过管理员id查询出最近一条登录记录
    LoginLogVO selectOneLoginLog(Integer uid);

    void addLoginLog(LoginLogVO loginLogVO);
    // 通过登录名 + 业务名字 + 操作类型  查询出最近一条操作记录
    Log selectOneLog(Log log);

    void addLog(Log log);
}
