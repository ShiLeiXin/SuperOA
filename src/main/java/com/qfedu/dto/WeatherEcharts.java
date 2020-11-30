package com.qfedu.dto;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: JingWang
 * Date: 2020/9/5
 * Time: 17:21
 * Code introduction:
 */


public class WeatherEcharts {
    private List<String> dayAir;
    private List<String> nightAir;
    private List<String> day;

    public List<String> getDayAir() {
        return dayAir;
    }

    public void setDayAir(List<String> dayAir) {
        this.dayAir = dayAir;
    }

    public List<String> getNightAir() {
        return nightAir;
    }

    public void setNightAir(List<String> nightAir) {
        this.nightAir = nightAir;
    }

    public List<String> getDay() {
        return day;
    }

    public void setDay(List<String> day) {
        this.day = day;
    }
}
