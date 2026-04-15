package com.rycl.jam;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.LinearLayout;
import android.view.Gravity;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.BLACK); // Biar keren ala jam meja

        TextClock jam = new TextClock(this);
        jam.setFormat24Hour("HH:mm:ss"); // Format jam:menit:detik
        jam.setTextSize(50);
        jam.setTextColor(Color.CYAN); // Warna angka jamnya
        
        layout.addView(jam);
        setContentView(layout);
    }
          }

