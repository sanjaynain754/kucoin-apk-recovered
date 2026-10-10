package io.flutter.util;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes60.dex */
public final class Preconditions {
    public static void checkState(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z11, @Nullable Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    private Preconditions() {
    }

    public static <T> T checkNotNull(T t11) {
        t11.getClass();
        return t11;
    }
}
