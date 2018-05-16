package com.example.acer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class login2 extends AppCompatActivity {
    @BindViews(R.id.buttonSignin)
    List<Button> buttonSignin;

    @Override
    public void onBackPressed() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonSignin)
    public void setButtonSignin(){
        Intent intent = new Intent(login2.this, Beranda.class);
        startActivity(intent);
        finish();
    }

}
