package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface Function<F, T> {
    @ParametricNullness
    T apply(@ParametricNullness F f11);

    boolean equals(Object obj);
}
