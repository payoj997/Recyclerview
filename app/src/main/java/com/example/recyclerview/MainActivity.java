package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> adapterList = new ArrayList<>();
        adapterList.add(new ExampleItem(R.drawable.node,"Text node"));
        adapterList.add(new ExampleItem(R.drawable.oner,"Text one"));
        adapterList.add(new ExampleItem(R.drawable.twor,"Text two"));
        adapterList.add(new ExampleItem(R.drawable.threer,"Text three"));
        adapterList.add(new ExampleItem(R.drawable.fourr,"Text four"));
        adapterList.add(new ExampleItem(R.drawable.fiver,"Text five"));
        adapterList.add(new ExampleItem(R.drawable.sixr,"Text six"));

//      Config for Recycler views

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(adapterList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
