package com.example.apple.connectiiigame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int player = 0,wp;

    int playr[] = {2,2,2,2,2,2,2,2,2};     //0=red 1=yellow 2=none

    int Winning[][] = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

    public void dropIn(View view)
    {
      ImageView img = (ImageView) view;

        wp = Integer.parseInt(img.getTag().toString());
       // System.out.println(wp);

        if(playr[wp]==2) {
            img.setTranslationY(-1000f);

            playr[wp] = player;       //setting value of player at wp i.e which ball colour is present at tag value

            if (player == 0) {
                img.animate().rotation(100f).translationYBy(1000f);

                img.setImageResource(R.drawable.red);
                player = 1;

            } else if (player == 1) {
                img.animate().rotation(100f).translationYBy(1000f);

                img.setImageResource(R.drawable.yellow);
                player = 0;
            }


            for (int winnin[] : Winning) {
                if ((playr[winnin[0]] == playr[winnin[1]]) && (playr[winnin[1]] == playr[winnin[2]]) && playr[winnin[0]] != 2) {

                    LinearLayout layout = (LinearLayout)findViewById(R.id.Layo);
                    layout.setVisibility(view.VISIBLE);
                   // Toast.makeText(this, "Player" + Integer.toString(playr[winnin[0]]), Toast.LENGTH_SHORT).show();
                }
            }

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
