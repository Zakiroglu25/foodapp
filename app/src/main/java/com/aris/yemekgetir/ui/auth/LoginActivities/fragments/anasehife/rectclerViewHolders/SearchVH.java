package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;

public class SearchVH extends BaseRecyclerVH {


  private static int layoutId = R.layout.anasehife_axtarish_row;


  private SearchVH(@NonNull View itemView) {
    super(itemView);

  }

  public void build() {

  }



  public static SearchVH create(ViewGroup parent){
    return  new SearchVH(view(parent,layoutId));
  }
}

