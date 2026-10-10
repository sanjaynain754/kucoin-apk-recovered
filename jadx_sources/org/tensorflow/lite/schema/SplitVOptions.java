package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SplitVOptions extends Table {

    public static final class Vector extends BaseVector {
        public SplitVOptions get(int i11) {
            return get(new SplitVOptions(), i11);
        }

        public SplitVOptions get(SplitVOptions splitVOptions, int i11) {
            return splitVOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addNumSplits(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createSplitVOptions(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addNumSplits(flatBufferBuilder, i11);
        return endSplitVOptions(flatBufferBuilder);
    }

    public static SplitVOptions getRootAsSplitVOptions(ByteBuffer byteBuffer) {
        return getRootAsSplitVOptions(byteBuffer, new SplitVOptions());
    }

    public static void startSplitVOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public int numSplits() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static SplitVOptions getRootAsSplitVOptions(ByteBuffer byteBuffer, SplitVOptions splitVOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return splitVOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SplitVOptionsT splitVOptionsT) {
        if (splitVOptionsT == null) {
            return 0;
        }
        return createSplitVOptions(flatBufferBuilder, splitVOptionsT.getNumSplits());
    }

    public SplitVOptionsT unpack() {
        SplitVOptionsT splitVOptionsT = new SplitVOptionsT();
        unpackTo(splitVOptionsT);
        return splitVOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSplitVOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SplitVOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SplitVOptionsT splitVOptionsT) {
        splitVOptionsT.setNumSplits(numSplits());
    }
}
