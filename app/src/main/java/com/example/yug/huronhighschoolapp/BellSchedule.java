package com.example.yug.huronhighschoolapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class BellSchedule extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell_schedule);

        final Button buttonNormal = (Button) findViewById(R.id.normalbutton);
        buttonNormal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentNormalSchedule = new Intent(v.getContext(), NormalSchedule.class);
                startActivity(intentNormalSchedule);
            }
        });

        final Button buttonDouble = (Button) findViewById(R.id.doublebutton);
        buttonDouble.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentDoubleSchedule = new Intent(v.getContext(), DoubleSchedule.class);
                startActivity(intentDoubleSchedule);
            }
        });

        final Button buttonExam = (Button) findViewById(R.id.button3);
        buttonExam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentExam = new Intent(v.getContext(), ExamSchedule.class);
                startActivity(intentExam);
            }
        });
    }
}
