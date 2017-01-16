package com.example.yug.huronhighschoolapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PSchool extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pschool);

        WebView viewPSchool = (WebView) findViewById(R.id.PSchoolView);
        WebSettings webSettings = viewPSchool.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportMultipleWindows(true);
        viewPSchool.loadUrl("https://pschool.aaps.k12.mi.us/public/");
    }
}