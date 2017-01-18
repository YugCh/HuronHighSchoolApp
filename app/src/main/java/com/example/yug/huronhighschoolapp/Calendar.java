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
        viewCalendar.loadUrl("https://www.google.com/calendar/embed?title=Huron%20Calendars&amp;showTitle=0&amp;mode=WEEK&amp;height=600&amp;wkst=1&amp;bgcolor=%23FFFFFF&amp;src=17p3uh9vm0nh41tgq1hnr27u08%40group.calendar.google.com&amp;color=%23528800&amp;src=ner10ng8t3u9mun9tbp2tivcdk%40group.calendar.google.com&amp;color=%23125A12&amp;src=dnu292q8k6gqlbmf32dcgvoor4n5mp6n%40import.calendar.google.com&amp;color=%23856508&amp;src=ujqpuakfhi0eln5pipt4je0o2hjd6mgp%40import.calendar.google.com&amp;color=%23856508&amp;src=fj1m75p09gbpreeru9nta0eevc%40group.calendar.google.com&amp;color=%234E5D6C&amp;ctz=America%2FNew_York");
    }
}