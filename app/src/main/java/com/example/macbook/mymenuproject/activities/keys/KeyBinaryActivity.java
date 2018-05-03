package com.example.macbook.mymenuproject.activities.keys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.macbook.mymenuproject.R;
import com.example.macbook.mymenuproject.activities.HomeActivity;

public class KeyBinaryActivity extends AppCompatActivity {

    private TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_binary);
        outputText = findViewById(R.id.translatedText);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_in_tranlator_activities, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.nav_home) {
            Intent intent = new Intent(KeyBinaryActivity.this, HomeActivity.class);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.nav_keys) {
            Intent intent = new Intent(KeyBinaryActivity.this, HomeActivity.class);
            startActivity(intent);

            return super.onOptionsItemSelected(item);
        } else if (item.getItemId() == R.id.nav_save) {
            Intent intent = new Intent(KeyBinaryActivity.this, HomeActivity.class);
            startActivity(intent);

            return super.onOptionsItemSelected(item);
        } else if (item.getItemId() == R.id.nav_view_saved) {
            Intent intent = new Intent(KeyBinaryActivity.this, HomeActivity.class);
            startActivity(intent);

            return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
