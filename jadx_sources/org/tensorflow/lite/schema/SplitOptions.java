package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SplitOptions extends Table {

    public static final class Vector extends BaseVector {
        public SplitOptions get(int i11) {
            return get(new SplitOptions(), i11);
        }

        public SplitOptions get(SplitOptions splitOptions, int i11) {
            return splitOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addNumSplits(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createSplitOptions(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addNumSplits(flatBufferBuilder, i11);
        return endSplitOptions(flatBufferBuilder);
    }

    public static SplitOptions getRootAsSplitOptions(ByteBuffer byteBuffer) {
        return getRootAsSplitOptions(byteBuffer, new SplitOptions());
    }

    public static void startSplitOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public int numSplits() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static SplitOptions getRootAsSplitOptions(ByteBuffer byteBuffer, SplitOptions splitOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return splitOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SplitOptionsT splitOptionsT) {
        if (splitOptionsT == null) {
            return 0;
        }
        return createSplitOptions(flatBufferBuilder, splitOptionsT.getNumSplits());
    }

    public SplitOptionsT unpack() {
        SplitOptionsT splitOptionsT = new SplitOptionsT();
        unpackTo(splitOptionsT);
        return splitOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSplitOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SplitOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SplitOptionsT splitOptionsT) {
        splitOptionsT.setNumSplits(numSplits());
    }
}
