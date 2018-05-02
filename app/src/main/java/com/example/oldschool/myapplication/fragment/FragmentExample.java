package com.example.oldschool.myapplication.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.oldschool.myapplication.R;
import com.example.oldschool.myapplication.adapter.RemindListAdapter;
import com.example.oldschool.myapplication.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

public class FragmentExample extends AbstracktTabFragment {
    private static final int LAYOUT = R.layout.fragment_history;





    public static FragmentExample getInstance(Context context) {
        Bundle args = new Bundle();
        FragmentExample fragment = new FragmentExample();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.atab_item_history));

        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new RemindListAdapter(createMockData()));
        return view;
    }

    private List<RemindDTO> createMockData() {
        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO(1, "Супер идея", "Доделать приложение RemindMe до конца","2.05.2018","Ideas"));
        data.add(new RemindDTO(2, "Должен сделать","Не забудь позвонить маме","01.05.2018","TODO"));
        data.add(new RemindDTO(3, "День рождения","Мой день рождения","01.02.2019","Birthday"));
        data.add(new RemindDTO(4, "Не забудь","Экзамен чешского","09.06.2019","TODO"));
        return data;
    }


    @Override
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
