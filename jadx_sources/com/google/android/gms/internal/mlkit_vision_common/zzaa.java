package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Set;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzaa {
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
