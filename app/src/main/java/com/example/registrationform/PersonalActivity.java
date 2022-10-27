package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        //String email = intent.getStringExtra("email");
        //String password = intent.getStringExtra("password");
        //String confirmPassword = intent.getStringExtra("confirmPassword");
        //Toast.makeText(this, email + " " + password +" " + confirmPassword , Toast.LENGTH_SHORT).show();
        Button nextBtn = findViewById(R.id.personalnext_btn);
        nextBtn.setOnClickListener(view -> {
            EditText userNameTxt = findViewById(R.id.personal_username_txt);
            String userName = userNameTxt.getText().toString();
            EditText firstNameTxt = findViewById(R.id.personal_firstname_txt);
            String firstName = firstNameTxt.getText().toString();
            EditText lastNameTxt = findViewById(R.id.personal_lastname_txt);
            String lastName = lastNameTxt.getText().toString();
            Intent intent1 = new Intent(this, AddressActivity.class);
            intent1.putExtras(bundle);
            //intent1.putExtra("email", email);
           // intent1.putExtra("password", password);
            //intent1.putExtra("confirmPassword", confirmPassword);
            intent1.putExtra("userName",userName);
            intent1.putExtra("firstName",firstName);
            intent1.putExtra("lastName",lastName);
            startActivity(intent1);

        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });

    }
}