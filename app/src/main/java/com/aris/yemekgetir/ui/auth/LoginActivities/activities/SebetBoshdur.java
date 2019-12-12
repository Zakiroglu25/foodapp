package com.aris.yemekgetir.ui.auth.LoginActivities.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.auth.Authentication;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.auth.RegisterNo;

public class SebetBoshdur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebet_boshdur);

        Toolbar myChildToolbar =
                findViewById(R.id.toolbar);
        setSupportActionBar(myChildToolbar);


        myChildToolbar.setNavigationOnClickListener(view -> onBackPressed());


//        Button button = findViewById(R.id.restoranccakec);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SebetBoshdur.this, RegisterNo.class);
//                startActivity(intent);
//            }
//        });
    }
}
