package com.google.android.gms.internal.mlkit_common;

import java.util.Set;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzar {
    public static int zza(Set set) {
        int iHashCode;
        int i11 = 0;
        for (Object obj : set) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i11 += iHashCode;
        }
        return i11;
    }
}
