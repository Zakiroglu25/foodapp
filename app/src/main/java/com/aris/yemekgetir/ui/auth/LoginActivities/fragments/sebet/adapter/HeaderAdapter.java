package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.RecyVH.HeaderVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.model.ModelHeader;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.BaseAdapter;

public class HeaderAdapter extends BaseAdapter<HeaderVH, ModelHeader> {

    @NonNull @Override public HeaderVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return HeaderVH.create(parent);
    }

}
