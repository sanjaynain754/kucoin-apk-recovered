package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes56.dex */
public final class DoubleVector extends BaseVector {
    public DoubleVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 8, byteBuffer);
        return this;
    }

    public double get(int i11) {
        return this.f12708bb.getDouble(__element(i11));
    }
}
