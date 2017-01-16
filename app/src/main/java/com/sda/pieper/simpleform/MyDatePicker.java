package com.sda.pieper.simpleform;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;


public class MyDatePicker extends TextView {

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
    }
}
