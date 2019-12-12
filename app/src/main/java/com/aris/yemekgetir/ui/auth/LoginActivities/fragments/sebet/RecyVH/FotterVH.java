package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.RecyVH;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;

public class FotterVH extends BaseRecyclerVH {

    private static  int layout = R.layout.sebet_footer_rv;
    public Button button;

    public FotterVH(@NonNull View itemView) {
        super(itemView);
        button = itemView.findViewById(R.id.davam_et_footer);

    }
    public static FotterVH create(ViewGroup parent){
        return new FotterVH(view(parent,layout));
    }
}
