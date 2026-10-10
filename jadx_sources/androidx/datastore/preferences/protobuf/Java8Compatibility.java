package androidx.datastore.preferences.protobuf;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes34.dex */
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
