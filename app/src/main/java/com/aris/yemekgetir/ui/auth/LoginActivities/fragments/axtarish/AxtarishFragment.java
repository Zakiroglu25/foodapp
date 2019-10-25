package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aris.yemekgetir.R;

public class AxtarishFragment extends Fragment {

    private AxtarishViewModel mViewModel;

    public static AxtarishFragment newInstance() {
        return new AxtarishFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.axtarish_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AxtarishViewModel.class);
        // TODO: Use the ViewModel
    }

}
