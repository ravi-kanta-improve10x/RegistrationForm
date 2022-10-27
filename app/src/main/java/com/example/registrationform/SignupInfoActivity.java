package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_info);
        Button nextbtn = findViewById(R.id.next_btn);
        nextbtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,PersonalActivity.class);
            EditText emailTxt = findViewById(R.id.email_txt);
            String email = emailTxt.getText().toString();
            EditText passwordTxt = findViewById(R.id.password_txt);
            String password = passwordTxt.getText().toString();
            EditText confirmPasswordTxt  = findViewById(R.id.confrmpassword_txt);
            String confirmPassword = confirmPasswordTxt.getText().toString();
            intent.putExtra("email", email);
            intent.putExtra("password", password);
            intent.putExtra("confirmPassword", confirmPassword);
            startActivity(intent);
        });
    }
}