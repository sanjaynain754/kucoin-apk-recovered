package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class FakeQuantOptions extends Table {

    public static final class Vector extends BaseVector {
        public FakeQuantOptions get(int i11) {
            return get(new FakeQuantOptions(), i11);
        }

        public FakeQuantOptions get(FakeQuantOptions fakeQuantOptions, int i11) {
            return fakeQuantOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addMax(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.addFloat(1, f11, 0.0d);
    }

    public static void addMin(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.addFloat(0, f11, 0.0d);
    }

    public static void addNarrowRange(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(3, z11, false);
    }

    public static void addNumBits(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(2, i11, 0);
    }

    public static int createFakeQuantOptions(FlatBufferBuilder flatBufferBuilder, float f11, float f12, int i11, boolean z11) {
        flatBufferBuilder.startTable(4);
        addNumBits(flatBufferBuilder, i11);
        addMax(flatBufferBuilder, f12);
        addMin(flatBufferBuilder, f11);
        addNarrowRange(flatBufferBuilder, z11);
        return endFakeQuantOptions(flatBufferBuilder);
    }

    public static FakeQuantOptions getRootAsFakeQuantOptions(ByteBuffer byteBuffer) {
        return getRootAsFakeQuantOptions(byteBuffer, new FakeQuantOptions());
    }

    public static void startFakeQuantOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(4);
    }

    public float max() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public float min() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public static FakeQuantOptions getRootAsFakeQuantOptions(ByteBuffer byteBuffer, FakeQuantOptions fakeQuantOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return fakeQuantOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, FakeQuantOptionsT fakeQuantOptionsT) {
        if (fakeQuantOptionsT == null) {
            return 0;
        }
        return createFakeQuantOptions(flatBufferBuilder, fakeQuantOptionsT.getMin(), fakeQuantOptionsT.getMax(), fakeQuantOptionsT.getNumBits(), fakeQuantOptionsT.getNarrowRange());
    }

    public boolean narrowRange() {
        int i__offset = __offset(10);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public int numBits() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public FakeQuantOptionsT unpack() {
        FakeQuantOptionsT fakeQuantOptionsT = new FakeQuantOptionsT();
        unpackTo(fakeQuantOptionsT);
        return fakeQuantOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endFakeQuantOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public FakeQuantOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(FakeQuantOptionsT fakeQuantOptionsT) {
        fakeQuantOptionsT.setMin(min());
        fakeQuantOptionsT.setMax(max());
        fakeQuantOptionsT.setNumBits(numBits());
        fakeQuantOptionsT.setNarrowRange(narrowRange());
    }
}
