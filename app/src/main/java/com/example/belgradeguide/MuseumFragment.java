package com.example.belgradeguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ListView rootView = (ListView) inflater.inflate(R.layout.attraction_list, container, false);
        //Create new list of museum attractions
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.national_name), getString(R.string.national_contact),
                getString(R.string.national_description), R.drawable.national_museum));
        attractions.add(new Attraction(getString(R.string.yugoslavia_name), getString(R.string.yugoslavia_contact),
                getString(R.string.yugoslavia_description), R.drawable.yugoslavia_museum ));
        attractions.add(new Attraction(getString(R.string.contemporary_name), getString(R.string.contemporary_contact),
                getString(R.string.contemporary_description), R.drawable.contemporary_art));

        //set adapter to display museum attractions and attach it to ListView
        AttractionAdapter adapter = new AttractionAdapter(getActivity(),attractions);
        rootView.setAdapter(adapter);

        return rootView;
    }
}
