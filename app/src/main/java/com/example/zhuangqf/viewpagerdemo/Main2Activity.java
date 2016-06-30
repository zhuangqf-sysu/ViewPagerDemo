package com.example.zhuangqf.viewpagerdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    int position;
    TextView rank;
    TextView country;
    TextView population;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        position = getIntent().getIntExtra("position",1);

        rank = (TextView)findViewById(R.id.rank);
        country = (TextView)findViewById(R.id.country);
        population = (TextView)findViewById(R.id.population);

        rank.setText(MyApplication.rank[position]);
        country.setText(MyApplication.country[position]);
        population.setText(MyApplication.population[position]);

    }

}
