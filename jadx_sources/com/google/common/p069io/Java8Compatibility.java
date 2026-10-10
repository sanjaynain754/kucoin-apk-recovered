package com.google.common.p069io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
final class Java8Compatibility {
    private Java8Compatibility() {
    }

    public static void clear(Buffer buffer) {
        buffer.clear();
    }

    public static void flip(Buffer buffer) {
        buffer.flip();
    }

    public static void limit(Buffer buffer, int i11) {
        buffer.limit(i11);
    }

    public static void mark(Buffer buffer) {
        buffer.mark();
    }

    public static void position(Buffer buffer, int i11) {
        buffer.position(i11);
    }

    public static void reset(Buffer buffer) {
        buffer.reset();
    }
}
