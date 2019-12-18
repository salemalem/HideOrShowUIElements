package com.example.hideorshowuielements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView helloWorldTextView;
    boolean hidden = false;

    public void hide_or_show (View view) {

        if (!hidden) {
            // hide it
            helloWorldTextView.setVisibility(View.INVISIBLE);
        } else {
            helloWorldTextView.setVisibility(View.VISIBLE);
        }
        hidden = !hidden;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorldTextView = (TextView) findViewById(R.id.helloWorldTextView);
    }
}
