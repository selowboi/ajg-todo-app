package com.example.android.ajg_todo_app.activity.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android.ajg_todo_app.R;
import com.example.android.ajg_todo_app.activity.todo.HomeActivity;

public class LoginActivity extends AppCompatActivity {

    Intent intent;
    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.initView();
    }

    private void initView() {
        etUsername = (EditText) findViewById(R.id.login_et_user_name);
        etPassword = (EditText) findViewById(R.id.login_et_password);
        btnLogin = (Button) findViewById(R.id.login_btn_login);
        this.onClickBtnLogin();
    }

    private void onClickBtnLogin() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // handler empty input
                if (
                    etUsername.getText().toString().equals("")
                    || etPassword.getText().toString().equals("")
                ) {
                    Toast.makeText(v.getContext().getApplicationContext(), "Username or Password can't be empty!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // handler username or password invalid


                intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }


}