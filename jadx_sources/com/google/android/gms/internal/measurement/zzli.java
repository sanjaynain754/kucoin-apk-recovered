package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public class zzli {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zzb(int i11) {
        return (i11 >>> 1) ^ (-(i11 & 1));
    }

    public static long zzc(long j11) {
        return (j11 >>> 1) ^ (-(1 & j11));
    }

    public /* synthetic */ zzli(byte[] bArr) {
    }
}
