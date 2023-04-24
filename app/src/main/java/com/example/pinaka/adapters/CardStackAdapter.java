package com.example.pinaka.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pinaka.R;
import com.example.pinaka.data.Events;

import java.util.ArrayList;

public class CardStackAdapter extends RecyclerView.Adapter<CardViewHolder> {
    private ArrayList<Events> mCardDataList;

    public CardStackAdapter(ArrayList<Events> cardDataList) {
        mCardDataList = cardDataList;
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

