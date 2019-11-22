package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.Utils;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.RestaurantActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.adapter.AnaSehifeAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.RecyclerSpaceDec;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AxtarishFragment extends Fragment {
    private static final String TAG = "RatingFragment";

    private AxtarishViewModel axtarishViewModel;
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        axtarishViewModel =
                ViewModelProviders.of(this).get(AxtarishViewModel.class);
        View root = inflater.inflate(R.layout.axtarish_fragment, container, false);
        return root;
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        recyclerView = view.findViewById(R.id.axtarish_lv);

        Utils.loadDefaultRecyclerConfg(recyclerView, getContext());

        List<Object> objectList = new ArrayList<>();

        objectList.add("Əla təklif");
        objectList.add(AnaSehifeAdapter.ViewType.ACTIONS);
        objectList.add("Reyting");
        objectList.addAll(Arrays.asList(
                Restaurant.create(),
                Restaurant.create(),
                Restaurant.create()

        ));

        AnaSehifeAdapter anaSehifeAdapter= new AnaSehifeAdapter();

        anaSehifeAdapter.setOnRecyclerItemClick(o -> {
            Log.e(TAG, "onViewCreated: ");
            if (o instanceof Restaurant){
                startActivity(new Intent(getContext(), RestaurantActivity.class));
            }

        });


        recyclerView.addItemDecoration(new RecyclerSpaceDec(16));

        recyclerView.setAdapter(anaSehifeAdapter);


        anaSehifeAdapter.setData(objectList);

    }
}
