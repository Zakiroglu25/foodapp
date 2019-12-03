package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish.recyView;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;

public class TextViewHolder extends BaseRecyclerVH {


    private static int layout= R.layout.axtarish_text_row;
    private TextView textView;

    private TextViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text222);
    }


    public void  build(String text){
        textView.setText(text);
    }


    public  static TextViewHolder create(ViewGroup parent){
        return new TextViewHolder(view(parent,layout));
    }
}
