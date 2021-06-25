package com.example.firstproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class loginpage extends AppCompatActivity /*implements PopupMenu.OnMenuItemClickListener*/{

//    Button btn = findViewById(R.id.button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
//         btn.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View v) {
////                 PopupMenu popupMenu=new PopupMenu(getApplicationContext(),v);
////                 popupMenu.inflate(R.menu.menu_items);
////                 popupMenu.setOnMenuItemClickListener(loginpage.this);
////                 popupMenu.show();
//             }
//         });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_item1:
                Toast.makeText(this, "ADD", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_item2:
                Toast.makeText(this, "delete", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /*@Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_item1:
                Toast.makeText(this, "ADD", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_item2:
                Toast.makeText(this, "delete", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }*/
    }
