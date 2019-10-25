package com.aris.yemekgetir.ui.auth.LoginActivities.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders.TextVH;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        TextView textView = findViewById(R.id.textView8);

        String text = "Əziz müştəri Cafe City sifarişini qəbul etdi. Sifarişiniz 40 dəqiqə sonra ünvanda olacaq";

        SpannableString ss = new SpannableString(text);
        ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.RED);
        ss.setSpan(fcsRed,13,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(ss);

    }
}
