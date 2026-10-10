package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.time.Duration;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class Internal {
    private Internal() {
    }

    @IgnoreJRERequirement
    public static long toNanosSaturated(Duration duration) {
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            if (duration.isNegative()) {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
    }
}
