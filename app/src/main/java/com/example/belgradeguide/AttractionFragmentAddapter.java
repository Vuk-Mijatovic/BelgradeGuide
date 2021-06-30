package com.example.belgradeguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;



public class AttractionFragmentAddapter extends FragmentStateAdapter {
    public AttractionFragmentAddapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {return new LandmarkFragment();}
        else {return new MuseumFragment();}
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
