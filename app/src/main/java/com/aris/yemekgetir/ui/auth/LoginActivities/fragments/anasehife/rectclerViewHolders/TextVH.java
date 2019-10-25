package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;

public class TextVH  extends BaseRecyclerVH {

  private static int layout= R.layout.anasehife_text_row;
  private TextView textView;

  private TextVH(@NonNull View itemView) {
    super(itemView);
    textView = itemView.findViewById(R.id.text);
  }


  public void  build(String text){
    textView.setText(text);
  }


  public  static TextVH create(ViewGroup parent){
    return new TextVH(view(parent,layout));
  }
}
