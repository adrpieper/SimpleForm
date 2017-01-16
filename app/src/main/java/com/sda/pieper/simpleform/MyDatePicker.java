package com.sda.pieper.simpleform;

import android.content.Context;
import android.util.AttributeSet;
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
    }
}
