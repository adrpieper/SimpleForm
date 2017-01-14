package com.sda.pieper.simpleform;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FromActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from);

        EditText userNameEditText = (EditText) findViewById(R.id.user_name_edit_text);
        EditText userSurnameEditText = (EditText) findViewById(R.id.user_surname_edit_text);
        EditText userBithDateEditText = (EditText) findViewById(R.id.user_birth_date_edit_text);
        RadioGroup sexRadioGroup = (RadioGroup) findViewById(R.id.sex_radio_group);

        RadioButton sexFemaleRadioButton = (RadioButton) findViewById(R.id.sex_female);
        RadioButton sexMaleRadioButton = (RadioButton) findViewById(R.id.sex_male);

        EditText streetEditText = (EditText) findViewById(R.id.street_edit_text);
        EditText houseNumberEditText = (EditText) findViewById(R.id.house_number_edit_text);
        EditText postCodeEditText = (EditText) findViewById(R.id.post_code_edit_text);
        EditText cityEditText = (EditText) findViewById(R.id.city_edit_text);
        EditText state_edit_text = (EditText) findViewById(R.id.state_edit_text);
        EditText email_edit_text = (EditText) findViewById(R.id.email_edit_text);
        EditText phone_number_edit_text = (EditText) findViewById(R.id.phone_number_edit_text);
        EditText password_edit_text = (EditText) findViewById(R.id.password_edit_text);
        EditText confirm_password_edit_text = (EditText) findViewById(R.id.confirm_password_edit_text);
        CheckBox newsletter_check_box = (CheckBox) findViewById(R.id.newsletter_check_box);
    }
}
