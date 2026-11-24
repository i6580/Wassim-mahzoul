package com.ilyeswater.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.view.View;
import android.graphics.Color;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setStatusBarColor(Color.rgb(8, 92, 160));
    getWindow().setNavigationBarColor(Color.rgb(8, 92, 160));
    WebView web = new WebView(this);
    web.setBackgroundColor(Color.WHITE);
    WebSettings s = web.getSettings();
    s.setJavaScriptEnabled(true);
    s.setDomStorageEnabled(true);
    s.setAllowFileAccess(true);
    web.setOverScrollMode(View.OVER_SCROLL_NEVER);
    setContentView(web);
    web.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed() { super.onBackPressed(); }
}
