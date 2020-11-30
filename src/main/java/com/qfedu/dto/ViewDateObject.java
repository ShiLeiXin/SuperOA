package com.qfedu.dto;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: JingWang
 * Date: 2020/9/3
 * Time: 17:29
 * Code introduction:
 */


public class ViewDateObject {
    private Date ctime;
    private Integer sums;

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getSums() {
        return sums;
    }

    public void setSums(Integer sums) {
        this.sums = sums;
    }

    @Override
    public String toString() {
        return "ViewDateObject{" +
                "ctime=" + ctime +
                ", sums=" + sums +
                '}';
    }
}
