package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzd extends zzf {
    private final int zza;

    @Nullable
    private Activity zzb;

    @Override // com.google.android.gms.internal.identity.zzg
    public final void zzc(int i11, Bundle bundle) {
        PendingIntent pendingIntentCreatePendingResult;
        if (i11 == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            Activity activity = this.zzb;
            if (activity == null || (pendingIntentCreatePendingResult = activity.createPendingResult(this.zza, intent, 1073741824)) == null) {
                return;
            }
            try {
                pendingIntentCreatePendingResult.send(1);
                return;
            } catch (PendingIntent.CanceledException e11) {
                Log.w("AddressClientImpl", "Exception settng pending result", e11);
                return;
            }
        }
        ConnectionResult connectionResult = new ConnectionResult(i11, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult((Activity) Preconditions.checkNotNull(this.zzb), this.zza);
                return;
            } catch (IntentSender.SendIntentException e12) {
                Log.w("AddressClientImpl", "Exception starting pending intent", e12);
                return;
            }
        }
        try {
            PendingIntent pendingIntentCreatePendingResult2 = ((Activity) Preconditions.checkNotNull(this.zzb)).createPendingResult(this.zza, new Intent(), 1073741824);
            if (pendingIntentCreatePendingResult2 != null) {
                pendingIntentCreatePendingResult2.send(1);
            }
        } catch (PendingIntent.CanceledException e13) {
            Log.w("AddressClientImpl", "Exception setting pending result", e13);
        }
    }

    public zzd(int i11, Activity activity) {
        this.zza = i11;
        this.zzb = activity;
    }
}
