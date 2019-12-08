package com.aris.yemekgetir.ui.auth.LoginActivities.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;

import com.aris.yemekgetir.R;

public class AxtarishYemek extends AppCompatActivity {
    private static final String TAG = "AxtarishYemek";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_axtarish_yemek);
        Log.e(TAG, "onCreate: " );
        Toolbar myChildToolbar =
                findViewById(R.id.toolbar);
        setSupportActionBar(myChildToolbar);

        // Get a support ActionBar corresponding to this toolbar
         myChildToolbar.setNavigationOnClickListener(view -> onBackPressed());
    }
}
