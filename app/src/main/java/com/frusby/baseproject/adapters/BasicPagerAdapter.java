package com.frusby.baseproject.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.frusby.baseproject.tabs.TabFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexisjouhault on 4/24/16.
 */
public class BasicPagerAdapter extends FragmentPagerAdapter {

    List<TabFragment> fragmentList = new ArrayList<>();

    public BasicPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(TabFragment fragment) {
        fragmentList.add(fragment);
    }


    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public Fragment getItem(int position) {
        if (position < fragmentList.size()) {
            return fragmentList.get(position);
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position < fragmentList.size()) {
            return fragmentList.get(position).getTitle();
        }
        return "Tab " + position;
    }
}
