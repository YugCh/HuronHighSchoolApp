package com.example.yug.huronhighschoolapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Calendar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        WebView viewCalendar = (WebView) findViewById(R.id.CalendarView);
        WebSettings webSettings = viewCalendar.getSettings();
        webSettings.setJavaScriptEnabled(true);
        viewCalendar.setWebViewClient(new WebViewClient());
        viewCalendar.loadUrl("https://www.google.com/calendar/embed?title=Huron%20Calendars&showTitle=0&mode=WEEK&height=600&wkst=1&bgcolor=%23FFFFFF&src=17p3uh9vm0nh41tgq1hnr27u08%40group.calendar.google.com&color=%23528800&src=ner10ng8t3u9mun9tbp2tivcdk%40group.calendar.google.com&color=%23125A12&src=dnu292q8k6gqlbmf32dcgvoor4n5mp6n%40import.calendar.google.com&color=%23856508&src=ujqpuakfhi0eln5pipt4je0o2hjd6mgp%40import.calendar.google.com&color=%23856508&src=fj1m75p09gbpreeru9nta0eevc%40group.calendar.google.com&color=%234E5D6C&ctz=America%2FNew_York");
    }
}