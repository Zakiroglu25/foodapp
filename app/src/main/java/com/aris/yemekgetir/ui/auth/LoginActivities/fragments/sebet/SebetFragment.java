package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.Utils;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.RestaurantActivity;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseFragment;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.adapter.SebetAdapter;
import com.aris.yemekgetir.ui.auth.LoginActivities.helpers.RecyclerSpaceDec;
import com.aris.yemekgetir.ui.auth.LoginActivities.models.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SebetFragment extends BaseFragment {

    private SebetViewModel sebetViewModel;
    private RecyclerView recyclerView;

    private static final String TAG = "RatingFragment";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sebetViewModel = ViewModelProviders.of(this).get(SebetViewModel.class);

        return inflater.inflate(R.layout.sebet_fragment, container, false);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        recyclerView = view.findViewById(R.id.sebet_fr);

        Utils.loadDefaultRecyclerConfg(recyclerView, getContext());

        List<Object> objectList = new ArrayList<>();

        objectList.add(SebetAdapter.ViewTypeSebet.HEADER);
        objectList.add(SebetAdapter.ViewTypeSebet.HEADER);
        objectList.add(SebetAdapter.ViewTypeSebet.SHABLON);
        objectList.add(SebetAdapter.ViewTypeSebet.FOOTTER);
        objectList.addAll(Arrays.asList(
             //   Restaurant.create(),
              //  Restaurant.create()

        ));

        SebetAdapter ratingAdapter= new SebetAdapter();

        ratingAdapter.setOnRecyclerItemClick(o -> {
            Log.e(TAG, "onViewCreated: ");
            if (o instanceof Restaurant){
                startActivity(new Intent(getContext(), RestaurantActivity.class));
            }

        });


        recyclerView.addItemDecoration(new RecyclerSpaceDec(16));

        recyclerView.setAdapter(ratingAdapter);


        ratingAdapter.setData(objectList);

    }
}


//    public View onCreateView(
//            @NonNull LayoutInflater inflater,
//            ViewGroup container,
//            Bundle savedInstanceState
//
//    ) {
//        View root = inflater.inflate(R.layout.sebet_fragment, container, false);




        // SwipeMenuListView listView = (SwipeMenuListView) root.findViewById(R.id.listView);


//        ArrayList<String> list = new ArrayList<>();
//        list.add("Biscuits on Plate x 2");
//        list.add("Biscuits on Plate x 2");
//        list.add("Biscuits on Plate x 2");
//
//        ArrayAdapter adapter = new ArrayAdapter(root.getContext(), android.R.layout.simple_list_item_1, list);
//        listView.setAdapter(adapter);
//
//        SwipeMenuCreator creator = new SwipeMenuCreator() {
//
//            @Override
//            public void create(SwipeMenu menu) {
//                // create "open" item
//                SwipeMenuItem openItem = new SwipeMenuItem(
//                        root.getContext());
//                // set item background
//                openItem.setBackground(new ColorDrawable(Color.rgb(0x00, 0x66,
//                        0xff)));
//                // set item width
//                //openItem.setWidth(170);
//                // set item title
//                //openItem.setTitle("Open");
//                // set item title fontsize
//                openItem.setTitleSize(18);
//                // set item title font color
//                openItem.setTitleColor(Color.WHITE);
//                // add to menu
//                menu.addMenuItem(openItem);
//
//                // create "delete" item
//                SwipeMenuItem deleteItem = new SwipeMenuItem(
//                        root.getContext());
//                // set item background
//               // deleteItem.setBackground(new ColorDrawable(Color.rgb(0xF9,
//                        //0x3F, 0x25)));
//                // set item width
//                deleteItem.setWidth(170);
//                // set a icon
//                deleteItem.setIcon(R.drawable.ic_group_8);
//                // add to menu
//                menu.addMenuItem(deleteItem);
//            }
//        };
//        listView.setMenuCreator(creator);
//
//        listView.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {
//                switch (index) {
//                    case 0:
//                        Log.d(TAG, "onMenuItemClick: clicked item " + index);
//                        break;
//                    case 1:
//                        Log.d(TAG, "onMenuItemClick: clicked item " + index);
//                        break;
//                }
//                // false : close the menu; true : not close the menu
//                return false;
//            }
//        });
//
//
//
//        return root;
//
//    }
//
//    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//
//        view.findViewById(R.id.send_btn)
//                .setOnClickListener(
//                        view1 -> startActivity(new Intent(getContext(), ConfirmPaymentActivity.class)));

