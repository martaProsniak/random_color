package com.mp.android.randomcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private View appView;
    private Button tryMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appView = findViewById(R.id.windowViewId);
        appView.setBackgroundColor(Color.RED);
        tryMeButton = (Button) findViewById(R.id.tryMeButton);
    }
}
