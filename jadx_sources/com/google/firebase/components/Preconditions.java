package com.google.firebase.components;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t11) {
        t11.getClass();
        return t11;
    }

    public static void checkArgument(boolean z11, String str) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }

    public static void checkState(boolean z11, String str) {
        if (!z11) {
            throw new IllegalStateException(str);
        }
    }
}
