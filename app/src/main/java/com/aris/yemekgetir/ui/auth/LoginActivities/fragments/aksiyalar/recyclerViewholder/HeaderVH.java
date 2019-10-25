package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar.recyclerViewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.fragments.BaseRecyclerVH;
import com.google.android.material.tabs.TabLayout;

public class HeaderVH extends BaseRecyclerVH {

  private ViewPager viewPager;
  private TabLayout tabLayout;


  public HeaderVH(@NonNull View itemView) {
    super(itemView);
    viewPager = itemView.findViewById(R.id.viewPager);
    tabLayout = itemView.findViewById(R.id.tabDots);
  }


  public void build(){
    tabLayout.setupWithViewPager(viewPager, true);
    viewPager.setAdapter(new MyViewPagerAdapter(itemView.getContext()));
  }


  public static HeaderVH create(ViewGroup group){
    return new HeaderVH(view(group, R.layout.fragment_aksiyalar_header));
  }




  public class MyViewPagerAdapter extends PagerAdapter {

    private Context context;

    public MyViewPagerAdapter(Context context) {
      this.context = context;
    }

    @Override
    public Object instantiateItem(@NonNull ViewGroup collection, int position) {
      LayoutInflater inflater = LayoutInflater.from(context);
      ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.fragment_anasehife_header, collection, false);
      collection.addView(layout);
      return layout;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object view) {
      container.removeView((View) view);
    }

      @Override
    public int getCount() {
      return 6;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
      return view == object;
    }
  }
}
