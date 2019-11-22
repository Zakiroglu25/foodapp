package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.Utils;
//import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar.adapter.MainAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar.adapter.MainAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.RecyclerSpaceDec;

public class AksiyalarFragment extends Fragment {

    private AksiyalarViewModel actionsViewModel;

    public View onCreateView(
            @NonNull LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {

        actionsViewModel = ViewModelProviders
                .of(this)
                .get(AksiyalarViewModel.class);

        View root = inflater.inflate(R.layout.aksiyalar_fragment, container, false);
        RecyclerView recyclerView = root.findViewById(R.id.recycler);


        Utils.loadDefaultRecyclerConfg(recyclerView, getContext());


        recyclerView.addItemDecoration(new RecyclerSpaceDec(16));


        recyclerView.setAdapter(new MainAdapter());

        return root;
    }
}
