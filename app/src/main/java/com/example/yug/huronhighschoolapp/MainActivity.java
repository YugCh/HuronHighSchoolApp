package com.example.yug.huronhighschoolapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

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

        final ImageButton buttonPSchool = (ImageButton) findViewById(R.id.ButtonPSchool);
        buttonPSchool.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Uri PSchoolURL = Uri.parse("http://pschool.aaps.k12.mi.us");
                Intent PSchool = new Intent(Intent.ACTION_VIEW, PSchoolURL);
                startActivity(PSchool);
            }
        });

        final Button buttonSchedule = (Button) findViewById(R.id.ButtonSchedule);
        buttonSchedule.setOnClickListener(new View.OnClickListener()
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
