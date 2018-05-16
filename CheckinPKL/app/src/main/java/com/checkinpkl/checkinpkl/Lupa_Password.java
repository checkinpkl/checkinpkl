package com.checkinpkl.checkinpkl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Lupa_Password extends AppCompatActivity {
    @BindView(R.id.buttonsend)
    Button buttonsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa__password);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonsend)
    public void setButtonsend() {
        Intent intent = new Intent(Lupa_Password.this, Login.class);
        startActivity(intent);
        finish();
    }
}
