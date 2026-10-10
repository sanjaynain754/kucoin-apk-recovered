package com.google.flatbuffers;

import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes56.dex */
public final class IntVector extends BaseVector {
    public IntVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 4, byteBuffer);
        return this;
    }

    public int get(int i11) {
        return this.f12708bb.getInt(__element(i11));
    }

    public long getAsUnsigned(int i11) {
        return ((long) get(i11)) & KeyboardMap.kValueMask;
    }
}
