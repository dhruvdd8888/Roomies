package com.orezebuc.roomies;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;



import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

public class drink extends AppCompatActivity {

    TextView occasionalyET;
    TextView nonDrinkerET;
    TextView moderateET;
    int selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_drink);



        moderateET=findViewById(R.id.moderate);
        nonDrinkerET=findViewById(R.id.nonDrinker);
        occasionalyET=findViewById(R.id.occasionally);

        nonDrinkerET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected=0;
                Intent intent = new Intent(drink.this, sleeping.class);
                drink.this.startActivity(intent);

            }
        });

        moderateET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected=1;
                Intent intent = new Intent(drink.this, sleeping.class);
                drink.this.startActivity(intent);
            }
        });
        occasionalyET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected=2;
                Intent intent = new Intent(drink.this, sleeping.class);
                drink.this.startActivity(intent);
            }
        });
    }
}
