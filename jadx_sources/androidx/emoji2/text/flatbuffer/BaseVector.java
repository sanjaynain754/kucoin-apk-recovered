package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class BaseVector {

    /* JADX INFO: renamed from: bb */
    protected ByteBuffer f2703bb;
    private int element_size;
    private int length;
    private int vector;

    public void reset() {
        __reset(0, 0, null);
    }

    public int __element(int i11) {
        return this.vector + (i11 * this.element_size);
    }

    public void __reset(int i11, int i12, ByteBuffer byteBuffer) {
        this.f2703bb = byteBuffer;
        if (byteBuffer != null) {
            this.vector = i11;
            this.length = byteBuffer.getInt(i11 - 4);
            this.element_size = i12;
        } else {
            this.vector = 0;
            this.length = 0;
            this.element_size = 0;
        }
    }

    public int __vector() {
        return this.vector;
    }

    public int length() {
        return this.length;
    }
}
