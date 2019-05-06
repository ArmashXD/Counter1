package com.tasbehdhikrdua.syedarmashhussain.counter1;

import android.content.Context;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Vibrator;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Map;
import java.util.Set;


public class  MainActivity extends AppCompatActivity {


    private Vibrator vibrator;
   private  Window window;
   private ImageButton btnVibrate;
   private ImageButton rests;
   private boolean isVibratorTrue = true;
   private TextView textView;
   private int count = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView textView = (TextView) findViewById(R.id.textAd);

        TextView txtView = (TextView) findViewById(R.id.textView);
        ImageButton btnAdd = (ImageButton) findViewById(R.id.CounntAdd);
        final ImageButton reset = (ImageButton) findViewById(R.id.restz);
        final ImageButton BtrueVibrator = (ImageButton)findViewById(R.id.addvibrator);
        FloatingActionButton floatingActionButton = findViewById(R.id.fab);


        floatingActionButton.setImageResource(R.drawable.ic_arrow_back_black_24dp);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,List.class);
                startActivity(i);
            }
        });


        //Vibrator 2
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isVibratorTrue){vibrator.vibrate(100);}

                count++;
                textView.setText("" + count);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isVibratorTrue){vibrator.vibrate(100);}
                count = 0;
                textView.setText(""+ count);
            }
        });

        BtrueVibrator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                if (isVibratorTrue){
                    isVibratorTrue = false;
                    BtrueVibrator.setImageResource(R.drawable.vibrate_on);
                    Toast.makeText(MainActivity.this, "Vibrate On", Toast.LENGTH_SHORT).show();
                }else{
                    isVibratorTrue = true;
                    BtrueVibrator.setImageResource(R.drawable.vibrate_off);
                    Toast.makeText(MainActivity.this, "Vibrate Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

  //  SharedPreferences sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);


}
