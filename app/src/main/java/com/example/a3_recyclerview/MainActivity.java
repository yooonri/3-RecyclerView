package com.example.a3_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> name= new ArrayList<>();
    private RecyclerView recyclerViewName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewName=findViewById(R.id.name_recycler);
        for (int i = 1; i <= 20; i++) {
            name.add("Name "+i);
        }
        NameAdapter nameAdapter= new NameAdapter(name);
        recyclerViewName.setAdapter(nameAdapter);
    }
}