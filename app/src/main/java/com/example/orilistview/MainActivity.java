package com.example.orilistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

/**
 * @author Ori Ingher
 */

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView Lv;
    String choice;
    String[] con = {"America", "Asia", "Africa", "Europe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lv = (ListView) findViewById(R.id.Lv);
        Lv.setOnItemClickListener(this);
        Lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, con);
        Lv.setAdapter(adp);
        /**
         * Adapter between the String array and the List view
         */
    }


    @Override
    /**
     * this function runs at the moment that the list view is thouched
     */
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
/**
 * creating a toast
 */
        Toast.makeText(this, "" + con[position], Toast.LENGTH_SHORT).show();
        choice = con[position];
    }

    /**
     * this function runs at the moment the button Next pressed
     * @param view
     */
    public void Next(View view) {

        Intent si = new Intent(this, Main2Activity.class);

        if (choice.equals("America")) {
            String[] ya = {"Argentina", "Bolivia", "Brazil", "Canada", "Chile", "United States", "Colombia"};
            si.putExtra("con",ya);
        }
        else {
            if (choice.equals("Asia")) {
                String[] ya = {"China", "India", "Japan", "Russia", "Indonesia", "Turkey", "South Korea"};
                si.putExtra("con", ya);
            }
            else {
                if (choice.equals("Africa")) {
                    String[] ya = {"Egypt", "Nigeria", "South Africa", "Algeria", "Morocco", "Ethiopia", "Ghana"};
                    si.putExtra("con", ya);
                }
                else {
                    if (choice.equals("Europe")) {
                        String[] ya = {"Germany", "France", "United Kingdom", "Italy", "Spain", "Ukraine", "Poland"};
                        si.putExtra("con", ya);
                    }
                    else
                    {
                        Toast.makeText(this, "no continental selected,try again" , Toast.LENGTH_SHORT).show();
                    }
                }
             }
        }

        startActivity(si);
        /**
         * the transform from the main to the second activity
         */
    }
}

