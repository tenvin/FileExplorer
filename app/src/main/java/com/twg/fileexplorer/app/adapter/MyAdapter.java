package com.twg.fileexplorer.app.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by twg on 2017/3/20.
 */
public class MyAdapter extends FragmentPagerAdapter {
    private List<String> title;
    private List<Fragment> views;

    public MyAdapter(FragmentManager fm,List<String> title,List<Fragment> views) {
        super(fm);
        this.title = title;
        this.views = views;
    }

    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public Fragment getItem(int position) {
        return views.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}
