package com.example.orilistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Intent gi;
    String[] ya;
    Button Back;
TextView Capital,Population;
ListView Lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gi =  getIntent();
        ya = gi.getStringArrayExtra("con");
        Back = (Button) findViewById(R.id.Back);
        Capital = (TextView) findViewById(R.id.Capital);
        Population = (TextView) findViewById(R.id.Population);
        Lv1 = (ListView) findViewById(R.id.Lv1);
        Lv1.setOnClickListener((View.OnClickListener)this);
        Lv1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        ArrayAdapter<String> adp1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,ya);
        Lv1.setAdapter(adp1);
    }

    public void goo(View view) {
        finish();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if ("Argentina".equals(ya[0]))
        {
            Capital.setText("Buenos Aires");
            Population.setText("44.27 million");
        }
        if ("Bolivia".equals(ya[0]))
        {
            Capital.setText("Sucre");
            Population.setText("11.05 million");
        }
        if ("Brazil".equals(ya[0]))
        {
            Capital.setText("Brasilia");
            Population.setText("209.3 million ");
        }if ("Canada".equals(ya[0]))
        {
            Capital.setText("Ottawa");
            Population.setText("37.06 million");
        }if ("Chile".equals(ya[0]))
        {
            Capital.setText("Santiago");
            Population.setText("18.05 million");
        }if ("United States".equals(ya[0]))
        {
            Capital.setText("Washington");
            Population.setText("327.2 million");
        }if ("Colombia".equals(ya[0]))
        {
            Capital.setText("Bogota");
            Population.setText("49 million");
        }if ("China".equals(ya[0]))
        {
            Capital.setText("Beijing");
            Population.setText("1.386 billion");
        }if ("India".equals(ya[0]))
        {
            Capital.setText("New Delhi");
            Population.setText("1.339 billion");
        }if ("Japan".equals(ya[0]))
        {
            Capital.setText("Tokio");
            Population.setText("126.8 million");
        }if ("Russia".equals(ya[0]))
        {
            Capital.setText("Moscow");
            Population.setText("144.5 million");
        }if ("Indonesia".equals(ya[0]))
        {
            Capital.setText("Jakarta");
            Population.setText("264 million");
        }if ("Turkey".equals(ya[0]))
        {
            Capital.setText("Ankara");
            Population.setText("79.8 million");
        }if ("South Korea".equals(ya[0]))
        {
            Capital.setText("Seoul");
            Population.setText("51.7 million");
        }if ("Egypt".equals(ya[0]))
        {
            Capital.setText("Cairo");
            Population.setText("97.55 million");
        }if ("Nigeria".equals(ya[0]))
        {
            Capital.setText("Abuja");
            Population.setText("190.9 million");
        }if ("South Africa".equals(ya[0]))
        {
            Capital.setText("Cape Town");
            Population.setText("57.7 million");
        }if ("Algeria".equals(ya[0]))
        {
            Capital.setText("Algiers");
            Population.setText("41.32 million");
        }if ("Morocco".equals(ya[0]))
        {
            Capital.setText("Rabat");
            Population.setText("35.7 million");
        }if ("Ethiopia".equals(ya[0]))
        {
            Capital.setText("Addis Ababa");
            Population.setText("105 million");
        }if ("Ghana".equals(ya[0]))
        {
            Capital.setText("Accra");
            Population.setText("28.83 million");
        }if ("Germany".equals(ya[0]))
        {
            Capital.setText("Berlin");
            Population.setText("83 million");
        }if ("France".equals(ya[0]))
        {
            Capital.setText("Paris");
            Population.setText("66.99 million");
        }if ("United Kingdom".equals(ya[0]))
        {
            Capital.setText("London");
            Population.setText("67.5 million");
        }if ("Italy".equals(ya[0]))
        {
            Capital.setText("Rome");
            Population.setText("60.59 million");
        }if ("Spain".equals(ya[0]))
        {
            Capital.setText("Madrid");
            Population.setText("46.9 million");
        }if ("Ukraine".equals(ya[0]))
        {
            Capital.setText("Kyiv");
            Population.setText("44.83 million");
        }if ("Poland".equals(ya[0]))
        {
            Capital.setText("Warsaw");
            Population.setText("38.43 million");
        }
    }
    }

