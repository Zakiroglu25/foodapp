package com.aris.yemekgetir.ui.auth.LoginActivities.activities.bankActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.FloatingViewService;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.orderStatusAndRaiting.OrderStatus;

public class NagdOdenis extends AppCompatActivity {
    private static final int CODE_DRAW_OVER_OTHER_APP_PERMISSION = 2084;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nagd_odenis);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !Settings.System.canWrite(this)) {

            Intent intent = new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS,
                    Uri.parse("package:" + getPackageName()));
            startActivityForResult(intent, CODE_DRAW_OVER_OTHER_APP_PERMISSION);
        }

//        Log.e(TAG, "onCreate:  static locale "+locale );
//
//
//        locale = "Bextiyar";
//
//        SharedPrefManager.with(this).setAppLang("Bextiyar").apply();
//
//        Log.e(TAG, "onCreate:  static locale "+locale );
//        Log.e(TAG, "onCreate:   shared pref "+SharedPrefManager.getAppLocale(this) );
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !Settings.canDrawOverlays(this)) {


            //If the draw over permission is not available open the settings screen
            //to grant the permission.
            Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                    Uri.parse("package:" + getPackageName()));
            startActivityForResult(intent, CODE_DRAW_OVER_OTHER_APP_PERMISSION);
        } else {
            initializeView();
        }
    }
    /**
     * Set and initialize the view elements.
     */
    private void initializeView() {
        findViewById(R.id.yemek_getir).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NagdOdenis.this,OrderStatus.class));
                startService(new Intent(NagdOdenis.this, FloatingViewService.class));
                finish();
            }
        });
    }

    private static final String TAG = "MainActivity";


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CODE_DRAW_OVER_OTHER_APP_PERMISSION) {
            //Check if the permission is granted or not.

            Log.e(TAG, "onActivityResult: "+resultCode );
            if (resultCode == RESULT_OK) {
                initializeView();
            } else { //Permission is not available
                Toast.makeText(this,
                        "Draw over other app permission not available. Closing the application",
                        Toast.LENGTH_SHORT).show();

                finish();
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

//        Button button = findViewById(R.id.yemek_getir);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(NagdOdenis.this, OrderStatus.class);
//                startActivity(intent);
//            }
//        });
    }

