package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public final class StringVector extends BaseVector {
    private Utf8 utf8 = Utf8.getDefault();

    public StringVector __assign(int i11, int i12, ByteBuffer byteBuffer) {
        __reset(i11, i12, byteBuffer);
        return this;
    }

    public String get(int i11) {
        return Table.__string(__element(i11), this.f2703bb, this.utf8);
    }
}
