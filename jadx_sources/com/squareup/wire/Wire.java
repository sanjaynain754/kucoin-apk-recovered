package com.squareup.wire;

/* JADX INFO: loaded from: classes59.dex */
public final class Wire {
    public static <T> T get(T t11, T t12) {
        return t11 != null ? t11 : t12;
    }

    private Wire() {
    }
}
