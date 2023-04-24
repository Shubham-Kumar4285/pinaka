package com.example.pinaka.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pinaka.R;
import com.example.pinaka.data.Events;
import com.example.pinaka.ui.home.HomeFragment;

import java.util.ArrayList;

public class CardStackAdapter extends RecyclerView.Adapter<CardViewHolder> {
    private ArrayList<Events> mCardDataList;
    private ImageView imageView;
    private TextView name;
    private TextView description;
    Intent intent;


    public CardStackAdapter(ArrayList<Events> cardDataList,Intent intent) {
        mCardDataList = cardDataList;
        this.intent=intent;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_card_layout, parent, false);
        return new CardViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        Events cardData = mCardDataList.get(position);
        imageView =holder.itemView.findViewById(R.id.imageView6);
        name =holder.itemView.findViewById(R.id.textView4);
        description =holder.itemView.findViewById(R.id.textView5);
        imageView.setImageResource(intent.getIntExtra("Image",0));
        name.setText(intent.getStringExtra("Name"));
        // Populate the card view with data
        // holder.cardView.setCardBackgroundColor(cardData.getBackgroundColor());
    }

    @Override
    public int getItemCount() {
        return mCardDataList.size();
    }

    public void removeCard(int position) {
        mCardDataList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, getItemCount());
    }
}

