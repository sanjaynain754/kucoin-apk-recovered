package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ReverseSequenceOptions extends Table {

    public static final class Vector extends BaseVector {
        public ReverseSequenceOptions get(int i11) {
            return get(new ReverseSequenceOptions(), i11);
        }

        public ReverseSequenceOptions get(ReverseSequenceOptions reverseSequenceOptions, int i11) {
            return reverseSequenceOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addBatchDim(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(1, i11, 0);
    }

    public static void addSeqDim(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createReverseSequenceOptions(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addBatchDim(flatBufferBuilder, i12);
        addSeqDim(flatBufferBuilder, i11);
        return endReverseSequenceOptions(flatBufferBuilder);
    }

    public static ReverseSequenceOptions getRootAsReverseSequenceOptions(ByteBuffer byteBuffer) {
        return getRootAsReverseSequenceOptions(byteBuffer, new ReverseSequenceOptions());
    }

    public static void startReverseSequenceOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public int batchDim() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int seqDim() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static ReverseSequenceOptions getRootAsReverseSequenceOptions(ByteBuffer byteBuffer, ReverseSequenceOptions reverseSequenceOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return reverseSequenceOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ReverseSequenceOptionsT reverseSequenceOptionsT) {
        if (reverseSequenceOptionsT == null) {
            return 0;
        }
        return createReverseSequenceOptions(flatBufferBuilder, reverseSequenceOptionsT.getSeqDim(), reverseSequenceOptionsT.getBatchDim());
    }

    public ReverseSequenceOptionsT unpack() {
        ReverseSequenceOptionsT reverseSequenceOptionsT = new ReverseSequenceOptionsT();
        unpackTo(reverseSequenceOptionsT);
        return reverseSequenceOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endReverseSequenceOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ReverseSequenceOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ReverseSequenceOptionsT reverseSequenceOptionsT) {
        reverseSequenceOptionsT.setSeqDim(seqDim());
        reverseSequenceOptionsT.setBatchDim(batchDim());
    }
}
