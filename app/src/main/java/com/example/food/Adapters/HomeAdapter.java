package com.example.food.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>{

    Context mContext;
    ArrayList<String> mYear=new ArrayList<>();
    ArrayList<String> mDuration=new ArrayList<>();

    public HomeAdapter(Context mContext, ArrayList<String> mYear, ArrayList<String> mDuration) {
        this.mContext = mContext;
        this.mYear = mYear;
        this.mDuration = mDuration;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_home_recycler,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.wallpaper.setImageResource(R.mipmap.p);
        holder.duration.setText(mDuration.get(position));
        holder.year.setText(mYear.get(position));
    }

    @Override
    public int getItemCount() {
        return mYear.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView wallpaper;
        TextView year,duration;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            wallpaper=itemView.findViewById(R.id.iv_wallpaper);
            year=itemView.findViewById(R.id.txt_year);
            duration=itemView.findViewById(R.id.txt_duration);
        }
    }
}
