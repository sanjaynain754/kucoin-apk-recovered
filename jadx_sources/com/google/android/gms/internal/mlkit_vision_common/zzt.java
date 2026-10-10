package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzt {
    public static Object[] zza(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (objArr[i12] == null) {
                throw new NullPointerException("at index " + i12);
            }
        }
        return objArr;
    }
}
