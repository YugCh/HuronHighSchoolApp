package com.example.yug.huronhighschoolapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Announcements extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcements);

        WebView viewAnnouncements = (WebView) findViewById(R.id.AnnouncementsView);
        WebSettings webSettings = viewAnnouncements.getSettings();
        webSettings.setJavaScriptEnabled(true);
        viewAnnouncements.setWebViewClient(new WebViewClient());
        viewAnnouncements.loadUrl("https://pschool.aaps.k12.mi.us/bulletin/05671");
    }
}