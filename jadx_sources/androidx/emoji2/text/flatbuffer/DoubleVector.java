package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public final class DoubleVector extends BaseVector {
    public DoubleVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 8, byteBuffer);
        return this;
    }

    public double get(int i11) {
        return this.f2703bb.getDouble(__element(i11));
    }
}
