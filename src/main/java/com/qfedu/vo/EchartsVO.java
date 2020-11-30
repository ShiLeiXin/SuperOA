package com.qfedu.vo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: JingWang
 * Date: 2020/9/3
 * Time: 19:11
 * Code introduction:
 */


public class EchartsVO {
    private List<String> ctime;
    private List<Integer> sums;

    public List<String> getCtime() {
        return ctime;
    }

    public void setCtime(List<String> ctime) {
        this.ctime = ctime;
    }

    public List<Integer> getSums() {
        return sums;
    }

    public void setSums(List<Integer> sums) {
        this.sums = sums;
    }

    @Override
    public String toString() {
        return "EchartsVO{" +
                "ctime=" + ctime +
                ", sums=" + sums +
                '}';
    }
}
