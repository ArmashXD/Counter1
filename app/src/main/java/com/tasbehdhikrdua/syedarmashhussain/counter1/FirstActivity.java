package com.tasbehdhikrdua.syedarmashhussain.counter1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    private Button btn,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FirstActivity.this,List.class);
                startActivity(i);

            }
        });
          btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent a = new Intent(FirstActivity.this,Pic.class);
             startActivity(a);
            }
        });



    }
}
