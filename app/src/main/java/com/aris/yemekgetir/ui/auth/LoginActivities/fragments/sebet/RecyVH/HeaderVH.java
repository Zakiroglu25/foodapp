package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.RecyVH;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;

public class HeaderVH extends BaseRecyclerVH {

    private static  int layout = R.layout.sebet_header_row;

    public HeaderVH(@NonNull View itemView) {
        super(itemView);
    }
    public static HeaderVH create(ViewGroup parent){
        return new HeaderVH(view(parent,layout));
    }
    public void  build(String text){
    }

}
