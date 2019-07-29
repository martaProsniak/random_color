package com.mp.android.randomcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View appView;
    private Button tryMeButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create colors array
        colors = new int[]{Color.CYAN, Color.GRAY, Color.GREEN, Color.RED, Color.BLACK, Color.BLUE,
                Color.GREEN, Color.MAGENTA, Color.YELLOW};

        appView = findViewById(R.id.windowViewId);

        tryMeButton = findViewById(R.id.tryMeButton);
        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int colorArrayLength = colors.length;
                Random random = new Random();
                int randomNum = random.nextInt(colorArrayLength);
                appView.setBackgroundColor(colors[randomNum]);

                Log.d("Random", String.valueOf((randomNum)));
            }
        });

    }
}
