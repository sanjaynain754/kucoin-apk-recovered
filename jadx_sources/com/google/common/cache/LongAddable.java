package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
interface LongAddable {
    void add(long j11);

    void increment();

    long sum();
}
