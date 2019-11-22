package com.aris.yemekgetir.ui.auth.LoginActivities.activities.bankActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.BaseActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.bankActivity.BankCartActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.bankActivity.NagdOdenis;

public class ConfirmPaymentActivity extends BaseActivity implements View.OnClickListener {

    Button bankKarti, nagd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_payment);


        Button bankKarti = findViewById(R.id.button);
        Button nagd = findViewById(R.id.button2);

        bankKarti.setOnClickListener(this);
        nagd.setOnClickListener(this);


        Toolbar myChildToolbar =
                findViewById(R.id.toolbar);
        setSupportActionBar(myChildToolbar);

        myChildToolbar.setNavigationOnClickListener(view -> onBackPressed());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                startActivity(new Intent(this, BankCartActivity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this, NagdOdenis.class));
                break;
        }

    }
}
