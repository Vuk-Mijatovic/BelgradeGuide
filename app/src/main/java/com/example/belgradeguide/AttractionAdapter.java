package com.example.belgradeguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter <Attraction>{

    public AttractionAdapter (Activity context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        //gets current attraction from the list of attractions
        Attraction currentAttraction = getItem(position);

        //sets views and display current attraction item
        TextView nameView = (TextView) listItemView.findViewById(R.id.name_view);
        nameView.setText(currentAttraction.getName());

        TextView contactView = (TextView) listItemView.findViewById(R.id.contact_view);
        contactView.setText(currentAttraction.getContact());

        TextView descriptionView = (TextView) listItemView.findViewById(R.id.description_view);
        descriptionView.setText(currentAttraction.getDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(currentAttraction.getImageResourceId());

        return listItemView;
    }
}
