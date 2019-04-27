package com.example.changecolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txvRed, txvGreen, txvBlue, txvShow;    //txv = TeXtView
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvRed = findViewById(R.id.textViewRed);
        txvGreen = findViewById(R.id.textViewGreen);
        txvBlue = findViewById(R.id.textViewBlue);
        txvShow = findViewById(R.id.textViewShow);
    }

    public void changeColors(View v){
        Random ran = new Random();

        int red = ran.nextInt(256);
        txvRed.setText("Red : "+ red);
        txvRed.setTextColor(Color.rgb(red, 0, 0));

        int green = ran.nextInt(256);
        txvGreen.setText("Green : "+ green);
        txvGreen.setTextColor(Color.rgb(0, green, 0));

        int blue = ran.nextInt(256);
        txvBlue.setText("Blue : "+ blue);
        txvBlue.setTextColor(Color.rgb(0, 0, blue));

        text += red + ", " + green + ", " + blue + ", " + "\n";
        txvShow.setTextSize(16);
        txvShow.setText(text);
        txvShow.setMovementMethod(new ScrollingMovementMethod());
        txvShow.setBackgroundColor(Color.argb(150, red,green,blue));

    }

}
