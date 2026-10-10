package com.google.android.gms.internal.mlkit_vision_barcode;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
public final /* synthetic */ class zzec {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j11, Object obj2, Object obj3) {
        while (!C7069a.m12906a(unsafe, obj, j11, obj2, obj3)) {
            if (unsafe.getObject(obj, j11) != obj2) {
                return false;
            }
        }
        return true;
    }
}
