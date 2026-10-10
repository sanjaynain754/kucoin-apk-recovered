package com.google.mlkit.vision.common;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* JADX INFO: loaded from: classes56.dex */
public abstract class PointF3D {
    public abstract float getX();

    public abstract float getY();

    public abstract float getZ();

    @NonNull
    public static PointF3D from(float f11, float f12, float f13) {
        return new zza(f11, f12, f13);
    }
}
