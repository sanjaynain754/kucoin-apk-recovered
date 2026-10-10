package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public final class FloatVector extends BaseVector {
    public FloatVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 4, byteBuffer);
        return this;
    }

    public float get(int i11) {
        return this.f2703bb.getFloat(__element(i11));
    }
}
