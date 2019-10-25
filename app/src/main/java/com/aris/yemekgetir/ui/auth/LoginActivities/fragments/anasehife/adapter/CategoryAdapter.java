package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders.CategoryChildVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.BaseAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Category;

public class CategoryAdapter extends BaseAdapter<CategoryChildVH, Category> {

    private static final String TAG = "CategoryAdapter";

    @NonNull
    @Override
    public CategoryChildVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return CategoryChildVH.create(parent);
    }

    @Override public void onBindViewHolder(@NonNull CategoryChildVH holder, int position) {

        holder.build(getItemOn(position),getItemCount());
    }

}
