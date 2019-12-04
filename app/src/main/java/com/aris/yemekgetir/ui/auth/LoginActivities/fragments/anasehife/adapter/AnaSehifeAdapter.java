package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders.RecyclerVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders.RestaurantVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders.SearchVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders.TextVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.BaseAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Category;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Offer;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Restaurant;

import java.util.Arrays;

public class AnaSehifeAdapter extends BaseAdapter<RecyclerView.ViewHolder, Object> {

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (ViewType.valueOf(viewType)) {
            case SEARCH:
                return SearchVH.create(parent);
            case CATEGORY:
                return RecyclerVH.create(parent, true);
            case ALL:
                return RestaurantVH.create(parent);
            case TEXT:
                return TextVH.create(parent);
            case ACTIONS:
                return RecyclerVH.create(parent, false);
            default:
                throw new RuntimeException("ViewType Error");
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        super.onBindViewHolder(holder, position);
        switch (ViewType.valueOf(getItemViewType(position))) {
            case CATEGORY:

                ((RecyclerVH) holder).build(Arrays.asList(
                        Category.create()
                                .setName("Milli")
                                .setImage(R.drawable.ic_milli_yemek),
                        Category.create()
                                .setName("Dönər")
                                .setImage(R.drawable.ic_doner1),
                        Category.create()
                                .setName("Suşi")
                                .setImage(R.drawable.ic_sushi),
                        Category.create()
                                .setName("Burger")
                                .setImage(R.drawable.ic_burger),
                        Category.create()
                                .setName("Rus")
                                .setImage(R.drawable.ic_kremlin)
                ));

                break;

            case ACTIONS:

                ((RecyclerVH) holder).build(Arrays.asList(
                        Offer.create()
                                .setResSource(R.drawable.offer_1),
                        Offer.create()
                                .setResSource(R.drawable.offer2),
                        Offer.create()
                                .setResSource(R.drawable.offer_1),
                        Offer.create()
                                .setResSource(R.drawable.offer2)
                ));

                break;
            case SEARCH:
                break;

            case TEXT:
                ((TextVH) holder).build((String) getItemOn(position));
                break;

            case ALL:
                ((RestaurantVH) holder).build();
                break;
        }
    }


    @Override
    public int getItemViewType(int position) {
        Object o = getItemOn(position);
        if (o instanceof ViewType) {
            return ((ViewType) o).i;
        } else if (o instanceof String) {
            return ViewType.TEXT.i;
        } else if (o instanceof Restaurant) {
            return ViewType.ALL.i;
        }

        return super.getItemViewType(position);
    }

    public enum ViewType {
        SEARCH(1),
        CATEGORY(2),
        TEXT(3),
        ALL(4),
        ACTIONS(5);

        private int i;

        ViewType(int i) {
            this.i = i;
        }

        public static ViewType valueOf(int i) {
            for (ViewType type : ViewType.values()) {
                if (type.i == i)
                    return type;
            }
            return ViewType.ALL;
        }
    }
}

