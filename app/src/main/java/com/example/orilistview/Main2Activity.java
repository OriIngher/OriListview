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
    Intent gi =  getIntent();
    String[] ya = gi.getStringArrayExtra("con");
    Button Back;
TextView Capital,Population;
ListView Lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Back = (Button) findViewById(R.id.Back);
        Capital = (TextView) findViewById(R.id.Capital);
        Population = (TextView) findViewById(R.id.Population);
        Lv1 = (ListView) findViewById(R.id.Lv1);
        Lv1.setOnClickListener((View.OnClickListener)this);
        Lv1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        ArrayAdapter<String> adp1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item);
        Lv1.setAdapter(adp1);
    }

    public void goo(View view) {
        finish();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if ("Argentina".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }
        if ("Bolivia".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }
        if ("Brazil".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Canada".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Chile".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("United States".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Colombia".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("China".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("India".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Japan".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Russia".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Indonesia".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Turkey".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("South Korea".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Egypt".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Nigeria".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("South Africa".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Algeria".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Morocco".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Ethiopia".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Ghana".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Germany".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("France".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("United Kingdom".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Italy".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Spain".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Ukraine".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }if ("Poland".equals(ya[0]))
        {
            Capital.setText("Tokyo");
            Population.setText("126,168,156");
        }
    }
    }

