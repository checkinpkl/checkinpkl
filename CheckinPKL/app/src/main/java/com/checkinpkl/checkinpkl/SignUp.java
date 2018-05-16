package com.checkinpkl.checkinpkl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class SignUp extends AppCompatActivity {
    @BindView(R.id.buttonsignup)
    Button buttonsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @OnClick(R.id.buttonsignup)
    public void setButtonsignup() {
        Intent intent = new Intent(SignUp.this, Login.class);
        startActivity(intent);
        finish();
    }
}
