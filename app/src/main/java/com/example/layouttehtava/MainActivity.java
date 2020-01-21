package com.example.layouttehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        imageView = findViewById(R.id.imageView);

        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.isEnabled() || button3.isEnabled()){
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                }
                else if (!button2.isEnabled() || !button3.isEnabled()){
                    button2.setEnabled(true);
                    button3.setEnabled(true);
                }
            }
        });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(INVISIBLE);
            }
        });

        button3.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imageView.setVisibility(VISIBLE);
                return false;
            }
        });
    }
}
