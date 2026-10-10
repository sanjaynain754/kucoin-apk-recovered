package androidx.media3.common.util;

import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Assertions {
    public static void checkArgument(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static String checkNotEmpty(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static <T> T checkNotNull(@Nullable T t11) {
        t11.getClass();
        return t11;
    }

    public static void checkState(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static <T> T checkStateNotNull(@Nullable T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException();
    }

    public static void checkArgument(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int checkIndex(int i11, int i12, int i13) {
        if (i11 < i12 || i11 >= i13) {
            throw new IndexOutOfBoundsException();
        }
        return i11;
    }

    public static <T> T checkNotNull(@Nullable T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> T checkStateNotNull(@Nullable T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    private Assertions() {
    }

    public static void checkMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    public static String checkNotEmpty(@Nullable String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }
}
