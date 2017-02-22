package com.example.yug.huronhighschoolapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Directory extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);

        WebView viewDirectory = (WebView) findViewById(R.id.Directory);
        WebSettings webSettings = viewDirectory.getSettings();
        webSettings.setJavaScriptEnabled(true);
        viewDirectory.setWebViewClient(new WebViewClient());
        viewDirectory.loadUrl("http://www.a2schools.org/Domain/373");
    }
}