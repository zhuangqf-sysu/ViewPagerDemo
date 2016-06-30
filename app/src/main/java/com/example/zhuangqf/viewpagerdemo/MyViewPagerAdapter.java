package com.example.zhuangqf.viewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by zhuangqf on 6/30/16.
 */
public class MyViewPagerAdapter extends FragmentPagerAdapter {

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return MyApplication.mCount;
    }

    @Override
    public Fragment getItem(int position) {
        return MyViewPagerFragment.init(position);
    }

}
