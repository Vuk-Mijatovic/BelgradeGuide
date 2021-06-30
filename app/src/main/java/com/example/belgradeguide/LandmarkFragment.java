package com.example.belgradeguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class LandmarkFragment extends Fragment {

    public LandmarkFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.kalemegdan_name), getString(R.string.kalemegdan_contact),
                getString(R.string.kalemegdan_description), R.drawable.kalemegdan));
        attractions.add(new Attraction(getString(R.string.st_save_name), getString(R.string.st_sava_contact),
                getString(R.string.st_sava_description), R.drawable.st_sava));
        attractions.add(new Attraction(getString(R.string.knez_mihailova_name), getString(R.string.knez_mihailova_contact),
                getString(R.string.knez_mihailova_description), R.drawable.knez_mihailova));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}