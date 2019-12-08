package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife.rectclerViewHolders;

import android.content.Intent;
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

public class SearchVH extends BaseRecyclerVH {


    private static int layout = R.layout.anasehife_axtarish_row;
    public EditText editText;



    private SearchVH(@NonNull View itemView) {
        super(itemView);
        editText = itemView.findViewById(R.id.editTextSearchHome);
        // TODO: 12/4/2019 Kursad bax
    }

    public void build() {
    }


    public static SearchVH create(ViewGroup parent) {
        return new SearchVH(view(parent, layout));
    }


}

