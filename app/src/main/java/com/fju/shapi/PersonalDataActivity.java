package com.fju.shapi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
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
    int count = 0;

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
        count = 0;
    }
    public void save(View view) {
        findViews();
        String tmpName = edName.getText().toString();
        String tmpGender = edGender.getText().toString();
        String tmpBirth = edBirth.getText().toString();
        String tmpTel = edTel.getText().toString();
        String tmpAddress = edAddress.getText().toString();
        if (!tmpAddress.equals(personalData.getAdress())||!tmpBirth.equals(personalData.getBirth())||!tmpGender.equals(personalData.getGender())||!tmpName.equals(personalData.getName())||!tmpTel.equals(personalData.getTel())){
            count++;
        }
        if(count !=0) {
            new AlertDialog.Builder(this)
                    .setTitle("You sure?")
                    .setMessage("PersonalData was changed,please check.")
                    .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                    .setPositiveButton("got it", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    String name = edName.getText().toString();
                                    String gender = edGender.getText().toString();
                                    String birth = edBirth.getText().toString();
                                    String tel = edTel.getText().toString();
                                    String address = edAddress.getText().toString();
                                    getSharedPreferences("userPersonalData", MODE_PRIVATE)
                                            .edit()
                                            .putString("USERNAME", name)
                                            .putString("USERGENDER", gender)
                                            .putString("USERBIRTH", birth)
                                            .putString("USERTEL", tel)
                                            .putString("USERADDRESS", address)
                                            .commit();
                                }
                            }

                    ).show();

        }
    }
    public  void home(View view) {
        if(count != 0){
            new AlertDialog.Builder(this)
                    .setTitle("Data not save!!")
                    .setMessage("Your data haven't saved now,would you steel want to got out?")
                    .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                        @Override
                        //幫我看看這樣寫ok嗎?
                        public void onClick(DialogInterface dialog, int which) {
                            Intent home = new Intent(PersonalDataActivity.this,MainActivity.class);
                            startActivity(home);
                        }
                    }).setNegativeButton("no", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }).show();

        }


    }
}
