package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@KeepForSdk
@Deprecated
public class WakeLockTracker {
    private static final WakeLockTracker zza = new WakeLockTracker();

    @KeepForSdk
    public void registerEvent(@NonNull Context context, @NonNull String str, int i11, @NonNull String str2, @NonNull String str3, @NonNull String str4, int i12, @NonNull List<String> list) {
    }

    @NonNull
    @KeepForSdk
    public static WakeLockTracker getInstance() {
        return zza;
    }

    @KeepForSdk
    public void registerEvent(@NonNull Context context, @NonNull String str, int i11, @NonNull String str2, @NonNull String str3, @NonNull String str4, int i12, @NonNull List<String> list, long j11) {
    }

    @KeepForSdk
    public void registerReleaseEvent(@NonNull Context context, @NonNull Intent intent) {
    }

    @KeepForSdk
    public void registerDeadlineEvent(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull String str3, int i11, @NonNull List<String> list, boolean z11, long j11) {
    }

    @KeepForSdk
    public void registerAcquireEvent(@NonNull Context context, @NonNull Intent intent, @NonNull String str, @NonNull String str2, @NonNull String str3, int i11, @NonNull String str4) {
    }
}
