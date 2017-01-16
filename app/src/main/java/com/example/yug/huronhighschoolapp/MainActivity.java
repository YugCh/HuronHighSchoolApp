package com.example.yug.huronhighschoolapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonMap = (Button) findViewById(R.id.ButtonMap);
        buttonMap.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentMaps = new Intent(v.getContext(), Maps.class);
                startActivity(intentMaps);
            }
        });

        final Button buttonCalendar = (Button) findViewById(R.id.ButtonCalendar);
        buttonCalendar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentCalendar = new Intent(v.getContext(), Calendar.class);
                startActivity(intentCalendar);
            }
        });

        final Button buttonDirectory = (Button) findViewById(R.id.ButtonDirectory);
        buttonDirectory.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentDirectory = new Intent(v.getContext(), Directory.class);
                startActivity(intentDirectory);
            }
        });

        final Button buttonBellSchedule = (Button) findViewById(R.id.ButtonBellSchedule);
        buttonBellSchedule.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentBellSchedule = new Intent(v.getContext(), BellSchedule.class);
                startActivity(intentBellSchedule);
            }
        });

        final Button buttonAnnouncements = (Button) findViewById(R.id.ButtonAnnouncements);
        buttonAnnouncements.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentAnnouncements = new Intent(v.getContext(), Announcements.class);
                startActivity(intentAnnouncements);
            }
        });

        final Button buttonPSchool = (Button) findViewById(R.id.ButtonPSchool);
        buttonPSchool.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentPSchool = new Intent(v.getContext(), PSchool.class);
                startActivity(intentPSchool);
            }
        });

        final Button buttonSchedule = (Button) findViewById(R.id.ButtonSchedule);
        buttonMap.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentSchedule = new Intent(v.getContext(), Schedule.class);
                startActivity(intentSchedule);
            }
        });

        final Button buttonSnowDay = (Button) findViewById(R.id.ButtonSnowDay);
        buttonSnowDay.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentSnowDay = new Intent(v.getContext(), SnowDay.class);
                startActivity(intentSnowDay);
            }
        });
    }
}
