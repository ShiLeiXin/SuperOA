package com.qfedu.vo;

import java.util.List;
import java.util.Map;

public class UserVO {

    private List<Integer> VOstatus;
    private List<Integer> statusCount;
    private List<Map<String,Object>> maps;

    public List<Integer> getVOstatus() {
        return VOstatus;
    }

    public void setVOstatus(List<Integer> VOstatus) {
        this.VOstatus = VOstatus;
    }

    public List<Integer> getStatusCount() {
        return statusCount;
    }

    public void setStatusCount(List<Integer> statusCount) {
        this.statusCount = statusCount;
    }

    public List<Map<String, Object>> getMaps() {
        return maps;
    }

    public void setMaps(List<Map<String, Object>> maps) {
        this.maps = maps;
    }
}
