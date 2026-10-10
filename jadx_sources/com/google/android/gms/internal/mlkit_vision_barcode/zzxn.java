package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzxn {
    public abstract float zza();

    public abstract float zzb();

    public abstract float zzc();

    public abstract float zzd();

    public abstract float zze();

    public static zzxn zzg(@NonNull Iterable iterable, int i11, int i12, float f11) {
        Iterator it = iterable.iterator();
        int iMax = 0;
        int iMin = i11;
        int iMin2 = i12;
        int iMax2 = 0;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax = Math.max(iMax, point.x);
            iMax2 = Math.max(iMax2, point.y);
        }
        float f12 = i11;
        float f13 = i12;
        return new zzxg((iMin + 0.0f) / f12, (iMin2 + 0.0f) / f13, (iMax + 0.0f) / f12, (iMax2 + 0.0f) / f13, 0.0f);
    }

    public final float zzf() {
        if (zzh()) {
            return (zzb() - zzc()) * (zzd() - zze());
        }
        return 0.0f;
    }

    public final boolean zzh() {
        if (zzc() >= 0.0f && zzc() < zzb() && zzb() <= 1.0f && zze() >= 0.0f && zze() < zzd() && zzd() <= 1.0f) {
            return true;
        }
        return false;
    }
}
