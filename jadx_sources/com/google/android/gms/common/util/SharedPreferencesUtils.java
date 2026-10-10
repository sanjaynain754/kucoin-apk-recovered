package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@KeepForSdk
public class SharedPreferencesUtils {
    @KeepForSdk
    @Deprecated
    public static void publishWorldReadableSharedPreferences(@NonNull Context context, @NonNull SharedPreferences.Editor editor, @NonNull String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }

    private SharedPreferencesUtils() {
    }
}
