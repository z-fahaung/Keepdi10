package com.example.zfah.keepdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


import java.util.ArrayList;


public class Main3Activity extends AppCompatActivity {
    Spinner spncate;
    Button btnpick;
    ArrayList<String> category = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnpick = (Button)findViewById(R.id.btnpick);
        spncate = (Spinner)findViewById(R.id.spncate);
        createCategory();
        ArrayAdapter<String> adptCate = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,category);
        spncate.setAdapter(adptCate);
        btnpick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link3 = new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(link3);
            }
        });

    }
    public void createCategory(){
        category.add("Category");
        category.add("Shopping");
        category.add("Bill");
        category.add("Taxi");
        category.add("Food");
        category.add("Other");
    }
    }

