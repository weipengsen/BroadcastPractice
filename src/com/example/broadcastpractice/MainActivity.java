package com.example.broadcastpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button forceOffline=(Button) findViewById(R.id.force_offline);
        forceOffline.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent=new Intent("com.example.broadcastpractice.FORCE_OFFLINE");
        		sendBroadcast(intent);
        	}
        });
    }
}
