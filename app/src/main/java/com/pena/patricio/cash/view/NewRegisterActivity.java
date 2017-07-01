package com.pena.patricio.cash.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.pena.patricio.cash.HomeActivity;
import com.pena.patricio.cash.R;

public class NewRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_register);
    }

    public void backHome (View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
