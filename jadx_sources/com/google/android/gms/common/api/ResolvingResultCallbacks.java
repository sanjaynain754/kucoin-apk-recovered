package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    private final Activity zza;
    private final int zzb;

    @Override // com.google.android.gms.common.api.ResultCallbacks
    public abstract void onSuccess(@NonNull R r11);

    public abstract void onUnresolvableFailure(@NonNull Status status);

    public ResolvingResultCallbacks(@NonNull Activity activity, int i11) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.common.api.ResultCallbacks
    @KeepForSdk
    public final void onFailure(@NonNull Status status) {
        if (status.hasResolution()) {
            try {
                status.startResolutionForResult(this.zza, this.zzb);
                return;
            } catch (IntentSender.SendIntentException e11) {
                Log.e("ResolvingResultCallback", "Failed to start resolution", e11);
                onUnresolvableFailure(new Status(8));
                return;
            }
        }
        onUnresolvableFailure(status);
    }
}
