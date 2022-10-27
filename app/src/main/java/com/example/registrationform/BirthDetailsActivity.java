package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        //String email = intent.getStringExtra("email");
        //String password = intent.getStringExtra("password");
        //String confirmPassword = intent.getStringExtra("confirmPassword");
        //String userName = intent.getStringExtra("userName");
        //String firstName = intent.getStringExtra("firstName");
        //String lastName = intent.getStringExtra("lastName");
        Button nextBtn = findViewById(R.id.birth_next_btn);
        nextBtn.setOnClickListener(view -> {
            EditText dateOfBirthTxt = findViewById(R.id.birthdate_txt);
            String dateOfBirth = dateOfBirthTxt.getText().toString();
            EditText placeOfBirthTxt = findViewById(R.id.birthplace_txt);
            String placeOfBirth = placeOfBirthTxt.getText().toString();
            Intent intent1 = new Intent(this, ProfessionalActivity.class);
            intent1.putExtras(bundle);
            //intent1.putExtra("email", email);
            //intent1.putExtra("password", password);
            //intent1.putExtra("confirmPassword", confirmPassword);
            //intent1.putExtra("userName", userName);
            //intent1.putExtra("firstName", firstName);
            //intent1.putExtra("lastName", lastName);
            intent1.putExtra("dateOfBirth", dateOfBirth);
            intent1.putExtra("placeOfBirth", placeOfBirth);
            startActivity(intent1);
        });

        Button backBtn = findViewById(R.id.birthback_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}