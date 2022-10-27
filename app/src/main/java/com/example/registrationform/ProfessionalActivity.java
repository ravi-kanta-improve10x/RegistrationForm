package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        //String email = intent.getStringExtra("email");
        //String password = intent.getStringExtra("password");
        //String confirmPassword = intent.getStringExtra("confirmPassword");
        //String userName = intent.getStringExtra("userName");
        //String firstName = intent.getStringExtra("firstName");
        //String lastName = intent.getStringExtra("lastName");
        //String dateOfBirth = intent.getStringExtra("dateOfBirth");
        //String placeOfBirth = intent.getStringExtra("placeOfBirth");
        Button nextBtn = findViewById(R.id.pro_next_btn);
        nextBtn.setOnClickListener(view -> {
            EditText currentCompanyTxt = findViewById(R.id.profe_name_txt);
            String currentCompany = currentCompanyTxt.getText().toString();
            EditText totalExperienceTxt = findViewById(R.id.profe_exp_txt);
            String totalExperience = totalExperienceTxt.getText().toString();
            EditText designationTxt = findViewById(R.id.profe_desi_txt);
            String designation = designationTxt.getText().toString();
            Intent intent3 = new Intent(this, BankActivity.class);
            intent3.putExtras(bundle);
            //intent3.putExtra("email", email);
           // intent3.putExtra("password", password);
            //intent3.putExtra("confirmPassword", confirmPassword);
            //intent3.putExtra("userName", userName);
            //intent3.putExtra("firstName", firstName);
            //intent3.putExtra("lastName", lastName);
            //intent3.putExtra("dateOfBirth", dateOfBirth);
            //intent3.putExtra("placeOfBirth", placeOfBirth);
            intent3.putExtra("currentCompany", currentCompany);
            intent3.putExtra("totalExperience", totalExperience);
            intent3.putExtra("designation", designation);
            startActivity(intent3);
            //Toast.makeText(this, currentCompany + " " + totalExperience + " " + designation, Toast.LENGTH_SHORT).show();
        });

        Button backBtn = findViewById(R.id.pro_back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });

    }
}