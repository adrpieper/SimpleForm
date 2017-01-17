package com.sda.pieper.simpleform;

import android.app.DatePickerDialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MyDatePicker extends TextView {
    private SimpleDateFormat format;
    private Calendar calendar;

    public MyDatePicker(Context context) {
        super(context);
        init();
    }

    public MyDatePicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyDatePicker(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public MyDatePicker(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        calendar = Calendar.getInstance();
        format = new SimpleDateFormat("dd-MM-yyyy");
        setText(format.format(calendar.getTime()));
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });
    }

    private void showDatePickerDialog(){
        Log.d("My Date Picker", "showDatePickerDialog");
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), createListener(), year, month, day);
        datePickerDialog.show();
    }

    private DatePickerDialog.OnDateSetListener createListener() {
        return new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                calendar.set(year, month, day);
                setText(format.format(calendar.getTime()));
            }
        };
    }

    public Calendar getCalendar() {
        return calendar;
    }
}
