package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzxb {

    @Nullable
    private static zzxb zza;

    public static synchronized zzxb zza() {
        try {
            if (zza == null) {
                zza = new zzxb();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }

    private zzxb() {
    }
}
