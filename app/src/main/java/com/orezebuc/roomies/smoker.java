package com.orezebuc.roomies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class smoker extends AppCompatActivity {

    TextView smokertv;
    Boolean selected;
    TextView nonSmokertv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_smoker);


        smokertv=findViewById(R.id.smokerTextview);
        nonSmokertv=findViewById(R.id.nonsmokerTextview);
        smokertv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected=true;
                Intent intent = new Intent(smoker.this, drink.class);
                smoker.this.startActivity(intent);
            }
        });

        nonSmokertv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected=false;
                Intent intent = new Intent(smoker.this, drink.class);
                smoker.this.startActivity(intent);
            }
        });
    }
}