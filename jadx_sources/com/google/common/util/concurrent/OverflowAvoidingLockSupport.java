package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
final class OverflowAvoidingLockSupport {
    static final long MAX_NANOSECONDS_THRESHOLD = 2147483647999999999L;

    private OverflowAvoidingLockSupport() {
    }

    public static void parkNanos(Object obj, long j11) {
        LockSupport.parkNanos(obj, Math.min(j11, MAX_NANOSECONDS_THRESHOLD));
    }
}
