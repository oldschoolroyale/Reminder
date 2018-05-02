package com.example.oldschool.myapplication.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.oldschool.myapplication.R;
import com.example.oldschool.myapplication.dto.RemindDTO;

import java.util.List;

public class RemindListAdapter extends RecyclerView.Adapter<RemindListAdapter.RemindViewHolder> {
    private List<RemindDTO> data;
    private static String LOG_TAG = "myLogs";

    public RemindListAdapter(List<RemindDTO> data) {
        this.data = data;
    }

    @Override
    public RemindViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_item, parent, false);
        return new RemindViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RemindViewHolder holder, int position) {
        holder.title.setText(data.get(position).getTitle());
        holder.title2.setText(data.get(position).getTitle2());
        holder.date.setText(data.get(position).getDate());
        holder.classTxt.setText(data.get(position).getClassTxt());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class RemindViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView title, title2, date, classTxt;

        public RemindViewHolder(View itemView) {
            super(itemView);
            cardView =  itemView.findViewById(R.id.CardView1);
            title =  itemView.findViewById(R.id.title1);
            title2 =  itemView.findViewById(R.id.title2);
            date =  itemView.findViewById(R.id.date);
            classTxt = itemView.findViewById(R.id.classTxt);


        }
    }
}
