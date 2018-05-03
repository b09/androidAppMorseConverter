package com.example.macbook.mymenuproject.activities.morse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.macbook.mymenuproject.MorseAlphaTranslator;
import com.example.macbook.mymenuproject.R;

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
}
