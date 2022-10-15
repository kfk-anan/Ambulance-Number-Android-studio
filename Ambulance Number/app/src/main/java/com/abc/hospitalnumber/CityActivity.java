package com.abc.hospitalnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CityActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        ListView listView=(ListView)findViewById(R.id.listview);

        final ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Dhaka");
        arrayList.add("Khulna");
        arrayList.add("Barisal");
        arrayList.add("Chittagong");
        arrayList.add("Mymensingh");
        arrayList.add("Rajshahi");
        arrayList.add("Rangpur");
        arrayList.add("Sylhet");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                Intent intent = new Intent(CityActivity.this,DhakaActivity.class);
                startActivity(intent);
                }
                if (i==1){
                    Intent intent = new Intent(CityActivity.this,DhakaActivity.class);
                    startActivity(intent);
                }
                if (i==2){
                    Intent intent = new Intent(CityActivity.this,DhakaActivity.class);
                    startActivity(intent);
                }
                if (i==3){
                    Intent intent = new Intent(CityActivity.this,DhakaActivity.class);
                    startActivity(intent);
                }
                if (i==4){
                    Intent intent = new Intent(CityActivity.this,DhakaActivity.class);
                    startActivity(intent);
                }
                if (i==5){
                    Intent intent = new Intent(CityActivity.this,DhakaActivity.class);
                    startActivity(intent);
                }
                if (i==6){
                    Intent intent = new Intent(CityActivity.this,DhakaActivity.class);
                    startActivity(intent);
                }
                if (i==7){
                    Intent intent = new Intent(CityActivity.this,DhakaActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
