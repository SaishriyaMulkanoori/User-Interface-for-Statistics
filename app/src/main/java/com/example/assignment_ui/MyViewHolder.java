package com.example.assignment_ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imgView;
    TextView nameView,timeView,costView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imgView=itemView.findViewById(R.id.img);
        nameView=itemView.findViewById(R.id.name);
        timeView=itemView.findViewById(R.id.time);
        costView=itemView.findViewById(R.id.cost);

    }
}
