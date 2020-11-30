package com.qfedu.dao;

import com.qfedu.entity.Employee;
import com.qfedu.vo.EmployeeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: Wufeng
 * @date: 2020/9/1 14:36
 * @description:
 */
public interface EmployeeDao {
    /*
     * 添加员工
     *
     * @param employee 要添加的员工
     * */
    public void addEmployee(Employee employee);

    public void update(Employee employee);

    List<EmployeeVO> selectFuzzy(Employee employee);

    int deleteByIds(@Param("ids") String str);
}
