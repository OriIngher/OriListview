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

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView Lv;
    Button Next;
    String choice;
    String[] con = {"America", "Asia", "Africa", "Europe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lv = (ListView) findViewById(R.id.Lv);
        Next = (Button) findViewById(R.id.Next);
        Lv.setOnItemClickListener(this);
        Lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, con);
        Lv.setAdapter(adp);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "" + con[position], Toast.LENGTH_SHORT).show();
        choice = con[position];

    }

    public void go(View view) {
        Intent si = new Intent(this, Main2Activity.class);


        if (choice.equals("America")) {
            String[] am = {"Argentina", "Bolivia", "Brazil", "Canada", "Chile", "United States", "Colombia"};
            si.putExtra("con", am);
        }
        if (choice.equals("Asia")) {
            String[] as = {"China", "India", "Japan", "Russia", "Indonesia", "Turkey", "South Korea"};
            si.putExtra("con", as);
        }
        if (choice.equals("Africa")) {
            String[] af = {"Egypt", "Nigeria", "South Africa", "Algeria", "Morocco", "Ethiopia", "Ghana"};
            si.putExtra("con", af);
        }
        if (choice.equals("Europe")) {
            String[] eu = {"Germany", "France", "United Kingdom", "Italy", "Spain", "Ukraine", "Poland"};
            si.putExtra("con", eu);
        }

        startActivity(si);
    }
}

