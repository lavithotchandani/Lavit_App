package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class contactlist extends AppCompatActivity {
    ListView listView;
    String[] festivals = { "Diwali", "Holi", "Christmas", "Eid", "Baisakhi", "Halloween" ,"Lohri"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactlist);
        listView=findViewById(R.id.contact_items);
//      ArrayAdapter arrayAdapter=new ArrayAdapter(this, R.layout.my_list_layout,R.id.textview,festivals);

        custom_adapter my_adapter = new custom_adapter(this, festivals);
        listView.setAdapter(my_adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String value = festivals[position];
            Toast.makeText(contactlist.this, value, Toast.LENGTH_SHORT).show();
            }
        });

    }
}