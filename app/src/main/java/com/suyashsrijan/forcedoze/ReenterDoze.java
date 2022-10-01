package com.suyashsrijan.forcedoze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class ReenterDoze extends BroadcastReceiver {

    public static String TAG = "ForceDoze";

    public ReenterDoze() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "Re-enter broadcast received");
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("reenter-doze"));
    }
}
