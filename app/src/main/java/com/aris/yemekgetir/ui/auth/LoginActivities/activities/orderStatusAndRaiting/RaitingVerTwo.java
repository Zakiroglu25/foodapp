package com.aris.yemekgetir.ui.auth.LoginActivities.activities.orderStatusAndRaiting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.MainActivity;

public class RaitingVerTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiting_ver_two);

        Button button= findViewById(R.id.kuryere_qiymet_ver);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RaitingVerTwo.this, Kuryere_qiymet.class);
                startActivity(intent);
            }
        });
        Button button1= findViewById(R.id.restoranlara_kec);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RaitingVerTwo.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
