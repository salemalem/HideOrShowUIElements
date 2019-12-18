package com.example.hideorshowuielements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView helloWorldTextView;
    Button hide_or_show_button;
    boolean hidden = false;

    public void hide_or_show (View view) {

        if (!hidden) {
            // hide it
            helloWorldTextView.setVisibility(View.INVISIBLE);
            hide_or_show_button.setText("SHOW");
        } else {
            helloWorldTextView.setVisibility(View.VISIBLE);
            hide_or_show_button.setText("HIDE");
        }
        hidden = !hidden;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorldTextView  = (TextView) findViewById(R.id.helloWorldTextView);
        hide_or_show_button = (Button)   findViewById(R.id.hide_or_show_button);
    }
}
