package com.example.pinaka.adapters;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pinaka.R;
import com.example.pinaka.data.Places;

import org.w3c.dom.Text;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView placeName;
        private final ImageView placeImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            placeName = itemView.findViewById(R.id.place_name);
            placeImage = itemView.findViewById(R.id.place_image);
         }


        public ImageView getPlaceImage() {
            return placeImage;
        }

        public TextView getPlaceName() {
            return placeName;
        }
    }


    @NonNull
    @Override
    public PlacesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.places_recycler_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
