package com.orezebuc.roomies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class firstBio1 extends AppCompatActivity {
    TextView extrovert;
    TextView introvert;
    Boolean selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_bio1);

        introvert=findViewById(R.id.introvert);
        extrovert=findViewById(R.id.extrovert);
        introvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected=true;
                Intent intent = new Intent(firstBio1.this, study.class);
                firstBio1.this.startActivity(intent);
            }
        });

        extrovert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected=false;
                Intent intent = new Intent(firstBio1.this, study.class);
                firstBio1.this.startActivity(intent);
            }
        });
    }
}