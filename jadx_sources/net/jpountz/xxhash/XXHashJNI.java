package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.Native;

/* JADX INFO: loaded from: classes61.dex */
enum XXHashJNI {
    ;

    static {
        Native.load();
        init();
    }

    public static native int XXH32(byte[] bArr, int i11, int i12, int i13);

    public static native int XXH32BB(ByteBuffer byteBuffer, int i11, int i12, int i13);

    public static native int XXH32_digest(long j11);

    public static native void XXH32_free(long j11);

    public static native long XXH32_init(int i11);

    public static native void XXH32_update(long j11, byte[] bArr, int i11, int i12);

    public static native long XXH64(byte[] bArr, int i11, int i12, long j11);

    public static native long XXH64BB(ByteBuffer byteBuffer, int i11, int i12, long j11);

    public static native long XXH64_digest(long j11);

    public static native void XXH64_free(long j11);

    public static native long XXH64_init(long j11);

    public static native void XXH64_update(long j11, byte[] bArr, int i11, int i12);

    private static native void init();
}
