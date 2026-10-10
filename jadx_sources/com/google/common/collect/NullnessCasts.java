package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class NullnessCasts {
    @ParametricNullness
    public static <T> T unsafeNull() {
        return null;
    }

    private NullnessCasts() {
    }

    @ParametricNullness
    public static <T> T uncheckedCastNullableTToT(T t11) {
        return t11;
    }
}
