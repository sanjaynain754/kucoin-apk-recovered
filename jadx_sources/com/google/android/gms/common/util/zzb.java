package com.google.android.gms.common.util;

import android.os.StrictMode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
final class zzb {
    @DoNotInline
    public static StrictMode.VmPolicy.Builder zza(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
