package com.example.yug.huronhighschoolapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class SnowDay extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snow_day);

        final Button callHotline = (Button) findViewById(R.id.ButtonWeatherHotline);
        callHotline.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_CALL);

                intent.setData(Uri.parse("tel:" + savedInstanceState.getString("7349948684")));
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
