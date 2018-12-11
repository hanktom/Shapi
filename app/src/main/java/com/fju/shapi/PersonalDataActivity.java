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

import java.util.ArrayList;
import java.util.List;

public class PersonalDataActivity extends AppCompatActivity {
    EditText edValue;
    TextView tvName;
    List<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);
     }
    public void findViews() {

    }


}
