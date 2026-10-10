package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zao extends ContextCompat {
    @Nullable
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent zaa(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i11;
        if (zan.zaa()) {
            if (true != zan.zaa()) {
                i11 = 0;
            } else {
                i11 = 2;
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, i11);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
