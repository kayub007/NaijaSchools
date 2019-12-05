package com.example.naijaschools;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CollegeFragment extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private ArrayList<Item> recyclerList;


    public CollegeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_layout, container, false);
        recyclerView = v.findViewById(R.id.list);
        ItemAdapter itemAdapter = new ItemAdapter(getContext(),recyclerList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(itemAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recyclerList = new ArrayList<>();
        //Add list data
        recyclerList.add(new Item(getString(R.string.tour_chicago_architecture_title),
                R.drawable.sights_chicago_architecture_tour,
                getString(R.string.tour_chicago_architecture_location),
                getString(R.string.tour_chicago_architecture_review)));

        recyclerList.add(new Item(getString(R.string.tour_millennium_park_title),
                R.drawable.sights_millennium_park,
                getString(R.string.tour_millennium_park_location),
               getString(R.string.tour_millennium_park_review)));

        recyclerList.add(new Item(getString(R.string.tour_navy_pier_title),
                R.drawable.sights_navy_pier,
                getString(R.string.tour_navy_pier_location),
                getString(R.string.tour_navy_pier_review)));

        recyclerList.add(new Item(getString(R.string.tour_skydeck_title),
                R.drawable.sights_skydeck,
                getString(R.string.tour_skydeck_location),
               getString(R.string.tour_skydeck_review)));

        recyclerList.add(new Item(getString(R.string.tour_riverwalk_title),
                R.drawable.sights_riverwalk,
                getString(R.string.tour_riverwalk_location),
               getString(R.string.tour_riverwalk_review)));

        recyclerList.add(new Item(getString(R.string.tour_art_institute_title),
                R.drawable.sights_art_institute,
                getString(R.string.tour_art_institute_location),
                getString(R.string.tour_art_institute_review)));
    }
}
