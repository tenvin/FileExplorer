package com.twg.fileexplorer.app.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.twg.fileexplorer.app.R;
import com.twg.fileexplorer.app.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twg on 2017/3/16.
 */
public class MainActivity extends AppCompatActivity {
    private TabLayout tabs;
    private ViewPager viewPager;
    private List<String> mTitle = new ArrayList<String>();
    private List<Fragment> mFragment = new ArrayList<Fragment>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(), mTitle, mFragment);
        viewPager.setAdapter(adapter);
        //为TabLayout设置ViewPager
        tabs.setupWithViewPager(viewPager);
        //使用ViewPager的适配器
        tabs.setTabsFromPagerAdapter(adapter);
    }

    private void initView(){
        tabs = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        mTitle.add("tab1");
        mTitle.add("tab2");

        mFragment.add(new FileExplorerFragment());
        mFragment.add(new MyFragment());

    }


}
