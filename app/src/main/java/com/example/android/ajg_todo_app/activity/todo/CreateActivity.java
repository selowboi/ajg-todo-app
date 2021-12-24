package com.example.android.ajg_todo_app.activity.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.ajg_todo_app.R;

public class CreateActivity extends AppCompatActivity {

    Intent intent;
    EditText etName, etDescription;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        this.initView();
    }

    private void initView() {
        etName = (EditText) findViewById(R.id.create_et_name);
        etDescription = (EditText) findViewById(R.id.create_et_description);
        btnSave = (Button) findViewById(R.id.create_btn_save);
        this.onClickBtnSave();
    }

    private void onClickBtnSave() {
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // validasi data


                // masukkin ke db


                // kalo berhasil create, pindah activity
                intent = new Intent(CreateActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}