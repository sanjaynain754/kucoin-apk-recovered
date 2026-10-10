package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes56.dex */
public final class FloatVector extends BaseVector {
    public FloatVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 4, byteBuffer);
        return this;
    }

    public float get(int i11) {
        return this.f12708bb.getFloat(__element(i11));
    }
}
