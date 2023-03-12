package com.orezebuc.roomies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.view.inputmethod.InputMethodManager;
import android.text.Editable;
import android.text.TextWatcher;


public class mobileLogin extends AppCompatActivity {
    TextView getOtpBtn;
    EditText mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_login);
        mobile = findViewById(R.id.loginPhone);

        getOtpBtn = findViewById(R.id.loginBtn);

        numChecker();
        getOtpBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int lenIp = mobile.getText().toString().length();
                if (mobile.getText().toString().isEmpty()) {
                    mobile.setError("Enter Mobile Number");
                } else if (lenIp == 10) {
                    Intent intent = new Intent(mobileLogin.this, verifyLoginOtp.class);
                    intent.putExtra("mobile", mobile.getText().toString());
                    mobileLogin.this.startActivity(intent);
                } else {
                    mobile.setError("Mobile number incorrect");
                }
            }
        });
    }

    public void numChecker() {
        mobile.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void afterTextChanged(Editable editable) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().length() == 10) {
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    if (inputMethodManager.isAcceptingText()) {
                        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                                0);

                    }
                }
            }
        });
    }
}