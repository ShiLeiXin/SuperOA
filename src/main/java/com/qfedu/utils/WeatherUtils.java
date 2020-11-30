package com.qfedu.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.qfedu.dto.WeatherEcharts;
import com.qfedu.dto.dayWeather;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: JingWang
 * Date: 2020/9/5
 * Time: 15:59
 * Code introduction:
 */


public class WeatherUtils {
    public static List<dayWeather> selectWea(String ip){
        String host = "https://saweather.market.alicloudapi.com";
        String path = "/spot-to-weather";
        String method = "GET";
        String appcode = "4c80b55812bb465bafb6773a8dcff8a5";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("area", "郑州");
        querys.put("need3HourForcast", "0");
        querys.put("needAlarm", "0");
        querys.put("needHourData", "0");
        querys.put("needIndex", "0");
        querys.put("needMoreDay", "1");
        HttpResponse response;

        
        List<dayWeather> dayWeatherList = new ArrayList<>();

        try {
            response = HttpUtils.doGet(host, path, method, headers, querys);

            String str = EntityUtils.toString(response.getEntity());

            Map maps = (Map) JSON.parse(str);

            Map mapees = (Map) JSON.parse(String.valueOf(maps.get("showapi_res_body")));

            //System.out.println(mapees);
            Map<String,String> ma = new HashMap<>();
            ma.put("1",mapees.get("f1").toString());
            ma.put("2",mapees.get("f2").toString());
            ma.put("3",mapees.get("f3").toString());
            ma.put("4",mapees.get("f4").toString());
            ma.put("5",mapees.get("f5").toString());
            ma.put("6",mapees.get("f6").toString());
            ma.put("7",mapees.get("f7").toString());



            for (int i= 1;i<=ma.size();i++ ){
                String key = Integer.toString(i);
                String str1 = String.valueOf(ma.get(key));
                dayWeather daywea = JSONArray.parseObject(str1, dayWeather.class);
                dayWeatherList.add(daywea);
            }

            //System.out.println(dayWeatherList);



        } catch (Exception e) {
            e.printStackTrace();
        }
        return dayWeatherList;

    }



    public static WeatherEcharts selectWeaq(String ip){
        WeatherEcharts we = new WeatherEcharts();
        List<String> dayList = new ArrayList<>();
        List<String> dayAirList = new ArrayList<>();
        List<String> nightAirList = new ArrayList<>();

        List<dayWeather> dayWeatherList = selectWea(ip);



        //System.out.println(dayWeatherList.size());

        for (int i = 0;i < dayWeatherList.size();i++){
            dayAirList.add(dayWeatherList.get(i).getDay_air_temperature());
            nightAirList.add(dayWeatherList.get(i).getNight_air_temperature());
            dayList.add(dayWeatherList.get(i).getDay());
        }

        we.setNightAir(nightAirList);
        we.setDayAir(dayAirList);
        we.setDay(dayList);

        return we;
    }
}

