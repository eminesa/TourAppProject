package com.example.eminesa.tourapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eminesa.tourapp.models.Restaurant;

import java.util.ArrayList;

/**
 * Created by eminesa on 14.12.2017.
 */
public class RestaurantAdapter extends ArrayAdapter<Restaurant> {
    public RestaurantAdapter(Activity context, ArrayList<Restaurant> androidFlavors) {
        super(context, 0, androidFlavors);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.reataurant_item, parent, false);
        }

        Restaurant currentRestaurant = getItem(position);

        ImageView imageHotel = listItemView.findViewById(R.id.image_view_one);
        TextView textViewName = listItemView.findViewById(R.id.text_view_title);
        TextView textViewKnow = listItemView.findViewById(R.id.text_view_know);


        imageHotel.setImageResource(currentRestaurant.getImage());
        textViewName.setText(currentRestaurant.getName());
        textViewKnow.setText(currentRestaurant.getKnowladge());

        return listItemView;
    }
}
