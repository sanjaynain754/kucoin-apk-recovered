package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzjk extends Exception {
    public zzjk() {
    }

    public zzjk(String str) {
        super(str);
    }

    public zzjk(String str, Throwable th2) {
        super("ContentProvider query failed", th2);
    }
}
