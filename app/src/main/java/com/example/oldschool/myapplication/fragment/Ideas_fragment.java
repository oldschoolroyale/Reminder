package com.example.oldschool.myapplication.fragment;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.oldschool.myapplication.R;

public class Ideas_fragment extends AbstracktTabFragment {






    public static FragmentExample getInstance(Context context) {
        Bundle args = new Bundle();
        FragmentExample fragment = new FragmentExample();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.atab_item_ideas));

        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_ideas_fragment, container, false);

        return view;
    }



    @Override
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}