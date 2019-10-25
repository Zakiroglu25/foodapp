package com.aris.yemekgetir.ui.auth.LoginActivities.ExpandleListData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpanleListData {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add("Pomidor Yumurta");
        cricket.add("Pomidor Yumurta");
        cricket.add("Pomidor Yumurta");

        expandableListDetail.put("Gündəlik Yeməklər", cricket);
       // expandableListDetail.put("FOOTBALL TEAMS", football);
      //  expandableListDetail.put("BASKETBALL TEAMS", basketball);
        return expandableListDetail;
    }
}

