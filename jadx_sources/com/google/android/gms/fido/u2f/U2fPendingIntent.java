package com.google.android.gms.fido.u2f;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@Deprecated
public interface U2fPendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(@NonNull Activity activity, int i11) throws IntentSender.SendIntentException;
}
