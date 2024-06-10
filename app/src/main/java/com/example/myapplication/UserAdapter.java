package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    List<UserModel> list;
    Context context;

    public UserAdapter(List<UserModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.sl_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        holder.textView.setText(list.get(position).getTitle()     );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

     class UserViewHolder extends RecyclerView.ViewHolder
    {

        TextView textView;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.text_id);
        }
    }
}
