package com.qfedu.vo;

import java.util.List;

/**
 * @author HZF
 */
public class JobEcharts {
    private List<String> name;
    private List<Integer> jobCount;

    public JobEcharts() {
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<Integer> getJobCount() {
        return jobCount;
    }

    public void setJobCount(List<Integer> jobCount) {
        this.jobCount = jobCount;
    }
}
