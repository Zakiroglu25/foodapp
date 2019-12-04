package com.aris.yemekgetir.ui.auth.LoginActivities.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.drawermenu.BizimleElaqeActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.drawermenu.HaqqimizdaActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.drawermenu.KuryerOl;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.drawermenu.MessageActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.drawermenu.ProfilimActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.drawermenu.PromokodActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.drawermenu.SifarishleriPlanlashdir;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.drawermenu.SifarishlerimActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.drawermenu.UnvanActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.adapter.ExpandleListAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar.AksiyalarFragment;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish.AxtarishFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    DrawerLayout drawer;
    BottomNavigationView bottomNavView;
    NavigationView navView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


initViews();
        // setting list adapter
    }

    /*
     * Preparing the list data
     */


    private void initViews() {
        drawer = findViewById(R.id.drawer_layout);
        bottomNavView = findViewById(R.id.bottom_nav_view);
        navView = findViewById(R.id.nav_view_drawer);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(bottomNavView, navController);
        navView.setNavigationItemSelectedListener(navigationItemSelectedListener());
    }

    private NavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener() {
        return menuItem -> {

            switch (menuItem.getItemId()) {
                case R.id.nav_profilim:
                    startActivity(new Intent(this, ProfilimActivity.class));
                    break;
                case R.id.nav_bizimleElaqe:
                    startActivity(new Intent(this, BizimleElaqeActivity.class));
                    break;
                case R.id.nhaav_haqqimizda:
                    startActivity(new Intent(this, HaqqimizdaActivity.class));
                    break;
                case R.id.nav_sifarislerim:
                    startActivity(new Intent(this, SifarishlerimActivity.class));
                    break;
                case R.id.nav_unvanlarim:
                    startActivity(new Intent(this, UnvanActivity.class));
                    break;
                case R.id.nav_promokod:
                    startActivity(new Intent(this, PromokodActivity.class));
                    break;
                case R.id.nav_kuryerol:
                    startActivity(new Intent(this, KuryerOl.class));
                    break;
                case R.id.nav_bildirisler:
                    startActivity(new Intent(this, MessageActivity.class));

                    break;case R.id.nav_planlashdir:
                    startActivity(new Intent(this, SifarishleriPlanlashdir.class));
                    break;
                default:
                    Toast.makeText(this, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                    break;
            }
            return true;
        };
    }

    public void toolbarClick(View view) {
        switch (view.getId()) {
            case R.id.toolbar_menu_iv:
                drawer.openDrawer(GravityCompat.START);
                break;
//            case R.id.toolbar_message_iv:
//                ImageView imageView = findViewById(R.id.toolbar_message_iv);
//                imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent intent = new Intent(MainActivity.this,MessageActivity.class);
//                        startActivity(intent);
//                    }
//                });
//                break;
        }
    }
        public TextView txtView;

       private void itil(){
            // Button1
            final Button btn1 = (Button) findViewById(R.id.btn_odemek_raiting);
            btn1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    ShowDialog();
                }
            });

        }

        public void ShowDialog()
        {
            final AlertDialog.Builder popDialog = new AlertDialog.Builder(this);
            final RatingBar rating = new RatingBar(this);
            rating.setMax(6);

            popDialog.setIcon(android.R.drawable.btn_star_big_on);
            popDialog.setTitle("Vote!! ");
            popDialog.setView(rating);

            // Button OK
            popDialog.setPositiveButton(android.R.string.ok,
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            txtView.setText(String.valueOf(rating.getProgress()));
                            dialog.dismiss();
                        }

                    })

                    // Button Cancel
                    .setNegativeButton("Cancel",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });

            popDialog.create();
            popDialog.show();

        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
           // getMenuInflater().inflate(R.menu.activity_main, menu);
            return true;
        }

    }

