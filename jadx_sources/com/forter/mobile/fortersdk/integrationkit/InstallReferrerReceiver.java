package com.forter.mobile.fortersdk.integrationkit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.forter.mobile.fortersdk.C6502a;
import com.forter.mobile.fortersdk.models.TrackType;

/* JADX INFO: loaded from: classes45.dex */
public class InstallReferrerReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        if (stringExtra != null && stringExtra.length() != 0) {
            C6502a.m12060g().mo12066f(TrackType.REFERRER, stringExtra);
        }
    }
}
