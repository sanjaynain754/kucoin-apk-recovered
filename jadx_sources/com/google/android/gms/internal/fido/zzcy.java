package com.google.android.gms.internal.fido;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzcy {
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
