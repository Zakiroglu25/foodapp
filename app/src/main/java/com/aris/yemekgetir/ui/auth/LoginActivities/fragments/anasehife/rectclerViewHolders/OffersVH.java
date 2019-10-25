package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;

public class OffersVH extends BaseRecyclerVH {

  private static int layout = R.layout.anasehife_offer_row;


  public OffersVH(@NonNull View itemView) {
    super(itemView);
  }

  public static OffersVH  create(ViewGroup parent){
    return  new OffersVH(view(parent,layout));
  }

  public void setImage(int image){
    ((ImageView)itemView.findViewById(R.id.imageView)).setImageResource(image);
  }
}
