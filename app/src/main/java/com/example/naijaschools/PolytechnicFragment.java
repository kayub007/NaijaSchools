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


public class PolytechnicFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private ArrayList<Item> recyclerList;


    public PolytechnicFragment() {
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
        recyclerList.add(new Item(getString(R.string.hotel_peninsula_title),
                R.drawable.hotel_the_peninsula,
                getString(R.string.hotel_peninsula_location),
                getString(R.string.hotel_peninsula_review)));

        recyclerList.add(new Item(getString(R.string.hotel_langham_title),
                R.drawable.hotel_the_langham,
                getString(R.string.hotel_langham_location),
                getString(R.string.hotel_langham_review)));

        recyclerList.add(new Item(getString(R.string.hotel_ace_title),
                R.drawable.hotel_ace_chicago,
                getString(R.string.hotel_ace_location),
                getString(R.string.hotel_ace_review)));

        recyclerList.add(new Item(getString(R.string.hotel_guesthouse_title),
                R.drawable.hotel_the_guesthouse,
                getString(R.string.hotel_guesthouse_location),
                getString(R.string.hotel_guesthouse_review)));

        recyclerList.add(new Item(getString(R.string.hotel_emc2_title),
                R.drawable.hotel_emc2,
                getString(R.string.hotel_emc2_location),
                getString(R.string.hotel_emc2_review)));

        recyclerList.add(new Item(getString(R.string.hotel_kimption_title),
                R.drawable.hotel_kimpton,
                getString(R.string.hotel_kimption_location),
                getString(R.string.hotel_kimption_review)));
    }
}
