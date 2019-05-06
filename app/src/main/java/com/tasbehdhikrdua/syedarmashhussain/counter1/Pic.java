package com.tasbehdhikrdua.syedarmashhussain.counter1;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Pic extends AppCompatActivity {

    public static final String TAG ="Pic";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic);


        ViewPager viewPager = findViewById(R.id.view_Pager);
        ImageAdapter imageAdapter = new ImageAdapter(this);
        viewPager.setAdapter(imageAdapter);


        Toast.makeText(this, "Ramadan Dua", Toast.LENGTH_LONG).show();
    }

}

