package com.example.a3_recyclerview;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.textview_name);
    }

    public void bind(String name){
        textView.setText(name);
    }
}