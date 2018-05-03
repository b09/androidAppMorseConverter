package com.example.macbook.mymenuproject.activities.morse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.macbook.mymenuproject.MorseAlphaTranslator;
import com.example.macbook.mymenuproject.R;
import com.example.macbook.mymenuproject.activities.HomeActivity;

public class AlphaToMorseActivity extends AppCompatActivity {

    private TextView inputText;
    private TextView outputText;
    private Button convert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_to_morse);
        inputText = findViewById(R.id.userInput);
        outputText = findViewById(R.id.translatedText);
        convert = findViewById(R.id.translateButton);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String untranslatedText = inputText.getText().toString();
                String tranlatedText = MorseAlphaTranslator.stringAlphaToMorse(untranslatedText);
                outputText.setText(tranlatedText);
            }
        });

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
            Intent intent = new Intent(AlphaToMorseActivity.this, HomeActivity.class);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.nav_keys) {
            Intent intent = new Intent(AlphaToMorseActivity.this, HomeActivity.class);
            startActivity(intent);

            return super.onOptionsItemSelected(item);
        } else if (item.getItemId() == R.id.nav_save) {
            Intent intent = new Intent(AlphaToMorseActivity.this, HomeActivity.class);
            startActivity(intent);

            return super.onOptionsItemSelected(item);
        } else if (item.getItemId() == R.id.nav_view_saved) {
            Intent intent = new Intent(AlphaToMorseActivity.this, HomeActivity.class);
            startActivity(intent);

            return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
