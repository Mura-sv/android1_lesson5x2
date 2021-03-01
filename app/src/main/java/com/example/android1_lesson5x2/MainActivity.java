package com.example.android1_lesson5x2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(manager);

        ArrayList<ItemModel> list = new ArrayList<>();
        list.add(0,new ItemModel("Ties", R.drawable.ties));
        list.add(0,new ItemModel("Outerwear", R.drawable.outerwear));
        list.add(0,new ItemModel("Shoes", R.drawable.shoes));

        adapter.addText(list);
    }
}