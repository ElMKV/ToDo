package com.example.todo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder>{

//    private ArrayList<ToDoAdapter> ToDoArray;
//
//    public ToDoAdapter(ArrayList<ToDoArray> ToDoArray) {
//        this.ToDoArray = ToDoArray;
//    }
//
//    @NonNull
//    @Override
//    public ToDoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ToDoAdapter.ViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }


//public static class ViewHolder extends RecyclerView.ViewHolder{
//        public final View view;
//        public final TextView toDoText;
//
//        public ViewHolder(View view) {
//            super(view);
//            this.view = view;
//            toDoText = view.findViewById(R.id.toDoText);
//
//        }
//    }
//}



    private ArrayList<ToDoItem> jobs;

    public ToDoAdapter(ArrayList<ToDoItem> jobs) {
        this.jobs = jobs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.frame_textview, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ToDoItem job = jobs.get(position);

        holder.name.setText(job.getName());

    }

    @Override
    public int getItemCount() {
        if (jobs != null) {
            return jobs.size();
        } else {
            return 0;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View view;
        public final TextView name;


        public ViewHolder(View view) {
            super(view);
            this.view = view;
            name = view.findViewById(R.id.toDoText);

        }
    }
}






