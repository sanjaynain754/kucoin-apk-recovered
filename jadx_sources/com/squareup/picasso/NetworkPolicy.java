package com.squareup.picasso;

/* JADX INFO: loaded from: classes59.dex */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    final int index;

    public static boolean isOfflineOnly(int i11) {
        return (i11 & OFFLINE.index) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i11) {
        return (i11 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i11) {
        return (i11 & NO_STORE.index) == 0;
    }

    NetworkPolicy(int i11) {
        this.index = i11;
    }
}
