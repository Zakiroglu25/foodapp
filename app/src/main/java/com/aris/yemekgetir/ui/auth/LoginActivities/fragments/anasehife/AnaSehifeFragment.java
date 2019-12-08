package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.Utils;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.Bahoo;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.RestaurantActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.SearchResult;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseFragment;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.adapter.AnaSehifeAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.RecyclerSpaceDec;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Restaurant;
import com.yandex.mapkit.search.Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnaSehifeFragment extends BaseFragment{

    private AnaSehifeViewModel anaSehifeViewModel;
    private RecyclerView recyclerView;

    private static final String TAG = "RatingFragment";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        anaSehifeViewModel= ViewModelProviders.of(this).get(AnaSehifeViewModel.class);

        return inflater.inflate(R.layout.ana_sehife_fragment, container, false);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        recyclerView = view.findViewById(R.id.anasehife_lv);

        Utils.loadDefaultRecyclerConfg(recyclerView, getContext());

        List<Object> objectList = new ArrayList<>();

        objectList.add(AnaSehifeAdapter.ViewType.SEARCH);
        objectList.add(AnaSehifeAdapter.ViewType.CATEGORY);
        objectList.add("Əla təklif");
        objectList.add(AnaSehifeAdapter.ViewType.ACTIONS);
        objectList.add("Bütün Restoranlar");
        objectList.addAll(Arrays.asList(
                Restaurant.create(),
                Restaurant.create(),
                Restaurant.create(),
                Restaurant.create(),
                Restaurant.create(),
                Restaurant.create(),
                Restaurant.create(),
                Restaurant.create(),
                Restaurant.create()
        ));

        AnaSehifeAdapter anaSehifeAdapter= new AnaSehifeAdapter();


        anaSehifeAdapter.setListener(text -> {
            startActivity(new Intent(getContext(), SearchResult.class));
            return false;
        });

        anaSehifeAdapter.setOnRecyclerItemClick(o -> {
            Log.e(TAG, "onViewCreated: ");
            if (o instanceof Restaurant){
                startActivity(new Intent(getContext(), RestaurantActivity.class));
            }

        });
//
        recyclerView.addItemDecoration(new RecyclerSpaceDec(16));

        recyclerView.setAdapter(anaSehifeAdapter);


        anaSehifeAdapter.setData(objectList);

    }
}
