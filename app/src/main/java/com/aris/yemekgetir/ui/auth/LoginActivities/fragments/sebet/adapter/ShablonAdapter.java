package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.RecyVH.HeaderVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.RecyVH.ShablonVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.model.ShablonM;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.BaseAdapter;

public class ShablonAdapter extends BaseAdapter<ShablonVH, ShablonM> {
    @NonNull
    @Override public ShablonVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ShablonVH.create(parent);
    }
}
