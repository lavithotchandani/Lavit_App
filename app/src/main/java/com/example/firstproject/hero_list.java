package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class hero_list extends AppCompatActivity {
    ListView listView;
    TextView textView;

    ArrayList<Hero> heroes;
    //String[] festivals = { "Diwali", "Holi", "Christmas", "Eid", "Baisakhi", "Halloween" ,"Lohri"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout_2);

        listView=findViewById(R.id.contact_items);
        textView=findViewById(R.id.headtext);

        heroes=new ArrayList<>();

        heroes.add(new Hero(R.drawable.spiderman,"SpiderMan","Avengers"));
        heroes.add(new Hero(R.drawable.ironman,"IronMan","Avengers"));
        heroes.add(new Hero(R.drawable.captain,"Captain America","Avengers"));
        heroes.add(new Hero(R.drawable.thor,"Thor","Avengers"));
        //ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.list_item,R.id.txt_listItem,festivals);

        Hero_list_adapter myheroAdapter=new Hero_list_adapter(this,heroes);
        listView.setAdapter(myheroAdapter);






        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String value=festivals[position];
                Toast.makeText(contactlist.this, value, Toast.LENGTH_SHORT).show();
            }
        });
*/
    }
}