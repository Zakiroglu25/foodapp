package com.aris.yemekgetir.ui.auth.LoginActivities.activities.drawermenu;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.adapter.ExpandleListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SifarishlerimActivity extends AppCompatActivity {
    ExpandleListAdapter listAdapter;
    ExpandableListView expListView;

    List<String> listDataHeader = new ArrayList<>();
    HashMap<String, List<Object>> listDataChild = new HashMap<>();

    private static final String TAG = "ArchiveActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifarishlerim);

        Toolbar myChildToolbar =
                findViewById(R.id.toolbar);
        setSupportActionBar(myChildToolbar);
        myChildToolbar.setNavigationOnClickListener(view -> onBackPressed());
        // get the listvie
        expListView = findViewById(R.id.expandableListView);
        // preparing list data

        Log.e(TAG, "onCreate: " + listDataHeader);
        Log.e(TAG, "onCreate: " + listDataChild);
        listAdapter = new ExpandleListAdapter(listDataHeader, listDataChild);

        expListView.setAdapter(listAdapter);

        prepareListData();
        listAdapter.notifyDataSetChanged();
//        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
//        expandableListDetail = ExpanleListData.getData();
//        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
//        expandableListAdapter = new ExpandleListAdapter(this, expandableListTitle, expandableListDetail);
//        expandableListView.setAdapter(expandableListAdapter);
//        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
//
//            @Override
//            public void onGroupExpand(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        expandableListTitle.get(groupPosition) + " List Expanded.",
//                        Toast.LENGTH_SHORT).show();
//            }
//              });
//
//                 expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
//
//            @Override
//            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        expandableListTitle.get(groupPosition) + " List Collapsed.",
//                        Toast.LENGTH_SHORT).show();
//
//            }
//        });
//
//                  expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
//            @Override
//            public boolean onChildClick(ExpandableListView parent, View v,
//                                        int groupPosition, int childPosition, long id) {
//                Toast.makeText(
//                        getApplicationContext(),
//                        expandableListTitle.get(groupPosition)
//                                + " -> "
//                                + expandableListDetail.get(
//                                expandableListTitle.get(groupPosition)).get(
//                                childPosition), Toast.LENGTH_SHORT
//                ).show();
//                return false;
//            }
//        });
    }


    private void prepareListData() {
        listDataHeader.add("Gundelik Yemek");
        listDataHeader.add("Gundelik Yemek");
        listDataHeader.add("Gundelik Yemek");




        // Adding child data
        List<Object> top250 = new ArrayList<>();
        top250.add("pamador");
        top250.add("pamador");
        top250.add("pamador");
        top250.add(2.0);


        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), top250); // Header, Child data

    }
}
