package com.aris.yemekgetir.ui.auth.LoginActivities.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aris.yemekgetir.R;

public class RegisterNo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_no);


        Button button = findViewById(R.id.register_davamet_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterNo.this, RegisterCode.class);
                startActivity(intent);
            }
        });
    }
}
