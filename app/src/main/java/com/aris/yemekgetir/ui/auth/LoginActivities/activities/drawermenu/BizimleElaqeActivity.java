package com.aris.yemekgetir.ui.auth.LoginActivities.activities.drawermenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.aris.yemekgetir.R;

public class BizimleElaqeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bizimle_elaqe);

        Toolbar myChildToolbar =
                findViewById(R.id.toolbar);
        setSupportActionBar(myChildToolbar);

        // Get a support ActionBar corresponding to this toolbar
        myChildToolbar.setNavigationOnClickListener(view -> onBackPressed());
    }
}
