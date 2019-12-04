package com.aris.yemekgetir.ui.auth.LoginActivities.activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.Utils;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.auth.RegisterNo;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.drawermenu.SebetActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.adapter.RestaurantAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.SebetFragment;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.BotttomDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class RestaurantActivity extends BaseActivity implements BotttomDialog.BottomSheetListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(RestaurantActivity.this, RegisterNo.class);
//                startActivity(intent);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recycler);
        Utils.loadDefaultRecyclerConfg(recyclerView, this);
        List<String> objectList = new ArrayList<>();
        objectList.add("Əla təklif");
        objectList.add("Butun Restoranlar");

        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view,
                                       @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                if (parent.getAdapter() != null) {

                    if (parent.getChildAdapterPosition(view) != parent.getAdapter().getItemCount() - 1) {

                        //outRect.bottom = Utils.dpToPx(24,parent.getContext());
                        //else
                        //outRect.right = Utils.dpToPx(verticalSpaceHeight,parent.getContext());
                    }
                    if (parent.getChildAdapterPosition(view) != 0) {
                        outRect.right = Utils.dpToPx(12, parent.getContext());
                        outRect.left = Utils.dpToPx(12, parent.getContext());
                    }
                }
            }

        });

        recyclerView.setAdapter(new RestaurantAdapter().setData(objectList).setOnRecyclerItemClick(o -> {
            BotttomDialog bottomSheet = new BotttomDialog(R.layout.dialog_bottom_add);
            bottomSheet.show(getSupportFragmentManager(), "exampleBottomSheet");
        }));

    }
    public void restClicks(View view) {
        switch (view.getId()) {
            case R.id.back_iv:
                onBackPressed();
                break;
        }
    }
    @Override
    public void onButtonClicked(int text) {
        switch (text) {
            case R.layout.activity_add_menu:
                startActivity(new Intent(this, AddMenuRestaurant.class));
                break;
            case R.layout.dialog_bottom_add:
                BotttomDialog bottomSheet = new BotttomDialog(R.layout.dialog_bottom_confirm);
                bottomSheet.show(getSupportFragmentManager(), "exampleBottomSheet2");
                break;
            case R.layout.dialog_bottom_confirm:
                startActivity(new Intent(this, SebetActivity.class));
                break;
        }

    }
}

