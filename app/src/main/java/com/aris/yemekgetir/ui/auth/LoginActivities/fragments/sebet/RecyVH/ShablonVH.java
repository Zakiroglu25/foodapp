package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.RecyVH;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;

public class ShablonVH extends BaseRecyclerVH {
    private static  int layout = R.layout.sebet_shablon;

    public ShablonVH(@NonNull View itemView) {
        super(itemView);
    }
    public static ShablonVH create(ViewGroup parent){
        return new ShablonVH(view(parent,layout));
    }

}
