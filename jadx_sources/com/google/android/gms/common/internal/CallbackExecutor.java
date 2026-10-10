package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@KeepForSdk
public final class CallbackExecutor {
    @NonNull
    @KeepForSdk
    public static ExecutorService executorService() {
        return zzj.zza;
    }

    private CallbackExecutor() {
    }
}
