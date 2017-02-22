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
    }
}