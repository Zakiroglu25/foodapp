package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders.OffersVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.BaseAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Offer;

public class OfferAdapter extends BaseAdapter<OffersVH, Offer> {

    @NonNull
    @Override public OffersVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return OffersVH.create(parent);
    }
}
