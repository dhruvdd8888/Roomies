package com.orezebuc.roomies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class religion extends AppCompatActivity {
    TextView hindu, muslim, other;
    int selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_religion);

        hindu = findViewById(R.id.Hindu);
        muslim = findViewById(R.id.Muslim);
        other = findViewById(R.id.other);

        hindu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected = 0;
                Intent intent = new Intent(religion.this, homeScreen.class);
                religion.this.startActivity(intent);

            }
        });

    }


}