package com.aris.yemekgetir.ui.auth.LoginActivities.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.auth.Authentication;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.auth.RegisterNo;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.mapview.MapView;

public class SearchResult extends AppCompatActivity {

    private MapView mapview;

    // Specify the name of the activity in place of map.    setContentView (R. layout.map);
    //
    private final String MAPKIT_API_KEY = "b7f7137a-58ad-44ce-8612-76b1910cfc0d";
    private final Point TARGET_LOCATION = new Point(59.945933, 30.320045);

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MapKitFactory.setApiKey(MAPKIT_API_KEY);
        MapKitFactory.initialize(this);


        setContentView(R.layout.activity_search_result);


        Button button = findViewById(R.id.button_unvan_deish);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchResult.this, UnvanDeish.class);
                startActivity(intent);
            }
        });
        Button button1 = findViewById(R.id.men_burdayam);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchResult.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Toolbar myChildToolbar =
                findViewById(R.id.toolbar);
        setSupportActionBar(myChildToolbar);



        mapview = findViewById(R.id.mapview);

        mapview.getMap().move(
                new CameraPosition(TARGET_LOCATION, 14.0f, 0.0f, 0.0f),
                new Animation(Animation.Type.SMOOTH, 0),
                null);

//        Toolbar myChildToolbar =
//                findViewById(R.id.toolbar);
//        setSupportActionBar(myChildToolbar);
//
//
//        myChildToolbar.setNavigationOnClickListener(view -> onBackPressed());

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        if (ab != null) {
            ab.setDisplayHomeAsUpEnabled(true);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.add_menu, menu);
        return true;
    }

    @Override
    protected void onStop() {
        // Activity onStop call must be passed to both MapView and MapKit instance.
        mapview.onStop();
        MapKitFactory.getInstance().onStop();
        super.onStop();
    }

    @Override
    protected void onStart() {
        // Activity onStart call must be passed to both MapView and MapKit instance.
        super.onStart();
        MapKitFactory.getInstance().onStart();
        mapview.onStart();
    }
}


