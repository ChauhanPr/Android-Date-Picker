package com.example.datepickertest;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.DatePicker;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatePicker dp=(DatePicker) findViewById(R.id.datePicker1);
        TextView t=(TextView) findViewById(R.id.textView);
        Button b=(Button) findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("Selected Date ::"+dp.getDayOfMonth()+"/"+dp.getMonth()+"/"+dp.getYear());
            }
        });
    }
}