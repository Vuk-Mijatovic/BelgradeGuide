package com.example.belgradeguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find ViewPager2 layout that will display fragments
        ViewPager2 pager = (ViewPager2) findViewById(R.id.pager);

        //Set adapter to pager to display fragments
        AttractionFragmentAddapter fragmentAddapter = new AttractionFragmentAddapter(getSupportFragmentManager(), getLifecycle());
        pager.setAdapter(fragmentAddapter);

        //Find tab view from activity_main
        TabLayout tab = findViewById(R.id.tab);
        //Set tabs using TabMediator
       new TabLayoutMediator(tab, pager, new TabLayoutMediator.TabConfigurationStrategy() {
           @Override
           public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
               if (position == 0) {tab.setText(getString(R.string.landmarks_title));}
               else if (position == 1) {tab.setText(getString(R.string.museums_title));}
           }
       }).attach();
    }
}