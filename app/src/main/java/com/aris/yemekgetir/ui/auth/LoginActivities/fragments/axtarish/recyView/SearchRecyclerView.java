package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish.recyView;

import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.AxtarishYemek;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.SearchResult;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;

public class SearchRecyclerView extends BaseRecyclerVH {
    private static final String TAG = "SearchRecyclerView";
    private static int layoutId = R.layout.axtarish_into_axtarish;
    public EditText editText;

    private SearchRecyclerView(@NonNull View itemView) {
        super(itemView);
        editText = itemView.findViewById(R.id.edittextaxtarish);
    }
    public void build() {

    }
    public static SearchRecyclerView create(ViewGroup parent) {
        return new SearchRecyclerView(view(parent, layoutId));
    }
}
