package com.aris.yemekgetir.ui.auth.LoginActivities.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.aris.yemekgetir.R;

public class Axtaris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_axtaris);

        String s = getIntent().getStringExtra("search_key");
        new Handler().postDelayed(() -> {

            Toast.makeText(this, s, Toast.LENGTH_LONG).show();
        }, 2000);
//
//        ImageView imageView = (ImageView) findViewById(R.id.imagesearch);
//
//        imageView.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                EditText etLocation = (EditText) findViewById(R.id.edittextaxtarish);
//                Intent intent = new Intent();
//                intent.putExtra("location", etLocation.getText().toString());
//                startActivity(intent);
//            }
//        });
    }
}
