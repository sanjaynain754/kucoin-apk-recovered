package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@KeepForSdk
public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    @KeepForSdk
    public Logger(@NonNull String str, @NonNull String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.zzb = string;
        this.zza = str;
        this.zzc = new GmsLogger(str);
        int i11 = 2;
        while (i11 <= 7 && !Log.isLoggable(this.zza, i11)) {
            i11++;
        }
        this.zzd = i11;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public void m12893d(@NonNull String str, @NonNull Object... objArr) {
        if (isLoggable(3)) {
            Log.d(this.zza, format(str, objArr));
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: e */
    public void m12894e(@NonNull String str, @NonNull Throwable th2, @NonNull Object... objArr) {
        Log.e(this.zza, format(str, objArr), th2);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: v */
    public void m12897v(@NonNull String str, @NonNull Throwable th2, @NonNull Object... objArr) {
        if (isLoggable(2)) {
            Log.v(this.zza, format(str, objArr), th2);
        }
    }

    @KeepForSdk
    public void wtf(@NonNull String str, @NonNull Throwable th2, @NonNull Object... objArr) {
        Log.wtf(this.zza, format(str, objArr), th2);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: e */
    public void m12895e(@NonNull String str, @NonNull Object... objArr) {
        Log.e(this.zza, format(str, objArr));
    }

    @NonNull
    @KeepForSdk
    public String format(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    @NonNull
    @KeepForSdk
    public String getTag() {
        return this.zza;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: i */
    public void m12896i(@NonNull String str, @NonNull Object... objArr) {
        Log.i(this.zza, format(str, objArr));
    }

    @KeepForSdk
    public boolean isLoggable(int i11) {
        return this.zzd <= i11;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: w */
    public void m12899w(@NonNull String str, @NonNull Object... objArr) {
        Log.w(this.zza, format(str, objArr));
    }

    @KeepForSdk
    public void wtf(@NonNull Throwable th2) {
        Log.wtf(this.zza, th2);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: v */
    public void m12898v(@NonNull String str, @NonNull Object... objArr) {
        if (isLoggable(2)) {
            Log.v(this.zza, format(str, objArr));
        }
    }
}
