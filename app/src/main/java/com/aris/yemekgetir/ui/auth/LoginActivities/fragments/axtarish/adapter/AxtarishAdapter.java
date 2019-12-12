package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish.adapter;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.adapter.AnaSehifeAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders.RecyclerVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders.RestaurantVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish.recyView.SearchRecyclerView;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish.recyView.TextViewHolder;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.BaseAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Offer;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Restaurant;
import java.util.Arrays;

public class AxtarishAdapter extends BaseAdapter<RecyclerView.ViewHolder,Object> {
    private OnSearchListener listener;

    public void setListener(OnSearchListener listener) {
        this.listener = listener;
    }
    public interface OnSearchListener {
        boolean onSearch(String text);
    }

    @NonNull @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (ViewTypee.valueOf(viewType)) {
            case SEARCH:
                return SearchRecyclerView.create(parent);
            case CATEGORY:
                return RecyclerVH.create(parent,true);
            case ALL:
                return RestaurantVH.create(parent);
            case TEXT:
                return TextViewHolder.create(parent);
            case ACTIONS:
                return RecyclerVH.create(parent,false);
            default:
                throw  new RuntimeException("ViewType Error");
        }
    }

    @Override public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        super.onBindViewHolder(holder,position);
        switch (ViewTypee.valueOf(getItemViewType(position))) {
            case CATEGORY:

//                ((RecyclerVH) holder).build(Arrays.asList(
//                        Category.create()
//                                .setName("Burger")
//                                .setImage(R.drawable.ic_burger),
//                        Category.create()
//                                .setName("Burger")
//                                .setImage(R.drawable.ic_burger),
//                        Category.create()
//                                .setName("Burger")
//                                .setImage(R.drawable.ic_burger)
//                ));

                break;

            case ACTIONS:

                ((RecyclerVH) holder).build(Arrays.asList(
                        Offer.create()
                                .setResSource(R.drawable.offer_1),
                        Offer.create()
                                .setResSource(R.drawable.offer_1),
                        Offer.create()
                                .setResSource(R.drawable.offer_1)
                ));

                break;
            case SEARCH:
                ((SearchRecyclerView) holder).editText.setOnEditorActionListener((v, actionId, event) -> listener.onSearch(v.getText().toString()));
                break;

            case TEXT:
                ((TextViewHolder) holder).build((String) getItemOn(position));
                break;

            case ALL:
                ((RestaurantVH) holder).build();

                break;
        }
    }


    @Override public int getItemViewType(int position) {
        Object o = getItemOn(position);

        if (o instanceof ViewTypee) {
            return ((ViewTypee) o).i;
        } else if (o instanceof String) {
            return ViewTypee.TEXT.i;
        } else if (o instanceof Restaurant) {
            return ViewTypee.ALL.i;
        }

        return super.getItemViewType(position);
    }

    public enum ViewTypee {
        SEARCH(1),
        CATEGORY(2),
        TEXT(3),
        ALL(4),
        ACTIONS(5);

        private int i;

        ViewTypee(int i) {
            this.i = i;
        }

        public static ViewTypee valueOf(int i) {
            for (ViewTypee type : ViewTypee.values()) {
                if (type.i == i)
                    return type;
            }
            return ViewTypee.ALL;
        }
    }
}
