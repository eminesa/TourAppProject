package com.example.eminesa.tourapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eminesa.tourapp.models.Galeria;

import java.util.List;

/**
 * Created by eminesa on 14.12.2017.
 */

public class GaleriaAdapter extends ArrayAdapter<Galeria> {

    public GaleriaAdapter(@NonNull Context context, List<Galeria> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.galeria_item, parent, false);
        }
        Galeria currentGaleria = getItem(position);
        ImageView imageHotel = listItemView.findViewById(R.id.image_view_galeri);
        TextView textViewName = listItemView.findViewById(R.id.text_view_title);

        imageHotel.setImageResource(currentGaleria.getImage());
        textViewName.setText(currentGaleria.getName());

        return listItemView;
    }
}