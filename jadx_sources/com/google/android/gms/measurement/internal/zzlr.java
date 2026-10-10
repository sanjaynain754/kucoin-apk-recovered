package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public enum zzlr {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    public final int zza() {
        return this.zzg;
    }

    zzlr(int i11) {
        this.zzg = i11;
    }

    public static zzlr zzb(int i11) {
        for (zzlr zzlrVar : values()) {
            if (zzlrVar.zzg == i11) {
                return zzlrVar;
            }
        }
        return UNKNOWN;
    }
}
