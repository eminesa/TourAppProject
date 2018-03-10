package com.example.eminesa.tourapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eminesa.tourapp.models.Hotel;

import java.util.ArrayList;

/**
 * Created by eminesa on 13.12.2017.
 */

public class HotelAdapter extends ArrayAdapter<Hotel> {

    public HotelAdapter(Activity context, ArrayList<Hotel> androidFlavors) {
        super(context, 0, androidFlavors);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hotel_item, parent, false);
        }

        Hotel currentAnimal = getItem(position);

        ImageView imageHotel = listItemView.findViewById(R.id.image);
        TextView textViewName = listItemView.findViewById(R.id.text_view);

        imageHotel.setImageResource(currentAnimal.getImage());
        textViewName.setText(currentAnimal.getName());

        return listItemView;
    }

}