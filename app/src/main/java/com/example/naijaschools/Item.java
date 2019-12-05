package com.example.naijaschools;

import android.os.Parcel;
import android.os.Parcelable;

//Create Item class
public class Item implements Parcelable {
    //Init private vars
    private String itemTitle;
    private int itemImageResourceId;
    private String itemLocation;
    private String itemReview;

    private String itemHighlights;
    private String itemOverview;
    private String itemProvider;
    private String itemUrl;

    //Item constructor takes 4 params
    public Item(String title, int imageResourceId, String location, String review) {
        itemTitle = title;
        itemImageResourceId = imageResourceId;
        itemLocation = location;
        itemReview = review;
    }

    //Item constructor takes 8 params
    public Item(String title, int imageResourceId, String location, String review, String highlights, String overview, String provider, String website) {
        itemTitle = title;
        itemImageResourceId = imageResourceId;
        itemLocation = location;
        itemReview = review;
        itemHighlights = highlights;
        itemOverview = overview;
        itemProvider = provider;
        itemUrl = website;
    }

    protected Item(Parcel in) {
        itemTitle = in.readString();
        itemImageResourceId = in.readInt();
        itemLocation = in.readString();
        itemReview = in.readString();
        itemHighlights = in.readString();
        itemOverview = in.readString();
        itemProvider = in.readString();
        itemUrl = in.readString();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    public String getItemTitle() {
        return itemTitle;
    }

    public int getItemImageResourceId() {
        return itemImageResourceId;
    }

    public String getItemLocation() {
        return itemLocation;
    }

    public String getItemReview() {
        return itemReview;
    }

    public String getItemHighlights() {
        return itemHighlights;
    }

    public String getItemOverview() {
        return itemOverview;
    }

    public String getItemProvider() {
        return itemProvider;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(itemTitle);
        dest.writeInt(itemImageResourceId);
        dest.writeString(itemLocation);
        dest.writeString(itemReview);
        dest.writeString(itemHighlights);
        dest.writeString(itemOverview);
        dest.writeString(itemProvider);
        dest.writeString(itemUrl);
    }
}
