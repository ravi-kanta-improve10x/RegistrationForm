package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Button nextBtn = findViewById(R.id.address_next_btn);
        nextBtn.setOnClickListener(view -> {
            EditText houseNoTxt = findViewById(R.id.hno_txt);
            String houseNo = houseNoTxt.getText().toString();
            EditText streetTxt = findViewById(R.id.street_txt);
            String street = streetTxt.getText().toString();
            EditText cityTxt = findViewById(R.id.city_txt);
            String city  = cityTxt.getText().toString();
            EditText stateTxt = findViewById(R.id.state_txt);
            String state = stateTxt.getText().toString();
            EditText countryTxt = findViewById(R.id.country_txt);
            String country = countryTxt.getText().toString();
            Intent intent6 = new Intent(this,BirthDetailsActivity.class);
            intent6.putExtras(bundle);
            intent6.putExtra("houseNo", houseNo);
            intent6.putExtra("street", street);
            intent6.putExtra("city", city);
            intent6.putExtra("state",state);
            intent6.putExtra("country",country);
            startActivity(intent6);
        });

        Button backBtn = findViewById(R.id.address_back_txt);
        backBtn.setOnClickListener(view -> {
            finish();
        });

    }
}