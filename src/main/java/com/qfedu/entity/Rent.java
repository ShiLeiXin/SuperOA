package com.qfedu.entity;

import java.util.Date;

public class Rent {
    private Integer id;
    private Integer eid;
    private Integer itemId;
    private Integer tid;
    private Date itemOutDate;
    private Date agreedItemInDate;
    private Date rentInDate;
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Date getItemOutDate() {
        return itemOutDate;
    }

    public void setItemOutDate(Date itemOutDate) {
        this.itemOutDate = itemOutDate;
    }

    public Date getAgreedItemInDate() {
        return agreedItemInDate;
    }

    public void setAgreedItemInDate(Date agreedItemInDate) {
        this.agreedItemInDate = agreedItemInDate;
    }

    public Date getRentInDate() {
        return rentInDate;
    }

    public void setRentInDate(Date rentInDate) {
        this.rentInDate = rentInDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
