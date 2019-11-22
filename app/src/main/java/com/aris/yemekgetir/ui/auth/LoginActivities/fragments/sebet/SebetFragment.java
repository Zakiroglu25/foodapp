package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.bankActivity.ConfirmPaymentActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseFragment;

public class SebetFragment extends BaseFragment {


    public View onCreateView(
            @NonNull LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {

        return inflater.inflate(R.layout.sebet_fragment, container, false);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        view.findViewById(R.id.send_btn)
                .setOnClickListener(
                        view1 -> startActivity(new Intent(getContext(), ConfirmPaymentActivity.class)));
    }
}
