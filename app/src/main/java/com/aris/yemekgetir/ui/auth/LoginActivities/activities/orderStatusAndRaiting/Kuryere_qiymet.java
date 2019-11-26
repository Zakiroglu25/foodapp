package com.aris.yemekgetir.ui.auth.LoginActivities.activities.orderStatusAndRaiting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aris.yemekgetir.R;

public class Kuryere_qiymet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuryere_qiymet);
        Button button= findViewById(R.id.btn_reytinq_veriki);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kuryere_qiymet.this, Thanks.class);
                startActivity(intent);
            }
        });
    }
}
