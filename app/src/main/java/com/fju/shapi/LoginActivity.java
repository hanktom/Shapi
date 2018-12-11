package com.fju.shapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText edEmail;
    private EditText edPassword;
    private String email;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findView();

    }

    private void findView() {
        edEmail = findViewById(R.id.ed_email);
        edPassword = findViewById(R.id.ed_password);
        email = edEmail.getText().toString();
        password = edPassword.getText().toString();
        if("12345@gmail.com".equals(email) && "12345".equals(password)){
            getSharedPreferences("login",MODE_PRIVATE)
                    .edit()
                    .putString("Email",email)
                    .apply();
        }else {
            Toast.makeText(this, "xxx", Toast.LENGTH_LONG).show();
            edEmail.setText(" ");
            edPassword.setText(" ");
        }
    }


}
