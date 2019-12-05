package com.example.naijaschools;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder>{

    Context context;
    ArrayList<Item> itemList;

    public ItemAdapter(Context context, ArrayList<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        final View view ;
        view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        final MyViewHolder vHolder = new MyViewHolder(view);

        vHolder.list_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//               int position = vHolder.getAdapterPosition();
//                Log.d("Click", String.valueOf(position));
//                Item selectedItem = itemList.get(position);
//                Intent intent = new Intent(context, ItemDetail.class);
//                intent.putExtra("Item", selectedItem);
//                context.startActivity(intent);
                Toast.makeText(context, "Text Click"+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(itemList.get(position).getItemTitle());
        holder.location.setText(itemList.get(position).getItemLocation());
        holder.image.setImageResource(itemList.get(position).getItemImageResourceId());
        holder.review.setText(itemList.get(position).getItemReview());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout list_item;
        private TextView title;
        private TextView location;
        private ImageView image;
        private TextView review;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            list_item = itemView.findViewById(R.id.list_item_id);
            title = itemView.findViewById(R.id.title);
            location = itemView.findViewById(R.id.location);
            image = itemView.findViewById(R.id.image);
            review = itemView.findViewById(R.id.review);
        }

    }
}
