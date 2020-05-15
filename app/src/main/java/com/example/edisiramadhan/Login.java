package com.example.edisiramadhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnMoveActivity = findViewById(R.id.btn_move_Activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnrun = findViewById(R.id.btn_run);
        btnrun.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_Activity:
                Intent moveIntent = new Intent(Login.this, MoveActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_run:
                Intent runIntent = new Intent(Login.this, run.class);
                startActivity(runIntent);
                break;

        }
    }
}
