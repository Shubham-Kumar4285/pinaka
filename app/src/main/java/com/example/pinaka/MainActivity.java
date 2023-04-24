package com.example.pinaka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.pinaka.adapters.CardStackAdapter;
import com.example.pinaka.adapters.SwipeItemTouchHelper;
import com.example.pinaka.data.Events;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Events> cardDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        RecyclerView cardStack = findViewById(R.id.card_stack);
        CardStackAdapter adapter = new CardStackAdapter(cardDataList,intent);
        cardStack.setAdapter(adapter);

        SwipeItemTouchHelper swipeItemTouchHelper = new SwipeItemTouchHelper(adapter);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(swipeItemTouchHelper);
        itemTouchHelper.attachToRecyclerView(cardStack);

        TextView place = findViewById(R.id.textView2);
        place.setText(intent.getExtras().getString("Name"));

    }
}