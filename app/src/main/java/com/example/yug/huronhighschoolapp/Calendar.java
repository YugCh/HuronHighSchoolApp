package com.example.yug.huronhighschoolapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Calendar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        WebView viewCalendar = (WebView) findViewById(R.id.CalendarView);
        WebSettings webSettings = viewCalendar.getSettings();
        webSettings.setJavaScriptEnabled(true);
        viewCalendar.loadUrl("https://calendar.google.com/calendar/embed?src=aaps.k12.mi.us_bkfpnid9pe5438jl75bschj5k4%40group.calendar.google.com&ctz=America/New_York");
    }
}