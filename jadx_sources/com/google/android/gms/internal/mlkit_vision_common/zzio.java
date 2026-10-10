package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public enum zzio implements zzag {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);

    private final int zzh;

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzag
    public final int zza() {
        return this.zzh;
    }

    zzio(int i11) {
        this.zzh = i11;
    }
}
