package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.RecyVH.FotterVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.model.FooterModel;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.BaseAdapter;

public class FooterAdapter extends BaseAdapter<FotterVH, FooterModel> {
    @NonNull
    @Override
    public FotterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return FotterVH.create(parent);
    }
}
