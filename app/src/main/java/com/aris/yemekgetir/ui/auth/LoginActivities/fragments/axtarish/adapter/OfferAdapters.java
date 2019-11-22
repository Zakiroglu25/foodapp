package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish.recyView.OfferRecycler;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.BaseAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Offer;

public class OfferAdapters extends BaseAdapter<OfferRecycler,Offer> {

    @NonNull
    @Override public OfferRecycler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return OfferRecycler.create(parent);
    }
}

