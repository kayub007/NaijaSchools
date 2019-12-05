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


public class MilitaryFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private ArrayList<Item> recyclerList;


    public MilitaryFragment() {
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
        recyclerList.add(new Item(getString(R.string.mustsee_wrigley_title),
                R.drawable.mustsee_wrigley_field,
                getString(R.string.mustsee_wrigley_location),
                getString(R.string.mustsee_wrigley_review)));

        recyclerList.add(new Item(getString(R.string.mustsee_mcdonald_title),
                R.drawable.mustsee_mcdonald_no1_store,
                getString(R.string.mustsee_mcdonald_location),
                getString(R.string.mustsee_mcdonald_review)));

        recyclerList.add(new Item(getString(R.string.mustsee_uc_title),
                R.drawable.mustsee_university_of_chicago,
                getString(R.string.mustsee_uc_location),
                getString(R.string.mustsee_uc_review)));

        recyclerList.add(new Item(getString(R.string.mustsee_loop_title),
                R.drawable.mustsee_the_loop,
                getString(R.string.mustsee_loop_location),
                getString(R.string.mustsee_loop_review)));

        recyclerList.add(new Item(getString(R.string.mustsee_united_title),
                R.drawable.mustsee_united_center,
                getString(R.string.mustsee_united_location),
                getString(R.string.mustsee_united_review)));

        recyclerList.add(new Item(getString(R.string.mustsee_robie_title),
                R.drawable.mustsee_robie_house,
                getString(R.string.mustsee_robie_location),
                getString(R.string.mustsee_robie_review)));
    }
}
