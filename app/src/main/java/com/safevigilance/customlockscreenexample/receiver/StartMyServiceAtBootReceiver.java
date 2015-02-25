package com.safevigilance.customlockscreenexample.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.safevigilance.customlockscreenexample.MyService;

/**
 * Created by kevin on 2/24/15.
 */
public class StartMyServiceAtBootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            //Cannot start activity here, will break shit.
//            Intent myintent = new Intent(context, MainScreen.class);
//            context.startActivity(myintent);
            CharSequence text = "WOO BOOT RECEIVED! STARTING SERVICE";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            Intent serviceIntent = new Intent(context, MyService.class);
            context.startService(serviceIntent);
        }
    }
}