package com.frusby.baseproject;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.frusby.baseproject.BaseComponents.BaseFragmentActivity;
import com.frusby.baseproject.adapters.BasicPagerAdapter;
import com.frusby.baseproject.tabs.ConnectTab;
import com.frusby.baseproject.tabs.LocalTab;
import com.frusby.baseproject.tabs.MatchesTab;
import com.frusby.baseproject.tabs.NeedsTab;
import com.frusby.baseproject.tabs.SampleTab;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivityRefugee extends BaseFragmentActivity {

    @Bind(R.id.viewpager)
    ViewPager viewPager;
    @Bind(R.id.tabs)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_refugee);

        ButterKnife.bind(this);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        BasicPagerAdapter adapter = new BasicPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ConnectTab());
        adapter.addFragment(new NeedsTab());
        adapter.addFragment(new MatchesTab());
        adapter.addFragment(new LocalTab());
        viewPager.setAdapter(adapter);
    }

}
