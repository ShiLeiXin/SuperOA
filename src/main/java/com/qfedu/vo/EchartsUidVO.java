package com.qfedu.vo;

/**
 * Created by IntelliJ IDEA.
 * User: JingWang
 * Date: 2020/9/3
 * Time: 19:51
 * Code introduction:
 */


public class EchartsUidVO {

    private Integer value;
    private Integer name;

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EchartsUidVO{" +
                "name=" + name +
                ", value=" + value +
                '}';
    }
}
