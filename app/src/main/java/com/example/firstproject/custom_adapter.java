package com.example.firstproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custom_adapter extends BaseAdapter {

    Context context;
    String[] festivals;

    public custom_adapter(Context context, String[] festivals){
            this.context = context;
            this.festivals = festivals;
    }


    @Override
    public int getCount() {
        return festivals.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.my_list_layout, parent, false);

        ImageView imageView = view.findViewById(R.id.imageView);

        TextView textView = view.findViewById(R.id.textview);

        textView.setText(festivals[position]);

        return view;
    }
}

/*The LayourInflater class is used to instantiate the contents of layout XML files into their corresponding view objects.
  In other words, it takes the XML file as an input and builds the view objects from it.*/