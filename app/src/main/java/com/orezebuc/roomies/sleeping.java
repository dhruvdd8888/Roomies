package com.orezebuc.roomies;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;


public class sleeping extends AppCompatActivity {
    TextView nightOwlTV;
    TextView earlyBirdTV;
    Boolean selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_sleeping);


        earlyBirdTV=findViewById(R.id.earlyBird);
        nightOwlTV=findViewById(R.id.nightOwl);
        earlyBirdTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected=false;
                Intent intent = new Intent(sleeping.this, food.class);
                sleeping.this.startActivity(intent);
            }
        });
        nightOwlTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected=true;
                Intent intent = new Intent(sleeping.this, food.class);
                sleeping.this.startActivity(intent);
            }
        });

    }

}