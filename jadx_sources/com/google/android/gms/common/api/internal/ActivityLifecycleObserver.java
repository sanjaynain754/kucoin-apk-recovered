package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
@KeepForSdk
public abstract class ActivityLifecycleObserver {
    @NonNull
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(@NonNull Runnable runnable);

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: of */
    public static final ActivityLifecycleObserver m12876of(@NonNull Activity activity) {
        return new zab(zaa.zaa(activity));
    }
}
