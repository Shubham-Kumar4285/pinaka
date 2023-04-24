package com.example.pinaka.adapters;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;

    public CardViewHolder(CardView itemView) {
        super(itemView);
        cardView = itemView;
    }
}