package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar.recyclerViewholder.MainVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.BaseAdapter;

public class MainRowAdapter extends BaseAdapter<MainVH,Boolean> {

  private int layout;

  public MainRowAdapter(int layout){
    this.layout= layout;
  }

  @NonNull
  @Override public MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return MainVH.create(parent,layout);
  }

  @Override public int getItemCount() {
    return 10;
  }
}
