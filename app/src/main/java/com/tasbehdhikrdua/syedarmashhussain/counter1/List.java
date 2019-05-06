package com.tasbehdhikrdua.syedarmashhussain.counter1;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class List extends AppCompatActivity {
    public static final String TAG = "List";


    private ListView list;
    private ArrayList arrayList;
    private ArrayAdapter arrayAdapter;
    private FloatingActionButton fab;


    String[] Mylist = new String[]{

            "Astaghfirullah","Subhana Allah","Alhumdulillah","Allah hu Akbar",
            "Recite Your Dhikr and Dua"
    };

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_list);

     fab = findViewById(R.id.fab);

     fab.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i = new Intent(List.this,FirstActivity.class);
             startActivity(i);
         }
     });



             list = (ListView)findViewById(R.id.ListView);

             arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,Mylist){


            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView ListItemShow = (TextView) view.findViewById(android.R.id.text1);

                ListItemShow.setTextColor(Color.parseColor("#ffffff"));

                return view;
            }
        };
        if(list != null){
            list.setAdapter(arrayAdapter);
        }
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(List.this, MainActivity.class);
                startActivity(i);

                String item = (String)arrayAdapter.getItem(position);

                Toast.makeText(List.this, item+" Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
    }
