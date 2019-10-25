package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar.recyclerViewholder;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar.adapter.MainRowAdapter;

public class RecyclerVH extends BaseRecyclerVH {

  private static int layoutId = R.layout.anasehife_recycler_row;

  private RecyclerView recyclerView;

  private static final String TAG = "RecyclerVH";


  private RecyclerVH(@NonNull View itemView, int layout) {
    super(itemView);

    recyclerView = itemView.findViewById(R.id.item_recycler);

    LinearLayoutManager mLayoutManager = new LinearLayoutManager(itemView.getContext());
    mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
    recyclerView.setLayoutManager(mLayoutManager);
    recyclerView.setItemAnimator(new DefaultItemAnimator());



    recyclerView.setAdapter(new MainRowAdapter(layout));
  }



  public static RecyclerVH create(
      ViewGroup parent, int layout) {
    return new RecyclerVH(view(parent, layoutId), layout);
  }
}

