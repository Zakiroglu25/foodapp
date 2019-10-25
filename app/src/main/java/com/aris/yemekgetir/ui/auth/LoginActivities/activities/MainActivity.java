package com.aris.yemekgetir.ui.auth.LoginActivities.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.aris.yemekgetir.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawer;
    BottomNavigationView bottomNavView;
    NavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }
    private void initViews() {
        drawer = findViewById(R.id.drawer_layout);
        navView = findViewById(R.id.nav_view_drawer);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
    //    NavigationUI.setupWithNavController(bottomNavView, navController);

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
            case R.id.toolbar_message_iv:
                ImageView imageView = findViewById(R.id.toolbar_message_iv);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this,MessageActivity.class);
                        startActivity(intent);
                    }
                });
                break;
        }
    }
}
