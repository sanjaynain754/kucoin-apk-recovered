package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zza extends zzc {
    public final int zza;

    @Nullable
    public final Bundle zzb;
    final /* synthetic */ BaseGmsClient zzc;

    public abstract void zzb(ConnectionResult connectionResult);

    public abstract boolean zzd();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zza(BaseGmsClient baseGmsClient, @Nullable int i11, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        this.zzc = baseGmsClient;
        this.zza = i11;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        if (this.zza != 0) {
            this.zzc.zzp(1, null);
            Bundle bundle = this.zzb;
            zzb(new ConnectionResult(this.zza, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null));
        } else {
            if (zzd()) {
                return;
            }
            this.zzc.zzp(1, null);
            zzb(new ConnectionResult(8, null));
        }
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final void zzc() {
    }
}
