package com.frusby.baseproject.tabs;

import android.content.Context;

import com.frusby.baseproject.BaseComponents.BaseFragment;
import com.frusby.baseproject.BaseComponents.BaseFragmentActivity;

/**
 * Created by alexisjouhault on 4/24/16.
 */
public class TabFragment extends BaseFragment {

    protected BaseFragmentActivity parentActivity;
    protected String title;

    @Override
    public void onAttach(Context context) {
        this.parentActivity = (BaseFragmentActivity) context;
        super.onAttach(context);
    }

    public String getTitle() {
        return title;
    }
}
