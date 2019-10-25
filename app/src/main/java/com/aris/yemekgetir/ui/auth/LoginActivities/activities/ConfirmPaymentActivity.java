package com.aris.yemekgetir.ui.auth.LoginActivities.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

import com.aris.yemekgetir.R;

public class ConfirmPaymentActivity extends BaseActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_confirm_payment);

    Toolbar myChildToolbar =
        findViewById(R.id.toolbar);
    setSupportActionBar(myChildToolbar);

    myChildToolbar.setNavigationOnClickListener(view -> onBackPressed());
  }
}
