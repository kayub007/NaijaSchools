package com.example.naijaschools;

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


public class UniversityFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private ArrayList<Item> recyclerList;


    public UniversityFragment() {
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
        recyclerList.add(new Item(getString(R.string.food_lou_malanti_title),
                R.drawable.food_lou_malnati_pizza,
                getString(R.string.food_lou_malanti_location),
                getString(R.string.food_lou_malanti_review)));

        recyclerList.add(new Item(getString(R.string.food_girl_the_goat_title),
                R.drawable.food_girl_and_the_goat,
                getString(R.string.food_girl_the_goat_location),
                getString(R.string.food_girl_the_goat_review)));

        recyclerList.add(new Item(getString(R.string.food_portillo_title),
                R.drawable.food_portillos,
                getString(R.string.food_portillo_location),
                getString(R.string.food_portillo_review)));

        recyclerList.add(new Item(getString(R.string.food_wildberry_title),
                R.drawable.food_wildberry,
                getString(R.string.food_wildberry_location),
                getString(R.string.food_wildberry_review)));

        recyclerList.add(new Item(getString(R.string.food_smoque_title),
                R.drawable.food_smoqu_bbq,
                getString(R.string.food_smoque_location),
                getString(R.string.food_smoque_review)));

        recyclerList.add(new Item(getString(R.string.food_bohemian_title),
                R.drawable.food_bohemian_house,
                getString(R.string.food_bohemian_location),
                getString(R.string.food_bohemian_review)));
    }
}
