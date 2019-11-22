package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish.recyView;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders.OffersVH;

public class Offer extends BaseRecyclerVH {
    private static int layout = R.layout.axtarish_offer_row;


    public Offer(@NonNull View itemView) {
        super(itemView);
    }

    public static OffersVH create(ViewGroup parent) {
        return new OffersVH(view(parent, layout));
    }

    public void setImage(int image) {
        ((ImageView) itemView.findViewById(R.id.imageView44)).setImageResource(image);
    }
}
