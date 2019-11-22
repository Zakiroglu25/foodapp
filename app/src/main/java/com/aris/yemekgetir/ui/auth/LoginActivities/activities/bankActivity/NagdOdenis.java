package com.aris.yemekgetir.ui.auth.LoginActivities.activities.bankActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.MainActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.auth.RegisterCode;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.orderStatus.OrderStatus;

public class NagdOdenis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nagd_odenis);

        Button button = findViewById(R.id.send_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NagdOdenis.this, OrderStatus.class);
                startActivity(intent);
            }
        });
    }
}
