package com.google.api.client.util;

/* JADX INFO: loaded from: classes56.dex */
public final class Preconditions {
    public static void checkArgument(boolean z11) {
        com.google.common.base.Preconditions.checkArgument(z11);
    }

    public static <T> T checkNotNull(T t11) {
        return (T) com.google.common.base.Preconditions.checkNotNull(t11);
    }

    public static void checkState(boolean z11) {
        com.google.common.base.Preconditions.checkState(z11);
    }

    public static void checkArgument(boolean z11, Object obj) {
        com.google.common.base.Preconditions.checkArgument(z11, obj);
    }

    public static <T> T checkNotNull(T t11, Object obj) {
        return (T) com.google.common.base.Preconditions.checkNotNull(t11, obj);
    }

    public static void checkState(boolean z11, Object obj) {
        com.google.common.base.Preconditions.checkState(z11, obj);
    }

    private Preconditions() {
    }

    public static void checkArgument(boolean z11, String str, Object... objArr) {
        com.google.common.base.Preconditions.checkArgument(z11, str, objArr);
    }

    public static <T> T checkNotNull(T t11, String str, Object... objArr) {
        return (T) com.google.common.base.Preconditions.checkNotNull((Object) t11, str, objArr);
    }

    public static void checkState(boolean z11, String str, Object... objArr) {
        com.google.common.base.Preconditions.checkState(z11, str, objArr);
    }
}
