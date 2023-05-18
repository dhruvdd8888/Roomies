package com.orezebuc.roomies;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

public class study extends AppCompatActivity {

    EditText study_input;
    TextView study_btn;
    String studyInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_field_of_study);

        study_input=findViewById(R.id.editTextStudyDetail);
        study_btn=findViewById(R.id.study_submit_btn);

        study_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studyInput=study_input.toString();
                Intent intent = new Intent(study.this, smoker.class);
                study.this.startActivity(intent);
            }
        });



    }
}