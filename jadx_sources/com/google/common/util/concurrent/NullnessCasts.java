package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
final class NullnessCasts {
    @ParametricNullness
    public static <T> T uncheckedNull() {
        return null;
    }

    private NullnessCasts() {
    }

    @ParametricNullness
    public static <T> T uncheckedCastNullableTToT(T t11) {
        return t11;
    }
}
