package com.aris.yemekgetir.ui.auth.LoginActivities.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.aris.yemekgetir.R;

import java.util.HashMap;
import java.util.List;

public class ExpandleListAdapter extends BaseExpandableListAdapter {
    private List<String> headers; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<Object>> hashMap;

    private final int HEADER = 1;
    private final int FOOTER = 2;





    public ExpandleListAdapter(List<String> listDataHeader,
                           HashMap<String, List<Object>> listChildData) {

        this.headers = listDataHeader;
        this.hashMap = listChildData;
    }

    ///
    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this.hashMap.get(this.headers.get(groupPosition))
                .get(childPosititon);
    }


    //
    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }


    //
    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {


        int layId;
        Log.e(TAG, "getChildView: ");

        switch (getChildType(groupPosition, childPosition)) {

            case HEADER:

                layId = R.layout.lit_item_sifarishlerim;
                break;

            case FOOTER:

                layId = R.layout.list_item_button;

                break;

            default:
                throw new RuntimeException("WTF");
        }


        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) parent.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(layId, null);
        }


        return convertView;

    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.hashMap.get(this.headers.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return headers.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return headers.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    private static final String TAG = "ExpandleAdapter";

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {

            LayoutInflater infalInflater = (LayoutInflater) parent.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.sifarislerim_list_group, null);
        }

//        TextView lblListHeader = convertView.findViewById(R.id.textView89);
       // lblListHeader.setTypeface(null, Typeface.BOLD);
  //      lblListHeader.setText(headerTitle);

        return convertView;
    }

    @Override
    public int getChildType(int groupPosition, int childPosition) {
        Object object = getChild(groupPosition, childPosition);

        if (object instanceof String) {
            return HEADER;
        } else if (object instanceof Double) {
            return FOOTER;
        }

        throw new RuntimeException("Object not supported");
    }

    @Override
    public int getChildTypeCount() {
        return 4;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
