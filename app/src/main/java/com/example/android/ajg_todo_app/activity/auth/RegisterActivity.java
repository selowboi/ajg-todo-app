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

public class RegisterActivity extends AppCompatActivity {

    Intent intent;
    EditText etFullName, etUsername, etEmail, etPassword;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        this.initView();
    }

    private void initView() {
        etFullName = (EditText) findViewById(R.id.register_et_full_name);
        etUsername = (EditText) findViewById(R.id.register_et_user_name);
        etEmail = (EditText) findViewById(R.id.register_et_email);
        etPassword = (EditText) findViewById(R.id.register_et_password);
        btnRegister = (Button) findViewById(R.id.register_btn_register);
        this.onClickBtnRegister();
    }

    private void onClickBtnRegister() {
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // handler empty input
                if (
                        etUsername.getText().toString().equals("")
                        || etPassword.getText().toString().equals("")
                        || etFullName.getText().toString().equals("")
                        || etEmail.getText().toString().equals("")
                ) {
                    Toast.makeText(v.getContext().getApplicationContext(), "Please fill in the registration form!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // handler check username & email

                intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}