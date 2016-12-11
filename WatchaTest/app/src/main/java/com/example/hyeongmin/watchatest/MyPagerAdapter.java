package com.example.hyeongmin.watchatest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    int _numOfTabs;

    public MyPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this._numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                MyTabFragment1 tab1 = new MyTabFragment1(); // Fragment 는 알아서 만들자
                return tab1;
            case 1:
                MyTabFragment2 tab2 = new MyTabFragment2();
                return tab2;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return _numOfTabs;
    }
}
