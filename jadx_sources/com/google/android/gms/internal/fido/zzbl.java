package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzbl implements Serializable {
    public abstract Object zza();

    public abstract boolean zzb();

    public static zzbl zzc() {
        return zzaz.zza;
    }

    public static zzbl zzd(Object obj) {
        return new zzbn(obj);
    }
}
