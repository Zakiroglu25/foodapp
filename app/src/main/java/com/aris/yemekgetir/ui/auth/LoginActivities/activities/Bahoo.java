package com.aris.yemekgetir.ui.auth.LoginActivities.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aris.yemekgetir.R;

public class Bahoo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahoo);


//        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        findViewById(R.id.button8).setOnClickListener(v -> {
//
//        });
//
//        findViewById(R.id.button8).setOnClickListener(this::nese2);
//        nese(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
//        nese(() -> {
//
//        });

//        nese(System.out::println);

        findViewById(R.id.button8).setOnClickListener(v -> {

            Intent intent = new Intent(Bahoo.this, Axtaris.class);

            intent.putExtra("search_key","AKULA NEDEDEN");

            startActivity(intent);
        });




    }


//
//    private void  nese(Runnable r){
//
//    }
//
//    private void  nese2(View v){
//
//    }
}
