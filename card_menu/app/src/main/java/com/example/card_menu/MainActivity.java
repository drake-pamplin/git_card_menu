package com.example.card_menu;

import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<RecyclerItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        //generate sample data
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                listItems.add(new RecyclerItem("Item " + (i + 1), "Hello there, friend. This is the description of item " + (i + 1), ResourcesCompat.getDrawable(getResources(), R.drawable.tnt_bg, null)));
            }
            else {
                listItems.add(new RecyclerItem("Item " + (i + 1), "Hello there, friend. This is the description of item " + (i + 1), ResourcesCompat.getDrawable(getResources(), R.drawable.location_bg, null)));
            }
        }

        //set adapter
        adapter = new MyAdapter(listItems, this);
        recyclerView.setAdapter(adapter);
    }
}
