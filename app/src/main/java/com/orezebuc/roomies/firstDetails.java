package com.orezebuc.roomies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class firstDetails extends AppCompatActivity {

    RadioGroup sexRadio;
    EditText nameInput, yobInput;
    TextView tnc,submitBtn,prp;
    int sexSelected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_details);

        sexRadio=findViewById(R.id.sexRadioGrp);
        tnc= findViewById(R.id.clickTermsAndCondition);
        prp=findViewById(R.id.clickPrivacyPolicy);
        submitBtn=findViewById(R.id.submitNSA);
        nameInput=findViewById(R.id.nameIP);
        yobInput=findViewById(R.id.yobIP);


        tnc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tncDialog td= new tncDialog();
                td.show(getSupportFragmentManager(),"TnC");
            }
        });


        prp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                prpDialog td= new prpDialog();
                td.show(getSupportFragmentManager(),"PrP");
            }
        });

        sexRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                sexSelected=checkedId;
            }
        });


        yobInput.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void afterTextChanged(Editable s) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().length() == 4) {
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    if (inputMethodManager.isAcceptingText()) {
                        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                                0);

                    }
                }
            }

        });
        submitBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(nameInput.getText().toString().isEmpty()){
                    nameInput.setError("Tell us your Name");
                    nameInput.requestFocus();
                }
                else if(sexSelected<1){
                    Snackbar resentSnack = Snackbar.make(findViewById(R.id.firstDetailsLayout),"Tell us your Gender",Snackbar.LENGTH_SHORT);
                    resentSnack.show();
                    sexRadio.requestFocus();
                }
                else if(yobInput.getText().toString().isEmpty()){
                    yobInput.setError("Tell us your YOB");
                    yobInput.requestFocus();
                }
                else{
                    Intent intent = new Intent(firstDetails.this, firstBio1.class);
                    firstDetails.this.startActivity(intent);
                }
            }
        });


    }


}