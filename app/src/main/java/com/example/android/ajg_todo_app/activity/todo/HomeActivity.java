package com.example.android.ajg_todo_app.activity.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.android.ajg_todo_app.R;

public class HomeActivity extends AppCompatActivity {

    ImageButton ibSearch, ibAdd;
    EditText etSearch;
    Intent intent;
    RecyclerView rvTodos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.initView();
    }

    private void initView() {
        ibSearch = (ImageButton) findViewById(R.id.home_ib_search);
        ibAdd = (ImageButton) findViewById(R.id.home_ib_add);
        etSearch = (EditText) findViewById(R.id.home_et_search);
        rvTodos = (RecyclerView) findViewById(R.id.home_rv_todos);
        this.onClickBtnAdd();
        this.onClickBtnSearch();
    }

    private void onClickBtnAdd() {
        ibAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, CreateActivity.class);
                startActivity(intent);
            }
        });
    }

    private void onClickBtnSearch() {
        ibSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String query = etSearch.getText().toString();

                if (query.isEmpty()) {
                    return;
                }

                // search
            }
        });
    }
}