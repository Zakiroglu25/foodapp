package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.ConfirmPaymentActivity;

public class SebetFragment extends Fragment {

    private SebetViewModel mViewModel;

    public static SebetFragment newInstance() {
        return new SebetFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sebet_fragment, container, false);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        view.findViewById(R.id.send_btn)
                .setOnClickListener(
                        view1 -> startActivity(new Intent(getContext(), ConfirmPaymentActivity.class)));
    }

}
