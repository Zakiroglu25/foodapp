package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar.adapter.MainRowAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.adapter.CategoryAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.adapter.OfferAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Category;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Offer;

import java.util.List;

public class RecyclerVH extends BaseRecyclerVH {


  private static int layoutId = R.layout.anasehife_recycler_row;

  private RecyclerView recyclerView;

  private static final String TAG = "RecyclerVH";

  private RecyclerVH(@NonNull View itemView, boolean type) {
    super(itemView);

    recyclerView = itemView.findViewById(R.id.item_recycler);

    LinearLayoutManager mLayoutManager = new LinearLayoutManager(itemView.getContext());
    mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
    recyclerView.setLayoutManager(mLayoutManager);
    recyclerView.setItemAnimator(new DefaultItemAnimator());

    if (type) {
      recyclerView.setAdapter(new CategoryAdapter());
    } else {
      recyclerView.setAdapter(new OfferAdapter());
    }
  }

  public void build(List list) {
    if (list == null || list.isEmpty()) {
      return;
    }
    Object o = list.get(0);
    RecyclerView.Adapter adapter = recyclerView.getAdapter();
    if (adapter != null) {
      if (o instanceof Category) {
        ((CategoryAdapter) adapter).setData(list);
      } else if (o instanceof Offer) {
        ((OfferAdapter) adapter).setData(list);
      } else if (o instanceof Boolean) {
        ((OfferAdapter) adapter).setData(list);
      }
    }
  }

  public static RecyclerVH create(ViewGroup parent, boolean type) {
    return new RecyclerVH(view(parent, layoutId), type);
  }
}


