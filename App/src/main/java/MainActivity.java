package com.my.web;

import android.app.*;
import android.os.*;
import android.webkit.*;

public class MainActivity extends Activity 
{
	WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		wv=findViewById(R.id.wv);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.setWebViewClient(new WebViewClient());
		wv.loadUrl("https://nayyemarn.blogspot.com");
    }

	@Override
	public void onBackPressed()
	{
		if(wv.canGoBack()){
			wv.goBack();
		}else{
			super.onBackPressed();
		}
	}

	
    
}
