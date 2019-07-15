package com.example.ayush.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mainListView = (ListView) findViewById(R.id.mainListView);

        final ArrayList<String> family = new ArrayList<String>();
        family.add("Ayush");
        family.add("Sarthak");
        family.add("Richa");
        family.add("Prabhat");
        family.add("Poonam");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, family);

        mainListView.setAdapter(arrayAdapter);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("Clicked on item: ", family.get(i));
                Toast.makeText(MainActivity.this, "You clicked on " + family.get(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
