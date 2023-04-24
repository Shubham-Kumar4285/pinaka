package com.example.pinaka.ui.home;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.pinaka.R;
import com.example.pinaka.adapters.PlacesAdapter;
import com.example.pinaka.data.Places;
import com.example.pinaka.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private boolean doneOnce = false;
    private int[] placesImages = {R.drawable.chennai, R.drawable.delhi, R.drawable.goa, R.drawable.hyderabad, R.drawable.jammu, R.drawable.mumbai};
    private String[] placesName = {"Chennai", "Delhi", "Goa", "Hyderabad", "Jammu", "Mumbai"};
    private ArrayList<Places> placesArrayList;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        placesArrayList = new ArrayList<>();
        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        for(int i = 0; i < placesImages.length; i++) {
            placesArrayList.add(new Places(placesImages[i], placesName[i]));
        }
        PlacesAdapter placesAdapter = new PlacesAdapter();
        placesAdapter.dataset = placesArrayList;
        binding.discoverRecyclerView.setAdapter(placesAdapter);
        binding.discoverRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}