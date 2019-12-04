package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.Utils;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.SearchResult;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseFragment;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish.adapter.AxtarishAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.RecyclerSpaceDec;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Restaurant;
import com.yandex.mapkit.search.Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AxtarishFragment extends BaseFragment {
    private static final String TAG = "RatingFragment";

    private AxtarishViewModel axtarishViewModel;
    private RecyclerView recyclerView;
    ImageView imageView;

    EditText edittextaxtarish;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        axtarishViewModel =
                ViewModelProviders.of(this).get(AxtarishViewModel.class);
        View root = inflater.inflate(R.layout.axtarish_fragment, container, false);



//        edittextaxtarish = root.findViewById(R.id.edittextaxtarish);
//
//        edittextaxtarish.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
//                    System.out.println("Fuck you");
//                    return true;
//                }
//                return false;
//            }
//        });
//
//        edittextaxtarish.setOnEditorActionListener(new EditText.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(EditText v, int actionId, KeyEvent event) {
//                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
//                    Log.i(TAG, "onEditorAction: Adam kisi olar");
//                    return true;
//                }
//                return false;
//            }
//        });
        return root;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        recyclerView = view.findViewById(R.id.axtarish_lv);

        Utils.loadDefaultRecyclerConfg(recyclerView, getContext());

        List<Object> objectList = new ArrayList<>();

        objectList.add(AxtarishAdapter.ViewTypee.SEARCH);
        objectList.add("Əla təklif");
        objectList.add(AxtarishAdapter.ViewTypee.ACTIONS);
        objectList.add("Reyting");
        objectList.addAll(Arrays.asList(
                Restaurant.create(),
                Restaurant.create(),
                Restaurant.create()

        ));

        AxtarishAdapter axtarishAdapter = new AxtarishAdapter();
//
//        axtarishAdapter.setOnRecyclerItemClick(o -> {
//            Log.e(TAG, "onViewCreated: ");
//            if (o instanceof Search) {
//                startActivity(new Intent(getContext(), SearchResult.class));
//            }
//
//        });


        recyclerView.addItemDecoration(new RecyclerSpaceDec(16));

        recyclerView.setAdapter(axtarishAdapter);


        axtarishAdapter.setData(objectList);

    }


}
