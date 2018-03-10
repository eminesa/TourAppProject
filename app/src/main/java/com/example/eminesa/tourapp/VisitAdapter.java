package com.example.eminesa.tourapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eminesa.tourapp.models.Visit;

import java.util.List;

/**
 * Created by eminesa on 14.12.2017.
 */

public class VisitAdapter extends ArrayAdapter<Visit> {

    public VisitAdapter(Context context, List<Visit> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.visit_item, parent, false);
        }

        Visit currentVisit = getItem(position);

        ImageView image = listItemView.findViewById(R.id.image);
        TextView story = listItemView.findViewById(R.id.text_view);

        image.setImageResource(currentVisit.getImage());
        story.setText(currentVisit.getHistoria());

        return listItemView;
    }
}
