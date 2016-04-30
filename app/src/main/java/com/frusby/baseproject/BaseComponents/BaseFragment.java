package com.frusby.baseproject.BaseComponents;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;

/**
 * Created by alexisjouhault on 3/29/16.
 */
public class BaseFragment extends Fragment {

    protected String TAG = "";
    protected View mainView;

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, "Attaching fragment");
        super.onAttach(context);
    }

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }

}
