package com.example.oldschool.myapplication.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.View;

public class AbstracktTabFragment extends Fragment {
    private String title;
    private String title2;
    private String date;
    private String classTxt;
    protected Context context;
    protected View view;

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClassTxt() {
        return classTxt;
    }

    public void setClassTxt(String classTxt) {
        this.classTxt = classTxt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
