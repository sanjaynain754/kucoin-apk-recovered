package com.squareup.picasso;

/* JADX INFO: loaded from: classes59.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);

    final int index;

    public static boolean shouldReadFromMemoryCache(int i11) {
        return (i11 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToMemoryCache(int i11) {
        return (i11 & NO_STORE.index) == 0;
    }

    MemoryPolicy(int i11) {
        this.index = i11;
    }
}
