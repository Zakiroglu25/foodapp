package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar.recyclerViewholder;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;

public class MainVH extends BaseRecyclerVH {

  public MainVH(@NonNull View itemView) {
    super(itemView);
  }



  public static MainVH create(ViewGroup group,int layout){
    return new MainVH(view(group, layout));
  }



}
