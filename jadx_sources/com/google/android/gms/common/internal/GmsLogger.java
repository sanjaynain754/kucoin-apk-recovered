package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@KeepForSdk
public final class GmsLogger {
    private final String zza;

    @Nullable
    private final String zzb;

    @KeepForSdk
    public GmsLogger(@NonNull String str) {
        this(str, null);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public void m12878d(@NonNull String str, @NonNull String str2) {
        if (canLog(3)) {
            Log.d(str, zza(str2));
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: e */
    public void m12880e(@NonNull String str, @NonNull String str2) {
        if (canLog(6)) {
            Log.e(str, zza(str2));
        }
    }

    @KeepForSdk
    public void efmt(@NonNull String str, @NonNull String str2, @NonNull Object... objArr) {
        if (canLog(6)) {
            Log.e(str, zzb(str2, objArr));
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: i */
    public void m12882i(@NonNull String str, @NonNull String str2) {
        if (canLog(4)) {
            Log.i(str, zza(str2));
        }
    }

    @KeepForSdk
    public void pii(@NonNull String str, @NonNull String str2) {
    }

    @KeepForSdk
    /* JADX INFO: renamed from: v */
    public void m12884v(@NonNull String str, @NonNull String str2) {
        if (canLog(2)) {
            Log.v(str, zza(str2));
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: w */
    public void m12886w(@NonNull String str, @NonNull String str2) {
        if (canLog(5)) {
            Log.w(str, zza(str2));
        }
    }

    @KeepForSdk
    public void wfmt(@NonNull String str, @NonNull String str2, @NonNull Object... objArr) {
        if (canLog(5)) {
            Log.w(this.zza, zzb(str2, objArr));
        }
    }

    @KeepForSdk
    public void wtf(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(7)) {
            Log.e(str, zza(str2), th2);
            Log.wtf(str, zza(str2), th2);
        }
    }

    @KeepForSdk
    public GmsLogger(@NonNull String str, @Nullable String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zza = str;
        this.zzb = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    private final String zza(String str) {
        String str2 = this.zzb;
        return str2 == null ? str : str2.concat(str);
    }

    private final String zzb(String str, Object... objArr) {
        String str2 = this.zzb;
        String str3 = String.format(str, objArr);
        return str2 == null ? str3 : str2.concat(str3);
    }

    @KeepForSdk
    public boolean canLog(int i11) {
        return Log.isLoggable(this.zza, i11);
    }

    @KeepForSdk
    public void pii(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
    }

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public void m12879d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(3)) {
            Log.d(str, zza(str2), th2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: e */
    public void m12881e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(6)) {
            Log.e(str, zza(str2), th2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: i */
    public void m12883i(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(4)) {
            Log.i(str, zza(str2), th2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: v */
    public void m12885v(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(2)) {
            Log.v(str, zza(str2), th2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: w */
    public void m12887w(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(5)) {
            Log.w(str, zza(str2), th2);
        }
    }
}
