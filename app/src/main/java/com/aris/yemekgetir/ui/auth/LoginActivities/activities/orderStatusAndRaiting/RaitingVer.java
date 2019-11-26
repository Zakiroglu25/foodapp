package com.aris.yemekgetir.ui.auth.LoginActivities.activities.orderStatusAndRaiting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aris.yemekgetir.R;

public class RaitingVer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiting_ver);

        Button button= findViewById(R.id.reyting_ver);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RaitingVer.this, RaitingVerTwo.class);
                startActivity(intent);
            }
        });
}
}
