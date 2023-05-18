package com.orezebuc.roomies;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class food extends AppCompatActivity {

    TextView nonvegTV;
    TextView vegTV;
    Boolean selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_food);

        nonvegTV=findViewById(R.id.nonVegetarian);
        vegTV=findViewById(R.id.vegetarian);
        vegTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected=false;
                Intent intent = new Intent(food.this, religion.class);
                food.this.startActivity(intent);
            }
        });

        nonvegTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected=true;
                Intent intent = new Intent(food.this, religion.class);
                food.this.startActivity(intent);
            }
        });


    }
}