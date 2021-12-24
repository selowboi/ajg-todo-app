package com.example.android.ajg_todo_app.activity.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.ajg_todo_app.R;

public class WelcomeActivity extends AppCompatActivity {

    Button btnRegister, btnLogin;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        this.initView();
    }

    private void initView() {
        btnLogin = (Button) findViewById(R.id.welcome_btn_login);
        btnRegister = (Button) findViewById(R.id.welcome_btn_register);
        this.onClickBtnLogin();
        this.onClickBtnRegister();
    }

    private void onClickBtnLogin() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void onClickBtnRegister() {
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(WelcomeActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}