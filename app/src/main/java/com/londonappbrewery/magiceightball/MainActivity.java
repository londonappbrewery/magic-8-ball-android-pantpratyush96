package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask_button;
        final ImageView askImage = (ImageView)findViewById(R.id.imageView2);
        ask_button = (Button)findViewById(R.id.button);

        final int[] imageArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        ask_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Random randomNumberGenerator = new Random();
                        int number = randomNumberGenerator.nextInt(5);
                        Log.d("Magic Eight Ball", String.valueOf(number));
                        askImage.setImageResource(imageArray[number]);
                    }
                }
        );
    }
}
