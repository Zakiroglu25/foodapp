package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.Utils;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Category;

public class CategoryChildVH extends BaseRecyclerVH {

    private static int layoutId = R.layout.anasehife_category_row;

    private ImageView categoryIv;
    private TextView categoryTv;

    private static final String TAG = "CategoryChildVH";

    private CategoryChildVH(@NonNull View itemView) {
        super(itemView);

        categoryIv = itemView.findViewById(R.id.category_iv);
        categoryTv = itemView.findViewById(R.id.category_tv);
    }

    public void build(Category category, int size) {
        categoryIv.setImageResource(category.getImage());
        categoryTv.setText(category.getName());


        if (getAdapterPosition() == size-1) {
            itemView.setPadding(0,0,0,0);

        }else {
            itemView.setPadding(0,0, Utils.dpToPx(24,itemView.getContext()),0);

        }
    }

    public static CategoryChildVH create(ViewGroup parent) {
        return new CategoryChildVH(view(parent, layoutId));
    }
}

