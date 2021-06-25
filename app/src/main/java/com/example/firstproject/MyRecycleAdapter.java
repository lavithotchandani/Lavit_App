package com.example.firstproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.ViewHolder>
{
    Context context;
    ArrayList<Hero_recycler> heroes;
    MyRecycleAdapter(Context context, ArrayList<Hero_recycler> heroes)
    {
        this.context=context;
        this.heroes=heroes;
    }

    @NonNull
    @Override
    public MyRecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecycleAdapter.ViewHolder holder, int position) {
        Hero_recycler hero = heroes.get(position);
        holder.txtname.setText(hero.getName());
        holder.txtteam.setText(hero.getTeam());
//        Toast.makeText(context, hero.getName(), Toast.LENGTH_SHORT).show();
        //holder.imageView.setImageDrawable(context.getResources().getDrawable(hero.getImage()));
    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView txtname;
        public TextView txtteam;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.img_listItem);
            this.txtname = (TextView) itemView.findViewById(R.id.txt_listname);
            this.txtteam = (TextView) itemView.findViewById(R.id.txt_listteam);
        }
    }
}
