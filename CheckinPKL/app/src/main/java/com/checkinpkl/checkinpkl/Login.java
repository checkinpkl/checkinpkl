package com.checkinpkl.checkinpkl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login extends AppCompatActivity {
    @BindView(R.id.signup)
    TextView signup;
    @BindView(R.id.lupapassword)
    TextView lupapassword;
    @BindView(R.id.buttonsignin)
    Button buttonsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.signup)
    public void setSignup() {
        Intent intent = new Intent(Login.this, SignUp.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.lupapassword)
    public void setLupapassword() {
        Intent intent = new Intent(Login.this, Lupa_Password.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.buttonsignin)
    public void setButtonsignin() {
        Intent intent = new Intent(Login.this, Beranda.class);
        startActivity(intent);
        finish();
    }

}
