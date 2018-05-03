package com.example.macbook.mymenuproject.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

import com.example.macbook.mymenuproject.R;
import com.example.macbook.mymenuproject.activities.binary.AlphaToBinaryActivity;
import com.example.macbook.mymenuproject.activities.binary.BinaryToAlphaActivity;
import com.example.macbook.mymenuproject.activities.hebrew.AlphaToHebrewActivity;
import com.example.macbook.mymenuproject.activities.hebrew.HebrewToAlphaActivity;
import com.example.macbook.mymenuproject.activities.morse.AlphaToMorseActivity;
import com.example.macbook.mymenuproject.activities.morse.MorseToAlphaActivity;

public class HomeActivity extends AppCompatActivity {

    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        gridLayout = (GridLayout) findViewById(R.id.gridlayout);
        cardViewSelectable(gridLayout);


    }

    private void cardViewSelectable(GridLayout gridLayout) {
        for (int i = 0 ; i < gridLayout.getChildCount(); i++ ) {
            final CardView cardView = (CardView) gridLayout.getChildAt(i);
            final int cardViewNumber = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (cardViewNumber == 0) {
                        Intent intent = new Intent(HomeActivity.this, MorseToAlphaActivity.class);
                        startActivity(intent);
                    } else if (cardViewNumber == 1) {
                        Intent intent = new Intent(HomeActivity.this, AlphaToMorseActivity.class);
                        startActivity(intent);
                    } else if (cardViewNumber == 2) {
                        Intent intent = new Intent(HomeActivity.this, BinaryToAlphaActivity.class);
                        startActivity(intent);
                    } else if (cardViewNumber == 3) {
                        Intent intent = new Intent(HomeActivity.this, AlphaToBinaryActivity.class);
                        startActivity(intent);
                    } else if (cardViewNumber == 4) {
                        Intent intent = new Intent(HomeActivity.this, HebrewToAlphaActivity.class);
                        startActivity(intent);
                    } else if (cardViewNumber == 5) {
                        Intent intent = new Intent(HomeActivity.this, AlphaToHebrewActivity.class);
                        startActivity(intent);
                    }

                }
            });
        }
    }
}
