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
//        populateListView();

    }

//    private void populateListView() {
//        String[] items = {"1600 W. Pennsylvania Ave. Washington DC", "919 University Dr. Riverside, CA","1200 E. California Blvd Pasadena, CA","One Microsoft Way Redmond, WA"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.text_view, items);
//        ListView list = (ListView) findViewById(R.id.list_view);
//        list.setAdapter(adapter);
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.connect_tab, container, false);
        ButterKnife.bind(this, mainView);
        return mainView;
    }
}
