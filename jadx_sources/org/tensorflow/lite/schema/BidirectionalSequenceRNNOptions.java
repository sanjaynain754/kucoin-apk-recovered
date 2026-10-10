package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class BidirectionalSequenceRNNOptions extends Table {

    public static final class Vector extends BaseVector {
        public BidirectionalSequenceRNNOptions get(int i11) {
            return get(new BidirectionalSequenceRNNOptions(), i11);
        }

        public BidirectionalSequenceRNNOptions get(BidirectionalSequenceRNNOptions bidirectionalSequenceRNNOptions, int i11) {
            return bidirectionalSequenceRNNOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAsymmetricQuantizeInputs(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(3, z11, false);
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(1, b11, 0);
    }

    public static void addMergeOutputs(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(2, z11, false);
    }

    public static void addTimeMajor(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(0, z11, false);
    }

    public static int createBidirectionalSequenceRNNOptions(FlatBufferBuilder flatBufferBuilder, boolean z11, byte b11, boolean z12, boolean z13) {
        flatBufferBuilder.startTable(4);
        addAsymmetricQuantizeInputs(flatBufferBuilder, z13);
        addMergeOutputs(flatBufferBuilder, z12);
        addFusedActivationFunction(flatBufferBuilder, b11);
        addTimeMajor(flatBufferBuilder, z11);
        return endBidirectionalSequenceRNNOptions(flatBufferBuilder);
    }

    public static BidirectionalSequenceRNNOptions getRootAsBidirectionalSequenceRNNOptions(ByteBuffer byteBuffer) {
        return getRootAsBidirectionalSequenceRNNOptions(byteBuffer, new BidirectionalSequenceRNNOptions());
    }

    public static void startBidirectionalSequenceRNNOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(4);
    }

    public byte fusedActivationFunction() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public boolean timeMajor() {
        int i__offset = __offset(4);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public static BidirectionalSequenceRNNOptions getRootAsBidirectionalSequenceRNNOptions(ByteBuffer byteBuffer, BidirectionalSequenceRNNOptions bidirectionalSequenceRNNOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bidirectionalSequenceRNNOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, BidirectionalSequenceRNNOptionsT bidirectionalSequenceRNNOptionsT) {
        if (bidirectionalSequenceRNNOptionsT == null) {
            return 0;
        }
        return createBidirectionalSequenceRNNOptions(flatBufferBuilder, bidirectionalSequenceRNNOptionsT.getTimeMajor(), bidirectionalSequenceRNNOptionsT.getFusedActivationFunction(), bidirectionalSequenceRNNOptionsT.getMergeOutputs(), bidirectionalSequenceRNNOptionsT.getAsymmetricQuantizeInputs());
    }

    public boolean asymmetricQuantizeInputs() {
        int i__offset = __offset(10);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public boolean mergeOutputs() {
        int i__offset = __offset(8);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public BidirectionalSequenceRNNOptionsT unpack() {
        BidirectionalSequenceRNNOptionsT bidirectionalSequenceRNNOptionsT = new BidirectionalSequenceRNNOptionsT();
        unpackTo(bidirectionalSequenceRNNOptionsT);
        return bidirectionalSequenceRNNOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endBidirectionalSequenceRNNOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public BidirectionalSequenceRNNOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(BidirectionalSequenceRNNOptionsT bidirectionalSequenceRNNOptionsT) {
        bidirectionalSequenceRNNOptionsT.setTimeMajor(timeMajor());
        bidirectionalSequenceRNNOptionsT.setFusedActivationFunction(fusedActivationFunction());
        bidirectionalSequenceRNNOptionsT.setMergeOutputs(mergeOutputs());
        bidirectionalSequenceRNNOptionsT.setAsymmetricQuantizeInputs(asymmetricQuantizeInputs());
    }
}
