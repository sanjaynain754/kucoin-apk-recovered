package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zze {
    private final zzjh zza;

    public final zzjh zza() {
        return this.zza;
    }

    public final String zzb() {
        return String.valueOf(zzjk.zzm(this.zza));
    }

    public zze(zzjh zzjhVar) {
        this.zza = zzjhVar;
    }

    public static zze zzc(String str) {
        zzjh zzjhVarZzj;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            zzjhVarZzj = zzjk.zzj(str.charAt(0));
        } else {
            zzjhVarZzj = zzjh.UNINITIALIZED;
        }
        return new zze(zzjhVarZzj);
    }
}
