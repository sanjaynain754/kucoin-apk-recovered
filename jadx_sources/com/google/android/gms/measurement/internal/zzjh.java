package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public enum zzjh {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    private final String zze;

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }

    zzjh(String str) {
        this.zze = str;
    }
}
