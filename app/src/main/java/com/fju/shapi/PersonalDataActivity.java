package com.fju.shapi;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.fju.shapi.data.DummyData;
import com.fju.shapi.data.PersonalData;

import java.util.ArrayList;
import java.util.List;

public class PersonalDataActivity extends AppCompatActivity {
    EditText edName;
    EditText edGender;
    EditText edBirth;
    EditText edTel;
    EditText edAddress;
    PersonalData personalData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);
        edName.setText(personalData.getName());
        edGender.setText(personalData.getGender());
        edBirth.setText(personalData.getBirth());
        edTel.setText(personalData.getTel());
        edAddress.setText(personalData.getAdress());
     }
    public void findViews() {
        edName = findViewById(R.id.ed_PD_name);
        edGender = findViewById(R.id.ed_PD_gender);
        edBirth = findViewById(R.id.ed_PD_birth);
        edTel = findViewById(R.id.ed_PD_tel);
        edAddress = findViewById(R.id.ed_PD_address);
    }
    public void save(View view){
        findViews();
        String name = edName.getText().toString();
        String gender = edGender.getText().toString();
        String birth = edBirth.getText().toString();
        String tel = edTel.getText().toString();
        String address = edAddress.getText().toString();
        getSharedPreferences("userPersonalData",MODE_PRIVATE)
                .edit()
                .putString("USERNAME",name)
                .putString("USERGENDER",gender)
                .putString("USERBIRTH",birth)
                .putString("USERTEL",tel)
                .putString("USERADDRESS",address)
                .commit();

    }

}
