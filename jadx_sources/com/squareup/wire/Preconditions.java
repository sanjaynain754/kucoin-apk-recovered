package com.squareup.wire;

/* JADX INFO: loaded from: classes59.dex */
final class Preconditions {
    public static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    private Preconditions() {
    }
}
