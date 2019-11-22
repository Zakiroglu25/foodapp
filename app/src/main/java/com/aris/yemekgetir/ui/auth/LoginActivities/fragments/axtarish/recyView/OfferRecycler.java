package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish.recyView;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders.OffersVH;

public class OfferRecycler extends BaseRecyclerVH {
    private static int layout = R.layout.axtarish_offer_row;


    public OfferRecycler(@NonNull View itemView) {
        super(itemView);
    }

    public static OfferRecycler create(ViewGroup parent) {
        return new OfferRecycler(view(parent, layout));
    }

    public void setImage(int image) {
        ((ImageView) itemView.findViewById(R.id.imageView44)).setImageResource(image);
    }
}
