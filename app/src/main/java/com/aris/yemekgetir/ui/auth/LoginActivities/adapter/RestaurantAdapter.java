package com.aris.yemekgetir.ui.auth.LoginActivities.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.BaseAdapter;

public class RestaurantAdapter extends BaseAdapter<RestaurantAdapter.VHolder,String> {

  @NonNull
  @Override public VHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return VHolder.create(parent);
  };

  public static class VHolder extends BaseRecyclerVH {

    public VHolder(@NonNull View itemView) {
      super(itemView);
    }

    public static VHolder create(ViewGroup parent){
      return new VHolder(view(parent, R.layout.restaurant_child_row));
    }
  }
}
