package com.qfedu.dao;

import com.qfedu.dto.AdviceUser;
import com.qfedu.dto.ViewDateObject;
import com.qfedu.entity.Advice;
import com.qfedu.vo.AdviceVO;
import com.qfedu.vo.EchartsVO;

import java.util.List;

public interface AdviceDao {
    List<AdviceVO> selectByUid(AdviceVO adviceVO);

    void deleteById(Integer id);

    void deleteByIds(List list);

    void addAdvice(Advice advice);

    Advice selectById(Integer id);

    void updateAdvice(Advice advice);

    List<AdviceUser> selectCount();

    List<ViewDateObject> echarts();

    List<EchartsVO> echartsAdmin();
}
