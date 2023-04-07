package com.example.firstApplication.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.firstApplication.R;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<Item> {
    private LayoutInflater inflater;
    private int layout;
    private ArrayList<Item> items;

    public CustomListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Item> objects) {
        super(context, resource, objects);
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);
        ImageView imageView = view.findViewById(R.id.imageView6);
        TextView nameView = view.findViewById(R.id.textView2);
        imageView.setImageResource(getItem(position).getImage());
        nameView.setText(getItem(position).getNameItem());
        return view;
    }

}