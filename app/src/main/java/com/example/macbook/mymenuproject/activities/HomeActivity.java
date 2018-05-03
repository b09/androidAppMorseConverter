package com.example.macbook.mymenuproject.activities;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
    DrawerLayout mDrawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        gridLayout = (GridLayout) findViewById(R.id.gridlayout);
        cardViewSelectable(gridLayout);

        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.nav_home) {
            Intent intent = new Intent(HomeActivity.this, MorseToAlphaActivity.class);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.nav_home) {
            Intent intent = new Intent(HomeActivity.this, HebrewToAlphaActivity.class);
            startActivity(intent);

            return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
