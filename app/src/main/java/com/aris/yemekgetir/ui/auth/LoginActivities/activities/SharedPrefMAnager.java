package com.aris.yemekgetir.ui.auth.LoginActivities.activities;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefMAnager {

    private static final String PREF_NAME = "messenger";

    public static void setData(Context context) {
        SharedPreferences pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("active_order", true);
        editor.apply();
        editor.commit();

    }

    public static String getData(Context context){

        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getString("key","default_value");
    }
}