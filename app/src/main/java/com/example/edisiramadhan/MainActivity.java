package com.example.edisiramadhan;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.edt_username);
        editText2 = (EditText) findViewById(R.id.edt_password);
        btnlogin = (Button) findViewById(R.id.btn_signin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().toString().equals("Dery")
                && editText2.getText().toString().equals("12345")){
                    Toast.makeText(getApplicationContext(),"Berhasil Login",
                            Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this,Login.class);
                    startActivity(i);
                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password Anda Salah!")
                            .setNegativeButton("Retry", null).create().show();
                }
            }
        });
    }
}
