package com.qfedu.vo;

import java.util.List;

public class DeptEcharts {
    private List<String> deptName;
    private List<Integer> deptCount;

    public List<String> getDeptName() {
        return deptName;
    }

    public void setDeptName(List<String> deptName) {
        this.deptName = deptName;
    }

    public List<Integer> getDeptCount() {
        return deptCount;
    }

    public void setDeptCount(List<Integer> deptCount) {
        this.deptCount = deptCount;
    }
}
