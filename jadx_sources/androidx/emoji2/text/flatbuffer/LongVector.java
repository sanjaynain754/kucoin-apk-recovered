package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public final class LongVector extends BaseVector {
    public LongVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 8, byteBuffer);
        return this;
    }

    public long get(int i11) {
        return this.f2703bb.getLong(__element(i11));
    }
}
