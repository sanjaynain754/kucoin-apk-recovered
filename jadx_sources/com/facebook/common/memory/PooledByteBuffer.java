package com.facebook.common.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public interface PooledByteBuffer extends Closeable {

    public static class ClosedException extends RuntimeException {
        public ClosedException() {
            super("Invalid bytebuf. Already closed");
        }
    }

    /* JADX INFO: renamed from: c */
    long mo731c();

    /* JADX INFO: renamed from: d */
    int mo732d(int i11, byte[] bArr, int i12, int i13);

    /* JADX INFO: renamed from: e */
    byte mo733e(int i11);

    ByteBuffer getByteBuffer();

    boolean isClosed();

    int size();
}
