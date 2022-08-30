package com.example.myapplicationcw7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class foodAdapter extends ArrayAdapter {
    List<Food> foodList;
    public foodAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
     foodList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);

        Food currentFood = foodList.get(position);

        TextView foodNameTextView = view.findViewById(R.id.foodName);
        TextView foodPriceTextView = view.findViewById(R.id.priceNumber);
        ImageView foodimageView = view.findViewById(R.id.imageView);

        foodNameTextView.setText(currentFood.getFoodName());
        foodPriceTextView.setText(String.valueOf(currentFood.getFoodPrice()));
        foodimageView.setImageResource(currentFood.getFoodImage());
        return view ;



    }
}
