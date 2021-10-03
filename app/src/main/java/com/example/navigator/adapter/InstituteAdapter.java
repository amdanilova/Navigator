package com.example.navigator.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.Institutes;
import com.example.navigator.R;
import com.example.navigator.logotip;

import java.util.List;

public class InstituteAdapter extends RecyclerView.Adapter<InstituteAdapter.InstitutesViewHolder> {
    Context context;
    List<Institutes> institutesList;


    public InstituteAdapter(Context context,List<Institutes> institutesList) {
        this.context = context;
        this.institutesList=institutesList;
    }

    @NonNull
    @Override
    public InstitutesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View institutesitems= LayoutInflater.from(context).inflate(R.layout.institute_item,parent,false);
         return new InstituteAdapter.InstitutesViewHolder(institutesitems);
    }

    @Override
    public void onBindViewHolder(@NonNull InstitutesViewHolder holder, int position) {
        int imageId=context.getResources().getIdentifier("ic_"+institutesList.get(position).getImg(),"drawable",context.getPackageName());
        holder.instituteImage.setImageResource(imageId);
        holder.instituteTitle.setText(institutesList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return institutesList.size();
    }

    public static final class InstitutesViewHolder extends RecyclerView.ViewHolder{

        ImageView instituteImage;
        TextView instituteTitle;
        public InstitutesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    }

