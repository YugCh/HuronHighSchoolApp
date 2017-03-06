package com.example.yug.huronhighschoolapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Maps extends Activity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_maps);

        final Button buttonMap = (Button) findViewById(R.id.location);
        buttonMap.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentMaps = new Intent(v.getContext(), Location.class);
                startActivity(intentMaps);
            }
        });

        final Button buttonRestaurant = (Button) findViewById(R.id.nearby);
        buttonRestaurant.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentMaps1 = new Intent(v.getContext(), MapsActivity.class);
                startActivity(intentMaps1);
            }
        });

        final Button buttonCampusmap = (Button) findViewById(R.id.campus);
        buttonCampusmap.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentCampusmap = new Intent(v.getContext(), CampusMap.class);
                startActivity(intentCampusmap);
            }
        });
    }
}