package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzhk {
    private final zza zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
    public interface zza {
        void doStartService(Context context, Intent intent);
    }

    @MainThread
    public final void zza(Context context, Intent intent) {
        zzib zzibVarZzy = zzib.zzy(context, null, null);
        zzgt zzgtVarZzaV = zzibVarZzy.zzaV();
        if (intent == null) {
            zzgtVarZzaV.zze().zza("Receiver called with null intent");
            return;
        }
        zzibVarZzy.zzaU();
        String action = intent.getAction();
        zzgtVarZzaV.zzk().zzb("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzgtVarZzaV.zze().zza("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzgtVarZzaV.zzk().zza("Starting wakeful intent.");
            this.zza.doStartService(context, className);
        }
    }

    public zzhk(zza zzaVar) {
        Preconditions.checkNotNull(zzaVar);
        this.zza = zzaVar;
    }
}
