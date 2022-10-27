package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreditCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Button nextBtn = findViewById(R.id.ccnext_btn);
        nextBtn.setOnClickListener(view -> {
            EditText creditCardTxt = findViewById(R.id.ccnumber_txt);
            String creditCard = creditCardTxt.getText().toString();
            EditText cardHolderTxt = findViewById(R.id.ccholder_txt);
            String cardHolder = cardHolderTxt.getText().toString();
            EditText expiryTxt = findViewById(R.id.ccexpiry_txt);
            String expiry = expiryTxt.getText().toString();
            EditText cvvTxt = findViewById(R.id.cvv_txt);
            String cvv = cvvTxt.getText().toString();
            Intent intent7 = new Intent(this,IdentityActivity.class);
            intent7.putExtras(bundle);
            intent7.putExtra("creditCard", creditCard);
            intent7.putExtra("cardHolder",cardHolder);
            intent7.putExtra("expiry",expiry);
            intent7.putExtra("cvv",cvv);
            startActivity(intent7);
        });

            Button backBtn = findViewById(R.id.ccback_btn);
            backBtn.setOnClickListener(view -> {
                finish();
            });
    }
}