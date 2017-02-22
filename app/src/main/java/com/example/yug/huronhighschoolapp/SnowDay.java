package com.example.yug.huronhighschoolapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.app.Activity;

public class SnowDay extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snow_day);

        Button callHotline = (Button) findViewById(R.id.ButtonWeatherHotline);
        callHotline.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:7349948684"));

                if(ActivityCompat.checkSelfPermission(SnowDay.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(intent);
            }
        });

        WebView viewCalculator = (WebView) findViewById(R.id.SnowDayCalcView);
        WebSettings webSettings = viewCalculator.getSettings();
        webSettings.setJavaScriptEnabled(true);
        viewCalculator.setWebViewClient(new WebViewClient());
        viewCalculator.loadUrl("http://www.snowdaycalculator.com/");
    }
}