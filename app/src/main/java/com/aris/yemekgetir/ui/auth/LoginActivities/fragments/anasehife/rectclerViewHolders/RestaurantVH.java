package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;

public class RestaurantVH extends BaseRecyclerVH {

  private static int layout = R.layout.anasehife_restorant_row;

  public RestaurantVH(@NonNull View itemView) {
    super(itemView);
  }

  public void build(){

  }


  public static RestaurantVH create(ViewGroup parent){
    return  new RestaurantVH(view(parent,layout));
  }
}
