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

/**
 * @author Ori Ingher
 */
public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Intent gi;
    String[] ya;
    String choice2;
    TextView Capital,Population;
    ListView Lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gi =  getIntent();
        ya = gi.getStringArrayExtra("con");
        Capital = (TextView) findViewById(R.id.Capital);
        Population = (TextView) findViewById(R.id.Population);
        Lv1 = (ListView) findViewById(R.id.Lv1);
        Lv1.setOnItemClickListener(this);
        Lv1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        ArrayAdapter<String> adp1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,ya);
        Lv1.setAdapter(adp1);
        /**
         * Adapter between the String array and the List view
         */
    }

    /**
     * the function runs at the moment the Back button is pressed/back to main activity
     * @param view
     */
    public void goo(View view) {
        finish();
    }

    @Override

    /**
     * the function runs at the moment that the list view is touched
     */
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        choice2 = ya[position];
        if ("Argentina".equals(choice2))
        {
            Capital.setText("Capital city: Buenos Aires");
            Population.setText("Population: 44.27 million");
        }
        if ("Bolivia".equals(choice2))
        {
            Capital.setText("Capital city: Sucre");
            Population.setText("Population: 11.05 million");
        }
        if ("Brazil".equals(choice2))
        {
            Capital.setText("Capital city: Brasilia");
            Population.setText("Population: 209.3 million ");
        }if ("Canada".equals(choice2))
        {
            Capital.setText("Capital city: Ottawa");
            Population.setText("Population: 37.06 million");
        }if ("Chile".equals(choice2))
        {
            Capital.setText("Capital city: Santiago");
            Population.setText("Population: 18.05 million");
        }if ("United States".equals(choice2))
        {
            Capital.setText("Capital city: Washington");
            Population.setText("Population: 327.2 million");
        }if ("Colombia".equals(choice2))
        {
            Capital.setText("Capital city: Bogota");
            Population.setText("Population: 49 million");
        }if ("China".equals(choice2))
        {
            Capital.setText("Capital city: Beijing");
            Population.setText("Population: 1.386 billion");
        }if ("India".equals(choice2))
        {
            Capital.setText("Capital city: New Delhi");
            Population.setText("Population: 1.339 billion");
        }if ("Japan".equals(choice2))
        {
            Capital.setText("Capital city: Tokio");
            Population.setText("Population: 126.8 million");
        }if ("Russia".equals(choice2))
        {
            Capital.setText("Capital city: Moscow");
            Population.setText("Population: 144.5 million");
        }if ("Indonesia".equals(choice2))
        {
            Capital.setText("Capital city: Jakarta");
            Population.setText("Population: 264 million");
        }if ("Turkey".equals(choice2))
        {
            Capital.setText("Capital city: Ankara");
            Population.setText("Population: 79.8 million");
        }if ("South Korea".equals(choice2))
        {
            Capital.setText("Capital city: Seoul");
            Population.setText("Population: 51.7 million");
        }if ("Egypt".equals(choice2))
        {
            Capital.setText("Capital city: Cairo");
            Population.setText("Population: 97.55 million");
        }if ("Nigeria".equals(choice2))
        {
            Capital.setText("Capital city: Abuja");
            Population.setText("Population: 190.9 million");
        }if ("South Africa".equals(choice2))
        {
            Capital.setText("Capital city: Cape Town");
            Population.setText("Population: 57.7 million");
        }if ("Algeria".equals(choice2))
        {
            Capital.setText("Capital city: Algiers");
            Population.setText("Population: 41.32 million");
        }if ("Morocco".equals(choice2))
        {
            Capital.setText("Capital city: Rabat");
            Population.setText("Population: 35.7 million");
        }if ("Ethiopia".equals(choice2))
        {
            Capital.setText("Capital city: Addis Ababa");
            Population.setText("Population: 105 million");
        }if ("Ghana".equals(choice2))
        {
            Capital.setText("Capital city: Accra");
            Population.setText("Population: 28.83 million");
        }if ("Germany".equals(choice2))
        {
            Capital.setText("Capital city: Berlin");
            Population.setText("Population: 83 million");
        }if ("France".equals(choice2))
        {
            Capital.setText("Capital city: Paris");
            Population.setText("Population: 66.99 million");
        }if ("United Kingdom".equals(choice2))
        {
            Capital.setText("Capital city: London");
            Population.setText("Population: 67.5 million");
        }if ("Italy".equals(choice2))
        {
            Capital.setText("Capital city: Rome");
            Population.setText("Population: 60.59 million");
        }if ("Spain".equals(choice2))
        {
            Capital.setText("Capital city: Madrid");
            Population.setText("Population: 46.9 million");
        }if ("Ukraine".equals(choice2))
        {
            Capital.setText("Capital city: Kyiv");
            Population.setText("Population: 44.83 million");
        }if ("Poland".equals(choice2))
        {
            Capital.setText("Capital city: Warsaw");
            Population.setText("Population: 38.43 million");
        }
    }
    }

