package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar.recyclerViewholder.HeaderVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar.recyclerViewholder.RecyclerVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders.OffersVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders.TextVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.BaseAdapter;

import java.util.Arrays;
import java.util.List;

public class MainAdapter extends BaseAdapter<RecyclerView.ViewHolder,Object> {


  List<Object> list;

  public MainAdapter() {
    list = Arrays.asList(
            true,
            "Yemek getirde yeni restorantlar",
            R.layout.fragment_rat_default_row,
            "Size en yaxin",
            R.layout.fragment_rat_default_row,
//            "Bizi izleyin",
//              R.layout.actions_offer_row,
//            "En popular yemekler",
//            R.layout.actions_fav_row,
//            "top 10",
            R.layout.fragment_rat_default_row,
            "Kategory"
//            R.layout.fragment_rat_category_row

    );


  }

  @NonNull
  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    switch (viewType){
      case 0:
        return HeaderVH.create(parent);
      case -1:
        return TextVH.create(parent);
      case -20:
        return OffersVH.create(parent);
      default:
        return RecyclerVH.create(parent,viewType);
    }
  }

  @Override
  public int getItemCount() {
    return list.size();
  }

  @Override
  public int getItemViewType(int position) {

    Object object = list.get(position);

    if (object instanceof Boolean) {
      return 0;
    } else if (object instanceof String) {
      return -1;
    } else if (object instanceof Integer) {
      return (int) object;
    }

    return -10;
  }

  @Override public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    super.onBindViewHolder(holder, position);
    if (holder instanceof HeaderVH){
      ((HeaderVH) holder).build();
    }else if (holder instanceof TextVH){
      ((TextVH) holder).build(list.get(position).toString());
    }
  }
}
