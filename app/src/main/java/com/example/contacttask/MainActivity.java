package com.example.contacttask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListData[] myListData = new MyListData[] {
                new MyListData("Person 1", android.R.drawable.btn_star),
                new MyListData("Person 2", android.R.drawable.btn_star),
                new MyListData("Person 3", android.R.drawable.btn_star),
                new MyListData("Person 4", android.R.drawable.btn_star),
                new MyListData("Person 5", android.R.drawable.btn_star),
                new MyListData("Person 6", android.R.drawable.btn_star),
                new MyListData("Person 7", android.R.drawable.btn_star),
                new MyListData("Person 8", android.R.drawable.btn_star),
                new MyListData("Person 9", android.R.drawable.btn_star),
                new MyListData("Person 10", android.R.drawable.btn_star),
                new MyListData("Person 11", android.R.drawable.btn_star),
                new MyListData("Person 12", android.R.drawable.btn_star),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}