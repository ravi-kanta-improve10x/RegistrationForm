package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        String confirmPassword = intent.getStringExtra("confirmPassword");
        String userName = intent.getStringExtra("userName");
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String dateOfBirth = intent.getStringExtra("dateOfBirth");
        String placeOfBirth = intent.getStringExtra("placeOfBirth");
        String currentCompany = intent.getStringExtra("currentCompany");
        String totalExperience = intent.getStringExtra("totalExperience");
        String designation = intent.getStringExtra("designation");
        String bankName = intent.getStringExtra("bankName");
        String accountHolder = intent.getStringExtra("accountHolderName");
        String accountNumber = intent.getStringExtra("accountNumber");
        String ifscCode = intent.getStringExtra("ifscCode");
        String panNumber = intent.getStringExtra("PanNumber");
        String aadharNumber = intent.getStringExtra("aadhar");
        String houseNumber = intent.getStringExtra("houseNo");
        String street = intent.getStringExtra("street");
        String city = intent.getStringExtra("city");
        String state = intent.getStringExtra("state");
        String country= intent.getStringExtra("country");
        String creditCard = intent.getStringExtra("creditCard");
        String cardHolder = intent.getStringExtra("cardHolder");
        String expiry = intent.getStringExtra("expiry");
        String cvv = intent.getStringExtra("cvv");

        TextView emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText(email);
        TextView userNameTxt = findViewById(R.id.username_txt);
        userNameTxt.setText(userName);
        TextView firstNameTxt = findViewById(R.id.firstname_txt);
        firstNameTxt.setText(firstName);
        TextView lastNameTxt = findViewById(R.id.lastname_txt);
        lastNameTxt.setText(lastName);
        TextView dateOfBirthTxt = findViewById(R.id.dateofbirth_txt);
        dateOfBirthTxt.setText(dateOfBirth);
        TextView placeOfBirthTxt  = findViewById(R.id.placeofbirth_txt);
        placeOfBirthTxt.setText(placeOfBirth);
        TextView currentCompanyTxt = findViewById(R.id.currentcompany_txt);
        currentCompanyTxt.setText(currentCompany);
        TextView totalExperienceTxt = findViewById(R.id.totalexperience_txt);
        totalExperienceTxt.setText(totalExperience);
        TextView designationTxt = findViewById(R.id.designation_txt);
        designationTxt.setText(designation);
        TextView bankNameTxt = findViewById(R.id.bankname_txt);
        bankNameTxt.setText(bankName);
        TextView accountHolderTxt = findViewById(R.id.accountholder_txt);
        accountHolderTxt.setText(accountHolder);
        TextView accountNumberTxt = findViewById(R.id.accountnumber_txt);
        accountNumberTxt.setText(accountNumber);
        TextView ifscCodeTxt = findViewById(R.id.ifsccode_txt);
        ifscCodeTxt.setText(ifscCode);
        TextView panNumberTxt = findViewById(R.id.pannumber_txt);
        panNumberTxt.setText(panNumber);
        TextView aadharNumberTxt = findViewById(R.id.aadharno_txt);
        aadharNumberTxt.setText(aadharNumber);
        TextView houseNumberTxt = findViewById(R.id.hno_aprt_txt);
        houseNumberTxt.setText(houseNumber);
        TextView streetTxt = findViewById(R.id.street_name_txt);
        streetTxt.setText(street);
        TextView cityTxt = findViewById(R.id.city_txt1);
        cityTxt.setText(city);
        TextView stateTxt = findViewById(R.id.state_txt1);
        stateTxt.setText(state);
        TextView countryTxt = findViewById(R.id.country_txt1);
        countryTxt.setText(country);
        TextView creditCardTxt = findViewById(R.id.card_no_txt);
        creditCardTxt.setText(creditCard);
        TextView cardHolderTxt = findViewById(R.id.card_holder_txt);
        cardHolderTxt.setText(cardHolder);
        TextView expiryTxt = findViewById(R.id.expiry_txt);
        expiryTxt.setText(expiry);
        TextView cvvTxt = findViewById(R.id.cvv_txt1);
        cvvTxt.setText(cvv);


    }
}