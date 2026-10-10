package com.google.flatbuffers;

import java.nio.ByteBuffer;
import p852kotlin.UShort;

/* JADX INFO: loaded from: classes56.dex */
public final class ShortVector extends BaseVector {
    public ShortVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 2, byteBuffer);
        return this;
    }

    public short get(int i11) {
        return this.f12708bb.getShort(__element(i11));
    }

    public int getAsUnsigned(int i11) {
        return get(i11) & UShort.MAX_VALUE;
    }
}
