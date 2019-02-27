package com.example.felixits.mytask.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.felixits.mytask.R;


public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView name,members,info;
    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.meetingname);
        members=itemView.findViewById(R.id.membercount);
        info=itemView.findViewById(R.id.description);
    }
}
