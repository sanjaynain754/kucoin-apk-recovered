package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes45.dex */
public enum zzmm implements zzba {
    UNKNOWN(0),
    TRANSLATE(1);

    private final int zzd;

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
        return this.zzd;
    }

    zzmm(int i11) {
        this.zzd = i11;
    }

    public static zzmm zzb(int i11) {
        for (zzmm zzmmVar : values()) {
            if (zzmmVar.zzd == i11) {
                return zzmmVar;
            }
        }
        return UNKNOWN;
    }
}
