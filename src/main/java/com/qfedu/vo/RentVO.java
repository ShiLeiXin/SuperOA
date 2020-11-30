package com.qfedu.vo;

import java.util.Date;

public class RentVO {
    private Integer id;
    private Integer eid;
    private String itemId;
    private Integer tid;
    private Date itemOutDate;
    private Date agreedItemInDate;
    private Date rentInDate;
    private String remark;

    private String rentType;
    private String status;

    private String name;
    private String item;

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

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
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

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
