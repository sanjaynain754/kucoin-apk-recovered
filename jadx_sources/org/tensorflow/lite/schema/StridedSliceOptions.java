package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class StridedSliceOptions extends Table {

    public static final class Vector extends BaseVector {
        public StridedSliceOptions get(int i11) {
            return get(new StridedSliceOptions(), i11);
        }

        public StridedSliceOptions get(StridedSliceOptions stridedSliceOptions, int i11) {
            return stridedSliceOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addBeginMask(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static void addEllipsisMask(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(2, i11, 0);
    }

    public static void addEndMask(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(1, i11, 0);
    }

    public static void addNewAxisMask(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(3, i11, 0);
    }

    public static void addOffset(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(5, z11, false);
    }

    public static void addShrinkAxisMask(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(4, i11, 0);
    }

    public static int createStridedSliceOptions(FlatBufferBuilder flatBufferBuilder, int i11, int i12, int i13, int i14, int i15, boolean z11) {
        flatBufferBuilder.startTable(6);
        addShrinkAxisMask(flatBufferBuilder, i15);
        addNewAxisMask(flatBufferBuilder, i14);
        addEllipsisMask(flatBufferBuilder, i13);
        addEndMask(flatBufferBuilder, i12);
        addBeginMask(flatBufferBuilder, i11);
        addOffset(flatBufferBuilder, z11);
        return endStridedSliceOptions(flatBufferBuilder);
    }

    public static StridedSliceOptions getRootAsStridedSliceOptions(ByteBuffer byteBuffer) {
        return getRootAsStridedSliceOptions(byteBuffer, new StridedSliceOptions());
    }

    public static void startStridedSliceOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(6);
    }

    public int beginMask() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int endMask() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static StridedSliceOptions getRootAsStridedSliceOptions(ByteBuffer byteBuffer, StridedSliceOptions stridedSliceOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return stridedSliceOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, StridedSliceOptionsT stridedSliceOptionsT) {
        if (stridedSliceOptionsT == null) {
            return 0;
        }
        return createStridedSliceOptions(flatBufferBuilder, stridedSliceOptionsT.getBeginMask(), stridedSliceOptionsT.getEndMask(), stridedSliceOptionsT.getEllipsisMask(), stridedSliceOptionsT.getNewAxisMask(), stridedSliceOptionsT.getShrinkAxisMask(), stridedSliceOptionsT.getOffset());
    }

    public int ellipsisMask() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int newAxisMask() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public boolean offset() {
        int i__offset = __offset(14);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public int shrinkAxisMask() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public StridedSliceOptionsT unpack() {
        StridedSliceOptionsT stridedSliceOptionsT = new StridedSliceOptionsT();
        unpackTo(stridedSliceOptionsT);
        return stridedSliceOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endStridedSliceOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public StridedSliceOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(StridedSliceOptionsT stridedSliceOptionsT) {
        stridedSliceOptionsT.setBeginMask(beginMask());
        stridedSliceOptionsT.setEndMask(endMask());
        stridedSliceOptionsT.setEllipsisMask(ellipsisMask());
        stridedSliceOptionsT.setNewAxisMask(newAxisMask());
        stridedSliceOptionsT.setShrinkAxisMask(shrinkAxisMask());
        stridedSliceOptionsT.setOffset(offset());
    }
}
