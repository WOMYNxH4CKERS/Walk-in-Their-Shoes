package com.frusby.baseproject.tabs;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.frusby.baseproject.R;

import butterknife.ButterKnife;


/**
 * Created by alexisjouhault on 4/24/16.
 */
public class ConnectTab extends TabFragment {

    public ConnectTab() {
        this.title = "Connect";
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

    private void populateListView() {
        String[] items = {"Hello, I am looking for some temporary housing.", "My children need some coats for the winter.","Where can I take some workforce classes?","Does anyone have the address of a foodbank near me?"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(parentActivity, R.layout.text_view, items);
        ListView list = (ListView) mainView.findViewById(R.id.list_view);
        list.setAdapter(adapter);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.connect_tab, container, false);
        ButterKnife.bind(this, mainView);
        populateListView();
        return mainView;
    }
}
