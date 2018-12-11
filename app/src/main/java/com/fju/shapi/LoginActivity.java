package com.fju.shapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    private EditText edEmail;
    private EditText edPassword;
    private String email;
    private String password;
    private TextView edAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findView();
        String email  = getSharedPreferences("login" , MODE_PRIVATE).getString("Email", " ");
        edEmail.setText(email);
    }

    private void findView() {
        edEmail = findViewById(R.id.ed_email);
        edPassword = findViewById(R.id.ed_password);
        edAlert = findViewById(R.id.ed_alert);


    }

    public void cancel(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void login(View view){
        findView();
        email = edEmail.getText().toString();
        password = edPassword.getText().toString();

        if("12345".equals(email) && "12345".equals(password)){
            getSharedPreferences("login",MODE_PRIVATE)
                    .edit()
                    .putString("Email",email)
                    .apply();
            setResult(RESULT_OK);
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else {
//            edAlert.setText("xxx");
            Toast xToast = Toast.makeText(this,"登入失敗xxx",Toast.LENGTH_LONG);
            xToast.setGravity(Gravity.TOP|Gravity.LEFT, 10, 850);
            xToast.show();
           // Toast.makeText(this, "xxx", Toast.LENGTH_LONG).show();
            edEmail.setText(" ");
            edPassword.setText(" ");
        }
    }

}
