package com.example.android.ajg_todo_app.activity.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.ajg_todo_app.R;

public class UpdateActivity extends AppCompatActivity {

    Intent intent;
    EditText etName, etDescription;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

    }

    private void initView() {
        etName = (EditText) findViewById(R.id.update_et_name);
        etDescription = (EditText) findViewById(R.id.update_et_description);
        btnSave = (Button) findViewById(R.id.update_btn_save);
        this.onClickBtnSave();
    }

    private void onClickBtnSave() {
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // validasi data


                // update ke db


                // kalo update berhasil, pindah activity
                intent = new Intent(UpdateActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}