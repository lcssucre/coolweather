package com.example.coolweather.model;

/**
 * Created by Administrator on 2016/9/6.
 */
public class County{
    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    public String getCountyCode(){
        return countyCode;
    }
    public void setCountyCode(String countyCode){
        this.countyCode = countyCode;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
    public int getCityId(){
        return cityId;
    }
}

