package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public final class BooleanVector extends BaseVector {
    public BooleanVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 1, byteBuffer);
        return this;
    }

    public boolean get(int i11) {
        return this.f2703bb.get(__element(i11)) != 0;
    }
}
