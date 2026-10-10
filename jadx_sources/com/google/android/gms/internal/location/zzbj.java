package com.google.android.gms.internal.location;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzbj {
    public static Looper zza(@Nullable Looper looper) {
        return looper != null ? looper : zzb();
    }

    public static Looper zzb() {
        boolean z11;
        if (Looper.myLooper() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
