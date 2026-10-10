package com.google.android.gms.maps.internal;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zza {
    public static byte zza(@Nullable Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    @Nullable
    public static Boolean zzb(byte b11) {
        if (b11 == 0) {
            return Boolean.FALSE;
        }
        if (b11 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
