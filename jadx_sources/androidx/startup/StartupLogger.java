package androidx.startup;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class StartupLogger {
    static final boolean DEBUG = false;
    private static final String TAG = "StartupLogger";

    /* JADX INFO: renamed from: e */
    public static void m3784e(@NonNull String str, @Nullable Throwable th2) {
        Log.e(TAG, str, th2);
    }

    /* JADX INFO: renamed from: i */
    public static void m3785i(@NonNull String str) {
        Log.i(TAG, str);
    }

    /* JADX INFO: renamed from: w */
    public static void m3786w(@NonNull String str) {
        Log.w(TAG, str);
    }

    private StartupLogger() {
    }
}
