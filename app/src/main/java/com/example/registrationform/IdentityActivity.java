package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Button nextBtn = findViewById(R.id.identity_next_btn);
        nextBtn.setOnClickListener(view -> {
            EditText panNumberTxt = findViewById(R.id.pan_txt);
            String panNumber = panNumberTxt.getText().toString();
            EditText aadharTxt = findViewById(R.id.aadhar_txt1);
            String aadhar = aadharTxt.getText().toString();
            Intent intent5 = new Intent(this, SuccessActivity.class);
            intent5.putExtras(bundle);
            intent5.putExtra("PanNumber", panNumber);
            intent5.putExtra("aadhar", aadhar);
            startActivity(intent5);
        });

        Button backBtn = findViewById(R.id.identity_back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}