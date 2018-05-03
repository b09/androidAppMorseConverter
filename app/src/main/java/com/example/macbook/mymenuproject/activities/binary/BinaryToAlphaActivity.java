package com.example.macbook.mymenuproject.activities.binary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.macbook.mymenuproject.MorseAlphaTranslator;
import com.example.macbook.mymenuproject.R;

public class BinaryToAlphaActivity extends AppCompatActivity {
    private TextView inputText;
    private TextView outputText;
    private Button one;
    private Button zero;
    private Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_to_alpha);
        inputText = findViewById(R.id.userInput);
        outputText = findViewById(R.id.translatedText);
        one = findViewById(R.id.oneButton);
        zero = findViewById(R.id.zeroButton);
        convert = findViewById(R.id.translateButton);
//        this line below disables the popout keyboard from appearing
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM,
                WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String untranslatedText = inputText.getText().toString();
                String tranlatedText = MorseAlphaTranslator.binaryToAlpha(untranslatedText);
                outputText.setText(tranlatedText);
            }
        });



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.append("1");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.append("0");
            }
        });
    }



    //        this will get called when the activity loads
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }



    //        this will get called when the menu item gets clicked
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_hello) {
            Toast.makeText(BinaryToAlphaActivity.this, R.string.menu_toast_hello, Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
