package com.aris.yemekgetir.ui.auth.LoginActivities.activities.drawermenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.aris.yemekgetir.R;

public class KuryerOl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuryer_ol);
        Toolbar myChildToolbar =
                findViewById(R.id.toolbar);
        setSupportActionBar(myChildToolbar);
        myChildToolbar.setNavigationOnClickListener(view -> onBackPressed());

    }
}
