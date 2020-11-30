package com.qfedu.dao;


import com.qfedu.entity.Dept;
import com.qfedu.vo.DeptVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptDao {
    List<DeptVO> selectDept(@Param(value = "dname") String dname);

    void deleteDeptById(String did);

    void deleteDeptByIds(List<String> list);

    void addDept(Dept dept);

    void updateDept(Dept dept);

    List<DeptVO> selectDeptEcharts();

    List<DeptVO> selectDeptExcel();

    Dept selectDeptByEid(int eid);
}
