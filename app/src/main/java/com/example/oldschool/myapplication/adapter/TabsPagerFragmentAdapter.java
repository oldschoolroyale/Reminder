package com.example.oldschool.myapplication.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.oldschool.myapplication.R;
import com.example.oldschool.myapplication.fragment.AbstracktTabFragment;
import com.example.oldschool.myapplication.fragment.FragmentExample;
import com.example.oldschool.myapplication.fragment.Ideas_fragment;
import com.example.oldschool.myapplication.fragment.Todo_fragment;
import com.example.oldschool.myapplication.fragment.birthday_fragment;

import java.util.HashMap;
import java.util.Map;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {
    private Map<Integer, AbstracktTabFragment> tabs;
    private Context context;
    public TabsPagerFragmentAdapter(Context context,FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);


    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {

        return tabs.get(position);
    }



    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, FragmentExample.getInstance(context));
        tabs.put(1, Ideas_fragment.getInstance(context));
        tabs.put(2, Todo_fragment.getInstance(context));
        tabs.put(3, birthday_fragment.getInstance(context));
    }
}
