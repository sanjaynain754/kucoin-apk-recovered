package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzjx implements zzju {

    @GuardedBy("GservicesLoader.class")
    private static zzjx zza;
    private final Context zzb;
    private final ContentObserver zzc;

    @GuardedBy("GservicesLoader.class")
    private boolean zzd;

    private zzjx() {
        this.zzd = false;
        this.zzb = null;
        this.zzc = null;
    }

    private zzjx(Context context) {
        this.zzd = false;
        this.zzb = context;
        this.zzc = new zzjv(this, null);
    }

    public static zzjx zza(Context context) {
        zzjx zzjxVar;
        synchronized (zzjx.class) {
            try {
                if (zza == null) {
                    zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzjx(context) : new zzjx();
                }
                zzjx zzjxVar2 = zza;
                if (zzjxVar2 != null && zzjxVar2.zzc != null && !zzjxVar2.zzd) {
                    try {
                        context.getContentResolver().registerContentObserver(zzjg.zza, true, zza.zzc);
                        ((zzjx) Preconditions.checkNotNull(zza)).zzd = true;
                    } catch (SecurityException e11) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e11);
                    }
                }
                zzjxVar = (zzjx) Preconditions.checkNotNull(zza);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzjxVar;
    }

    public static synchronized void zzc() {
        Context context;
        try {
            zzjx zzjxVar = zza;
            if (zzjxVar != null && (context = zzjxVar.zzb) != null && zzjxVar.zzc != null && zzjxVar.zzd) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzju
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final String zze(final String str) {
        Context context = this.zzb;
        if (context != null && !zzjm.zzb(context)) {
            try {
                return (String) zzju.zzg(new zzjt() { // from class: com.google.android.gms.internal.measurement.zzjw
                    @Override // com.google.android.gms.internal.measurement.zzjt
                    public final /* synthetic */ Object zza() {
                        return this.zza.zzd(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e11) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e11);
            }
        }
        return null;
    }

    public final /* synthetic */ String zzd(String str) {
        return zzjf.zza(((Context) Preconditions.checkNotNull(this.zzb)).getContentResolver(), str, null);
    }
}
