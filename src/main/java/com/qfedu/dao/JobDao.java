package com.qfedu.dao;

import com.qfedu.entity.Job;
import com.qfedu.vo.JobInfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author HZF
 */
public interface JobDao {
    /**
     * 查询所有员工的职位信息进行展示
     * @param leadName 领导名字
     * @param position 部门名字
     * @return 查找到的数据
     */
    public List<JobInfoVO> selectAllJob(@Param("leadName") String leadName, @Param("position") String position);

    /**
     * 查询数据库中所有职称
     * @return 返回查找到的数据
     */
    public List<Job> selectJobName();

    /**
     * 添加一个职位类型到职位数据库中
     * @param job 前端页面传过来的职位类型和描述
     */
    public void addJobType(Job job);

    /**
     * 通过员工表查出所对应的职位id
     * @param id 员工id
     * @return 职位id
     */
    public int selectJobId(Integer id);

    /**
     * 删除职称类型
     * @param id 通过id
     */
    public void deleteJobType(Integer id);

    /**
     * 查找相应的数据并返回
     * @return 返回查找到的对应图表信息
     */
    public List<JobInfoVO> selectJobEchartsInfo();
}
