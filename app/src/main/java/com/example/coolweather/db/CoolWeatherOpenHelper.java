package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/9/6.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    //Province建表语句
    public static final String CREATE_PROVINCE = "create table Province("
            + "id integer primary key autoincrement, "
            + "province_name text"
            + "province_code text)";

    //City建表语句
    public static final String CREATE_CITY = "create table City("
            + "id integer primary key autoincrement, "
            + "city_name text"
            + "city_code text,"
            + "province_code text)";

    //County建表语句
    public static final String CREATE_COUNTY = "create table County("
            + "id integer primary key autoincrement, "
            + "county_name text"
            + "county_code text,"
            + "city_code text)";
    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,name, factory, version);  //name就是数据库名；version是版本号，用于更新
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_PROVINCE);//创建Province表
        db.execSQL(CREATE_CITY);//创建City表
        db.execSQL(CREATE_COUNTY);//创建County表
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
