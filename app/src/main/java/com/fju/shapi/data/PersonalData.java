package com.fju.shapi.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import java.util.Arrays;
import java.util.List;

public class PersonalData {
String name;
String birth;
String gender;
String adress;
String tel;
SharedPreferences settings;
Context context;
    public PersonalData(Context context) {
        this.context = context;
        settings = context.getSharedPreferences("userPersonalData",Context.MODE_PRIVATE);
    }

    public String getName() {
        return settings.getString("USERNAME",null);
    }

    public void setName(String name) {
        settings.edit().putString("USERNAME",name).apply();
        this.name = name;
    }

    public String getBirth() {
        return settings.getString("USERBIRTH",null);
    }

    public void setBirth(String birth) {
        settings.edit().putString("USERBIRTH",birth).apply();
        this.birth = birth;
    }


    public String getGender() {
        return settings.getString("USERGENDER",null);
    }

    public void setGender(String gender) {
        settings.edit().putString("USERGENDER",gender).apply();
        this.gender = gender;
    }

    public String getAdress() {
        return settings.getString("USERADDRESS",null);
    }

    public void setAdress(String adress) {
        settings.edit().putString("USERADDRESS",adress).apply();
        this.adress = adress;
    }

    public String getTel() {
        return settings.getString("USERTEL",null);
    }

    public void setTel(String tel) {
        settings.edit().putString("USERTEL",tel).apply();
        this.tel = tel;
    }



}
