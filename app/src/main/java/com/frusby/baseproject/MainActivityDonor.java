package com.frusby.baseproject;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.frusby.baseproject.BaseComponents.BaseFragmentActivity;
import com.frusby.baseproject.adapters.BasicPagerAdapter;
import com.frusby.baseproject.tabs.SampleTab;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivityDonor extends BaseFragmentActivity {

    @Bind(R.id.viewpager)
    ViewPager viewPager;
    @Bind(R.id.tabs)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        BasicPagerAdapter adapter = new BasicPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SampleTab());
        adapter.addFragment(new SampleTab());
        adapter.addFragment(new SampleTab());
        viewPager.setAdapter(adapter);
    }

}
