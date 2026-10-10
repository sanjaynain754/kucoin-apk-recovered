package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes56.dex */
public final class BooleanVector extends BaseVector {
    public BooleanVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 1, byteBuffer);
        return this;
    }

    public boolean get(int i11) {
        return this.f12708bb.get(__element(i11)) != 0;
    }
}
