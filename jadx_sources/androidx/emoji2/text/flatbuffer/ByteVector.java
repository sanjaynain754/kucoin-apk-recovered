package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public final class ByteVector extends BaseVector {
    public ByteVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 1, byteBuffer);
        return this;
    }

    public byte get(int i11) {
        return this.f2703bb.get(__element(i11));
    }

    public int getAsUnsigned(int i11) {
        return get(i11) & 255;
    }
}
