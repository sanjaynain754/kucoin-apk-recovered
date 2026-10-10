package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class Struct {

    /* JADX INFO: renamed from: bb */
    protected ByteBuffer f2708bb;
    protected int bb_pos;

    public void __reset(int i11, ByteBuffer byteBuffer) {
        this.f2708bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i11;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}
