package com.example.androidretrofit.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidretrofit.Model.ModelInformation;
import com.example.androidretrofit.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectAdapter extends  RecyclerView.Adapter<ProjectAdapter.Holder>{


    private List<ModelInformation> list;
    private Context context;

    public ProjectAdapter(List<ModelInformation> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,parent,false);
        return  new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        holder.text1.setText(list.get(position).getBandwidth());
        holder.text2.setText(list.get(position).getNetworktype());
        holder.text3.setText(list.get(position).getOfficeAddress());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        TextView text1,text2,text3;

        public Holder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.text1);
            text2 = itemView.findViewById(R.id.text2);
            text3 = itemView.findViewById(R.id.text3);
        }
    }
}
