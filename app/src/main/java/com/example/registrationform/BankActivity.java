package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
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
        //String currentCompany = intent.getStringExtra("currentCompany");
        //String totalExperience = intent.getStringExtra("totalExperience");
        //String designation = intent.getStringExtra("designation");
        Button nextBtn = findViewById(R.id.bank_next_btn);
        nextBtn.setOnClickListener(view -> {
            EditText bankNameTxt = findViewById(R.id.bank_name_txt);
            String bankName = bankNameTxt.getText().toString();
            EditText accountHolderNameTxt = findViewById(R.id.accholder_txt);
            String accountHolderName = accountHolderNameTxt.getText().toString();
            EditText accountNumberTxt = findViewById(R.id.accno_txt);
            String accountNumber = accountNumberTxt.getText().toString();
            EditText ifscCodeTxt = findViewById(R.id.ifsc_txt);
            String ifscCode = ifscCodeTxt.getText().toString();
            Intent intent4 = new Intent(this, CreditCardActivity.class);
            intent4.putExtras(bundle);
            //intent4.putExtra("email", email);
            //intent4.putExtra("password", password);
            //intent4.putExtra("confirmPassword", confirmPassword);
            //intent4.putExtra("userName", userName);
            //intent4.putExtra("firstName", firstName);
            //intent4.putExtra("lastName", lastName);
            //intent4.putExtra("dateOfBirth", dateOfBirth);
            //intent4.putExtra("placeOfBirth", placeOfBirth);
            //intent4.putExtra("currentCompany", currentCompany);
            //intent4.putExtra("totalExperience", totalExperience);
            //intent4.putExtra("designation", designation);
            intent4.putExtra("bankName", bankName);
            intent4.putExtra("accountHolderName", accountHolderName);
            intent4.putExtra("accountNumber", accountNumber);
            intent4.putExtra("ifscCode", ifscCode);
            startActivity(intent4);
            //Toast.makeText(this, bankName + " " + accountHolderName + " " + accountNumber + " " + ifscCode, Toast.LENGTH_SHORT).show();
        });

        Button backBtn = findViewById(R.id.bank_back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}