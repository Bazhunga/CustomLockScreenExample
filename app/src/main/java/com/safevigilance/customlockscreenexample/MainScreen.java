package com.safevigilance.customlockscreenexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;


public class MainScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON |
                WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED |
                WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
        setContentView(R.layout.activity_main_screen);
        Intent serviceIntent = new Intent(this, MyService.class);
        startService(serviceIntent);
    }
}
