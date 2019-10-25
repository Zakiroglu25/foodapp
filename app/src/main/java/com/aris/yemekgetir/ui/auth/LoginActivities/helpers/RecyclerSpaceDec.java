package com.aris.yemekgetir.ui.auth.LoginActivities.helpers;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aris.yemekgetir.ui.auth.LoginActivities.Utils;

public class RecyclerSpaceDec extends RecyclerView.ItemDecoration {

  private final int verticalSpaceHeight;


  public RecyclerSpaceDec(int verticalSpaceHeight) {

    this.verticalSpaceHeight = verticalSpaceHeight;
  }



  @Override public void getItemOffsets(@NonNull Rect outRect, @NonNull View view,
                                       @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
    if (parent.getAdapter() != null) {

      if (parent.getChildAdapterPosition(view) != parent.getAdapter().getItemCount() - 1 ) {


        outRect.bottom = Utils.dpToPx(verticalSpaceHeight,parent.getContext());
        //else
          //outRect.right = Utils.dpToPx(verticalSpaceHeight,parent.getContext());

      }

      if (parent.getChildAdapterPosition(view) !=0 ){
        outRect.right= Utils.dpToPx(12,parent.getContext());
        outRect.left= Utils.dpToPx(12,parent.getContext());
      }
    }



  }
}
