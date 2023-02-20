package com.orezebuc.roomies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class verifyLoginOtp extends AppCompatActivity {

        private EditText otp1, otp2, otp3, otp4;
        TextView resentotpBtn = findViewById(R.id.resentOtp);

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);


            TextView mobilex = findViewById(R.id.textMobile);
            String mbIntent = getIntent().getStringExtra("mobile");
            mbIntent = mbIntent.substring(0, 2) + "xxxxx" + mbIntent.substring(7, 10);
            mobilex.setText(mbIntent);


            otp1 = findViewById(R.id.inputCode1);
            otp2 = findViewById(R.id.inputCode2);
            otp3 = findViewById(R.id.inputCode3);
            otp4 = findViewById(R.id.inputCode4);

            resentotpBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Toast.makeText(login.this, "OTP Resent", Toast.LENGTH_LONG);
                }
            });

            otpReader();


        }

        private void otpReader() {
            otp1.addTextChangedListener(new TextWatcher() {
                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if (!charSequence.toString().isEmpty()) {
                        otp2.requestFocus();
                    }
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                }
            });

            otp2.addTextChangedListener(new TextWatcher() {
                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if (!charSequence.toString().isEmpty()) {
                        otp3.requestFocus();
                    }
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                }
            });

            otp3.addTextChangedListener(new TextWatcher() {
                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if (!charSequence.toString().isEmpty()) {
                        otp4.requestFocus();
                    }
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                }
            });

            otp4.addTextChangedListener(new TextWatcher() {
                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if (!charSequence.toString().isEmpty()) {
                        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        if (inputMethodManager.isAcceptingText()) {
                            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                        }
                    }
                    Intent intent = new Intent(login.this, Register.class);
                    login.this.startActivity(intent);
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                }
            });


        }
    }