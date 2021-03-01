package com.example.android1_lesson5x2;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    ImageView imageItem;
    TextView textItem;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        imageItem = itemView.findViewById(R.id.cv_image_value);
        textItem = itemView.findViewById(R.id.cv_text);
    }

    public void onBind(ItemModel data) {
        imageItem.setImageResource(data.image);
        textItem.setText(data.text);
    }
}
