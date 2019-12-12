package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.RecyVH;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.adapter.model.Header;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.adapter.HeaderAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.adapter.ShablonAdapter;
import java.util.List;

public class RecyclerVH extends BaseRecyclerVH {

  private static int layoutId = R.layout.sebet_shablon;

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
      recyclerView.setAdapter(new HeaderAdapter());
    } else {
      recyclerView.setAdapter(new ShablonAdapter());
    }
  }

  public void build(List list) {
    if (list == null || list.isEmpty()) {
      return;
    }
    Object o = list.get(0);
    RecyclerView.Adapter adapter = recyclerView.getAdapter();
    if (adapter != null) {
      if (o instanceof Header) {
        ((HeaderAdapter) adapter).setData(list);
     // } else if (o instanceof Offer) {
      //  ((OffersAdapter) adapter).setData(list);
     // } else if (o instanceof Boolean) {
      //  ((OffersAdapter) adapter).setData(list);
      }
    }
  }

  public static RecyclerVH create(ViewGroup parent, boolean type) {
    return new RecyclerVH(view(parent, layoutId), type);
  }
}

