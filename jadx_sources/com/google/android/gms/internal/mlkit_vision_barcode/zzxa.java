package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzxa {

    @Nullable
    private static zzwz zza;

    public static synchronized zzwp zza(zzwh zzwhVar) {
        try {
            if (zza == null) {
                zza = new zzwz(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (zzwp) zza.get(zzwhVar);
    }

    public static synchronized zzwp zzb(String str) {
        return zza(zzwh.zzd(str).zzd());
    }
}
