package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aris.yemekgetir.ui.auth.LoginActivities.adapter.model.Header;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.RecyVH.FotterVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.RecyVH.HeaderVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.RecyVH.RecyclerVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.RecyVH.ShablonVH;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.model.ModelHeader;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.BaseAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Sebet;

import java.util.Arrays;

public class SebetAdapter extends BaseAdapter<RecyclerView.ViewHolder, Object> {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (ViewTypeSebet.valueOf(viewType)) {
            case HEADER:
                return HeaderVH.create(parent);
            case SHABLON:
                return ShablonVH.create(parent);
            case FOOTTER:
                return FotterVH.create(parent);
            default:
                throw new RuntimeException("ViewTypeSebet Error");
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);

        switch (ViewTypeSebet.valueOf(getItemViewType(position))) {
            case HEADER:
                break;
            case SHABLON:
                break;
            case FOOTTER:
                break;

        }
    }

    @Override
    public int getItemViewType(int position) {
        Object o = getItemOn(position);

        if (o instanceof ViewTypeSebet) {
            return ((ViewTypeSebet) o).i;
        } else if (o instanceof String) {
            return ViewTypeSebet.HEADER.i;
        } else if (o instanceof Sebet) {
            return ViewTypeSebet.SHABLON.i;
        } else if (o instanceof Sebet) {
            return ViewTypeSebet.FOOTTER.i;
        }
        return super.getItemViewType(position);
    }


    public enum ViewTypeSebet {
        HEADER(1),
        SHABLON(2),
        FOOTTER(3);

        private int i;

        ViewTypeSebet(int i) {
            this.i = i;
        }

        public static ViewTypeSebet valueOf(int i) {
            for (ViewTypeSebet typeSebet : ViewTypeSebet.values()) {
                if (typeSebet.i == i)
                    return typeSebet;
            }
            return ViewTypeSebet.FOOTTER;
        }
    }
}
