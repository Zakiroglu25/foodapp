package com.aris.yemekgetir.ui.auth.LoginActivities.activities.bankActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.BaseActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.bankActivity.BankCartActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.bankActivity.NagdOdenis;

public class ConfirmPaymentActivity extends BaseActivity implements AdapterView.OnItemSelectedListener {

    Button bankKarti, nagd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_payment);

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        Button bankKarti = findViewById(R.id.bankkarti);
        Button nagd = findViewById(R.id.nagd_btn);


        Toolbar myChildToolbar =
                findViewById(R.id.toolbar);
        setSupportActionBar(myChildToolbar);

        myChildToolbar.setNavigationOnClickListener(view -> onBackPressed());
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bankkarti:
                startActivity(new Intent(this, BankCartActivity.class));
                break;
            case R.id.nagd_btn:
                startActivity(new Intent(this, NagdOdenis.class));
                break;
        }

    }
}
