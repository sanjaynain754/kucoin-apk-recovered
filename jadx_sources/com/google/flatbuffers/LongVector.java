package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes56.dex */
public final class LongVector extends BaseVector {
    public LongVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 8, byteBuffer);
        return this;
    }

    public long get(int i11) {
        return this.f12708bb.getLong(__element(i11));
    }
}
