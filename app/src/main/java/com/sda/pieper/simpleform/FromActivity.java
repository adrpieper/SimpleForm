package com.sda.pieper.simpleform;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FromActivity extends Activity {

    private EditText userNameEditText;
    private EditText userSurnameEditText;
    private EditText userBirthDateEditText;
    private RadioGroup sexRadioGroup;
    private RadioButton sexFemaleRadioButton;
    private RadioButton sexMaleRadioButton;
    private EditText streetEditText;
    private EditText houseNumberEditText;
    private EditText postCodeEditText;
    private EditText cityEditText;
    private EditText stateEditText;
    private EditText emailEditText;
    private EditText phoneNumberEditText;
    private EditText passwordEditText;
    private EditText confirmPasswordEditText;
    private CheckBox newsletterCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from);

        userNameEditText = (EditText) findViewById(R.id.user_name_edit_text);
        userSurnameEditText = (EditText) findViewById(R.id.user_surname_edit_text);
        userBirthDateEditText = (EditText) findViewById(R.id.user_birth_date_edit_text);
        sexRadioGroup = (RadioGroup) findViewById(R.id.sex_radio_group);

        sexFemaleRadioButton = (RadioButton) findViewById(R.id.sex_female);
        sexMaleRadioButton = (RadioButton) findViewById(R.id.sex_male);

        streetEditText = (EditText) findViewById(R.id.street_edit_text);
        houseNumberEditText = (EditText) findViewById(R.id.house_number_edit_text);
        postCodeEditText = (EditText) findViewById(R.id.post_code_edit_text);
        cityEditText = (EditText) findViewById(R.id.city_edit_text);
        stateEditText =  (EditText) findViewById(R.id.state_edit_text);
        emailEditText = (EditText) findViewById(R.id.email_edit_text);
        phoneNumberEditText = (EditText) findViewById(R.id.phone_number_edit_text);
        passwordEditText = (EditText) findViewById(R.id.password_edit_text);
        confirmPasswordEditText = (EditText) findViewById(R.id.confirm_password_edit_text);
        newsletterCheckBox = (CheckBox) findViewById(R.id.newsletter_check_box);

        Button confirmButton = (Button) findViewById(R.id.confirm_button);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!validateData()){
                    Toast.makeText(FromActivity.this, "Nie wszystkie pola są poprawnie wypełnione", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validateData() {
        if (userNameEditText.getText().toString().isEmpty()) {
            return false;
        }

        String password = passwordEditText.getText().toString();
        String confirmPassword = confirmPasswordEditText.getText().toString();
        if (!password.equals(confirmPassword)) {
            return  false;
        }
        if (sexRadioGroup.getCheckedRadioButtonId() == -1) {
            return false;
        }



        return true;
    }
}   
