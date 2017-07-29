package com.example.apple.connectiiigame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void dropIn(View view)
    {
      ImageView img = (ImageView) view;

      
        img.setTranslationY(-1000f);
        img.animate().rotation(100f).translationYBy(1000f);

        img.setImageResource(R.drawable.red);




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
