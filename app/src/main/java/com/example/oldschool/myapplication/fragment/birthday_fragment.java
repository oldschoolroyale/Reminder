package com.example.oldschool.myapplication.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oldschool.myapplication.R;

public class birthday_fragment extends AbstracktTabFragment {






    public static FragmentExample getInstance(Context context) {
        Bundle args = new Bundle();
        FragmentExample fragment = new FragmentExample();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.atab_item_birthday));

        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_birthday_fragment, container, false);

        return view;
    }



    public void setTitle(String title) {
       this.setTitle(title);
    }

    @Override
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
