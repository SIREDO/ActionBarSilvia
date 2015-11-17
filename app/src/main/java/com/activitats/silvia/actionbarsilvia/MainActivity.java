package com.activitats.silvia.actionbarsilvia;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static android.webkit.WebSettings.*;

public class MainActivity extends Activity {
    private WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        browser = (WebView)findViewById(R.id.webView);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
       //int id=item.getItemId();
        switch(item.getItemId()){
            case R.id.gplus:
                try {
                    openweb("https://plus.google.com/100872764770096567953");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //return true;
            case R.id.face:
                try {
                   // browser.loadUrl("https://m.facebook.com/home.php#!/silvia.rd.5?ref=bookmarks");
                    openweb("https://m.facebook.com/home.php#!/silvia.rd.5?ref=bookmarks");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            case R.id.git:
                try {
                   // browser.clearHistory();
                   openweb("https://google.es");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            case R.id.linke:
                try {
                  //  openweb("https://plus.google.com/100872764770096567953");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            case R.id.pint:
                try {
                   // openweb("https://plus.google.com/100872764770096567953");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            case R.id.twit:
                try {
                  //  openweb("https://plus.google.com/100872764770096567953");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            case R.id.mail:
                try {
                   // openweb("https://plus.google.com/100872764770096567953");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            default:
            return super.onOptionsItemSelected(item);
        }




    }

    public  void openweb(String link){
        //browser.clearCache(false);
        browser.clearCache(true);
        browser.loadUrl(link);
        browser.setWebViewClient(new WebViewClient() {
            // evita que los enlaces se abran fuera nuestra app en el navegador de android
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }

        });
    }


}
