package com.example.firstproject;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.text.Layout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.firstproject.databinding.ActivitySnackbarBinding;

public class snackbar extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySnackbarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);

        Button btn = findViewById(R.id.button);
        RelativeLayout snack = findViewById(R.id.layoutsack);

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(snack, "this is the Snackbar text", Snackbar.LENGTH_LONG)
                        .setAction("Toast", new View.OnClickListener(){

                            @Override
                            public void onClick(View v) {
                                Toast.makeText(snackbar.this, "this is toast inside a snackbar", Toast.LENGTH_SHORT).show();
                            }
                        });
                snackbar.show();
            }
        });

    }


}