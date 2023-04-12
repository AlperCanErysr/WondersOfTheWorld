package com.can_erysr.wondersoftheworld;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.can_erysr.wondersoftheworld.databinding.RecyclerRowBinding;

import java.util.ArrayList;

import javax.xml.namespace.QName;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.WondersHolder> {

    ArrayList<Wonders> wondersArrayList;

    public RecyclerAdapter(ArrayList<Wonders> wondersArrayList) {
        this.wondersArrayList = wondersArrayList;
    }

    @NonNull
    @Override
    public WondersHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new WondersHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull WondersHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.binding.recyclerViewTextView.setText(wondersArrayList.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(),DetailsActivity.class);
                intent.putExtra("wondersoftheworld", wondersArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return wondersArrayList.size();
    }

    public class WondersHolder extends RecyclerView.ViewHolder{
        private RecyclerRowBinding binding;

        public WondersHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}
