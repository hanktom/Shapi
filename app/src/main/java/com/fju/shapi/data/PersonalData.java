package com.fju.shapi.data;

import java.util.Arrays;
import java.util.List;

public class PersonalData {
String name;
String birth;
String gender;
String adress;
String tel;

    public PersonalData() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public PersonalData(String name, String birth, String gender, String adress, String tel) {

        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.adress = adress;
        this.tel = tel;
    }

}
