package com.google.android.play.integrity.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.s */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C7837s {

    /* JADX INFO: renamed from: a */
    private final String f12116a;

    /* JADX INFO: renamed from: f */
    private static String m13322f(String str, String str2, @Nullable Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e11) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e11);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m13323a(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m13322f(this.f12116a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m13324b(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m13322f(this.f12116a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m13325c(Throwable th2, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m13322f(this.f12116a, str, objArr), th2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m13326d(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m13322f(this.f12116a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m13327e(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m13322f(this.f12116a, str, objArr));
        }
        return 0;
    }

    public C7837s(String str) {
        this.f12116a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }
}
