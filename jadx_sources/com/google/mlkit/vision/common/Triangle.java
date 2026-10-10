package com.google.mlkit.vision.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* JADX INFO: loaded from: classes56.dex */
public class Triangle<T> {
    private final zzp zza;

    @NonNull
    public List<T> getAllPoints() {
        return this.zza;
    }

    @KeepForSdk
    public Triangle(@NonNull T t11, @NonNull T t12, @NonNull T t13) {
        this.zza = zzp.zzj(t11, t12, t13);
    }
}
