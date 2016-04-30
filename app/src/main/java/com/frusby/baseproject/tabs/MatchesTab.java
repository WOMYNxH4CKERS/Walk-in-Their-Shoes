package com.frusby.baseproject.tabs;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.frusby.baseproject.R;

import butterknife.ButterKnife;


/**
 * Created by alexisjouhault on 4/24/16.
 */
public class MatchesTab extends TabFragment {

    public MatchesTab() {
        this.title = "Sample";
    }

    @Override
    public void onAttach(Context context) {
        TAG = context.getString(R.string.tab_title);
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragment_tab, container, false);
        ButterKnife.bind(this, mainView);
        return mainView;
    }
}
