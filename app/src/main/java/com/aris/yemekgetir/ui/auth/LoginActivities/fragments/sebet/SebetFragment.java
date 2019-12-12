package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.Utils;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.bankActivity.ConfirmPaymentActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseFragment;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.adapter.SebetAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SebetFragment extends BaseFragment {

    private SebetViewModel sebetViewModel;
    private RecyclerView recyclerView;
    List<Object> objectList = new ArrayList<>();
    SebetAdapter sebetAdapter = new SebetAdapter();

    private static final String TAG = "RatingFragment";

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        sebetViewModel = ViewModelProviders.of(this).get(SebetViewModel.class);



        Objects.requireNonNull(getActivity()).findViewById(R.id.toolbar_delete).setOnClickListener((v) -> {
            Log.e(TAG, "onCreateView:  tolbar");


            LayoutInflater inflater1 = LayoutInflater.from(getContext());

            View view = inflater1.inflate(R.layout.sebet_delete_dialog, null);
            View replace = inflater1.inflate(R.layout.activity_sebet_boshdur, null);

            AlertDialog alertDialog = new AlertDialog.Builder(getContext())
                    .setView(view)
                    .create();
            alertDialog.show();

            Button button = view.findViewById(R.id.btn_xeyr_toolbar);

            Button button1 = view.findViewById(R.id.btn_beli_dialog);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    objectList.clear();
                    sebetAdapter.notifyDataSetChanged();
                    alertDialog.dismiss();

                    container.removeAllViews();
                    // container.addView(replace);

                }
            });


            button.setOnClickListener(v1 -> alertDialog.dismiss());

        });

        return inflater.inflate(R.layout.sebet_fragment, container, false);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.d(TAG, "onOptionsItemSelected() called with: item = [" + item + "]");
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {


        recyclerView = view.findViewById(R.id.sebet_fr);

        Utils.loadDefaultRecyclerConfg(recyclerView, getContext());


        objectList.addAll(Arrays.asList(
                SebetAdapter.ViewTypeSebet.HEADER,
                SebetAdapter.ViewTypeSebet.HEADER,
                SebetAdapter.ViewTypeSebet.HEADER,
                SebetAdapter.ViewTypeSebet.SHABLON,
                SebetAdapter.ViewTypeSebet.FOOTTER

        ));


//
//        sebetAdapter.setOnRecyclerItemClick(o -> {
//            Log.e(TAG, "onViewCreated: ");
//            if (o instanceof Restaurant){
//                startActivity(new Intent(getContext(), RestaurantActivity.class));
//            }
//        });

        recyclerView.setAdapter(sebetAdapter);
        sebetAdapter.setData(objectList);
        sebetAdapter.setNextButtonListener(v -> startActivity(new Intent(getContext(), ConfirmPaymentActivity.class)));
    }


}

