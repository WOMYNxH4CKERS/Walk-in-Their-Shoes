package com.frusby.baseproject.tabs;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.frusby.baseproject.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by alexisjouhault on 4/24/16.
 */
public class NeedsTab extends TabFragment {

    private ColorDrawable colorDrawable;

    public NeedsTab() {
        this.title = "Needs";
    }

    @Bind(R.id.food_button)
    View foodButton;

    @Bind(R.id.clothes_button)
    View clothesButton;

    @Bind(R.id.housing_button)
    View housingButton;

    @Bind(R.id.money_button)
    View moneyButton;

    @Bind(R.id.medical_button)
    View medicalButton;

    @Bind(R.id.education_button)
    View educationButton;

    boolean[] selectArray = new boolean[6];

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
        mainView = inflater.inflate(R.layout.needs_tab, container, false);
        ButterKnife.bind(this, mainView);

        colorDrawable = new ColorDrawable(Color.CYAN);
        colorDrawable.setAlpha(50);
        return mainView;
    }



    @OnClick(R.id.food_button)
    public void onClickFoodButton() {
        if (!selectArray[0]) {
            foodButton.setBackground(colorDrawable);
        } else {
            foodButton.setBackground(new ColorDrawable(Color.TRANSPARENT));

        }
        selectArray[0] = !selectArray[0];
    }

    @OnClick(R.id.clothes_button)
    public void onClickClothesButton() {
        if (!selectArray[1]) {
            clothesButton.setBackground(colorDrawable);
        }
        else{
            clothesButton.setBackground(new ColorDrawable(Color.TRANSPARENT));
        }
        selectArray[1] = !selectArray[1];
    }

    @OnClick(R.id.housing_button)
    public void onClickHousingButton() {
        if (!selectArray[2]) {
            housingButton.setBackground(colorDrawable);
        }
        else{
            housingButton.setBackground(new ColorDrawable(Color.TRANSPARENT));
        }
        selectArray[2] = !selectArray[2];
    }

    @OnClick(R.id.money_button)
    public void onClickMoneyButton() {
        if (!selectArray[3]) {
            moneyButton.setBackground(colorDrawable);
        }
        else{
            moneyButton.setBackground(new ColorDrawable(Color.TRANSPARENT));
        }
        selectArray[3] = !selectArray[3];
    }

    @OnClick(R.id.medical_button)
    public void onClickMedicalButton() {
        if (!selectArray[4]) {
            medicalButton.setBackground(colorDrawable);
        }
        else{
            medicalButton.setBackground(new ColorDrawable(Color.TRANSPARENT));
        }
        selectArray[4] = !selectArray[4];
    }

    @OnClick(R.id.education_button)
    public void onClickEducationButton() {
        if (!selectArray[5]) {
            educationButton.setBackground(colorDrawable);
        }
        else{
            educationButton.setBackground(new ColorDrawable(Color.TRANSPARENT));
        }
        selectArray[5] = !selectArray[5];
    }





}
