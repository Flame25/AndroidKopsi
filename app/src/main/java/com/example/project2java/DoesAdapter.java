package com.example.project2java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DoesAdapter extends RecyclerView.Adapter<DoesAdapter.MyViewHolder>{
    Context context;
    ArrayList<MyDoes> myDoes;

    public DoesAdapter(Context c , ArrayList<MyDoes> p) {
        this.myDoes = p;
        this.context = c;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view =  LayoutInflater.from(context).inflate(R.layout.item_does,viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MyDoes mD = myDoes.get(position);
        holder.mtitle.setText(mD.getTitledoes());
        holder.mdesc.setText(mD.getDescdoes());
        holder.mdate.setText(mD.getDatedoes());
    }

    @Override
    public int getItemCount() {
        return myDoes.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mtitle, mdesc, mdate;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mtitle = (TextView) itemView.findViewById(R.id.titledoes);
            mdesc = (TextView) itemView.findViewById(R.id.descdoes);
            mdate = (TextView) itemView.findViewById(R.id.datedoes);
        }
    }
}
