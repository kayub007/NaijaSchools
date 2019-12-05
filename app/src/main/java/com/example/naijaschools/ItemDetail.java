package com.example.naijaschools;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//Create ItemDetail Activity
public class ItemDetail extends AppCompatActivity {
    //Init a global mItems
    final ArrayList<Item> mItems = new ArrayList<Item>();

    //Override onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        TextView textTitle = findViewById(R.id.item_title);
        ImageView imageView = findViewById(R.id.item_image);
        TextView textLocation = findViewById(R.id.item_location);
        TextView textReview = findViewById(R.id.review);
        TextView textHighlights = findViewById(R.id.item_hightlights);
        TextView textOverview = findViewById(R.id.item_overview);
        TextView textProvider = findViewById(R.id.item_provider);
        TextView textUrl = findViewById(R.id.item_url);


        Intent intent = getIntent();
        Item item = intent.getParcelableExtra("Item");

        String itemTitle = item.getItemTitle();
        int itemImageResourceId = item.getItemImageResourceId();
        String itemLocation = item.getItemLocation();
        String itemReview = item.getItemReview();
        String itemHighlights = item.getItemHighlights();
        String itemOverview = item.getItemOverview();
        String itemProvider = item.getItemProvider();
        String itemUrl = item.getItemUrl();



        textTitle.setText(itemTitle);
        imageView.setImageResource(itemImageResourceId);
        textLocation.setText(itemLocation);
        textReview.setText(itemReview);
        textHighlights.setText(itemHighlights);
        textOverview.setText(itemOverview);
        textProvider.setText(itemProvider);
        textUrl.setText(itemUrl);


    }

}