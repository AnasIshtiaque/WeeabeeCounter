package com.example.weeabeecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Counter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        final TextView textView = (TextView) findViewById(R.id.number);
        Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            int counterValue = 0;
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                counterValue++;
                textView.setText(counterValue+"");
            }
        });
    }


}
