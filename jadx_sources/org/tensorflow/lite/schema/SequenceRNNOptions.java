package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SequenceRNNOptions extends Table {

    public static final class Vector extends BaseVector {
        public SequenceRNNOptions get(int i11) {
            return get(new SequenceRNNOptions(), i11);
        }

        public SequenceRNNOptions get(SequenceRNNOptions sequenceRNNOptions, int i11) {
            return sequenceRNNOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAsymmetricQuantizeInputs(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(2, z11, false);
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(1, b11, 0);
    }

    public static void addTimeMajor(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(0, z11, false);
    }

    public static int createSequenceRNNOptions(FlatBufferBuilder flatBufferBuilder, boolean z11, byte b11, boolean z12) {
        flatBufferBuilder.startTable(3);
        addAsymmetricQuantizeInputs(flatBufferBuilder, z12);
        addFusedActivationFunction(flatBufferBuilder, b11);
        addTimeMajor(flatBufferBuilder, z11);
        return endSequenceRNNOptions(flatBufferBuilder);
    }

    public static SequenceRNNOptions getRootAsSequenceRNNOptions(ByteBuffer byteBuffer) {
        return getRootAsSequenceRNNOptions(byteBuffer, new SequenceRNNOptions());
    }

    public static void startSequenceRNNOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
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

    public static SequenceRNNOptions getRootAsSequenceRNNOptions(ByteBuffer byteBuffer, SequenceRNNOptions sequenceRNNOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return sequenceRNNOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SequenceRNNOptionsT sequenceRNNOptionsT) {
        if (sequenceRNNOptionsT == null) {
            return 0;
        }
        return createSequenceRNNOptions(flatBufferBuilder, sequenceRNNOptionsT.getTimeMajor(), sequenceRNNOptionsT.getFusedActivationFunction(), sequenceRNNOptionsT.getAsymmetricQuantizeInputs());
    }

    public boolean asymmetricQuantizeInputs() {
        int i__offset = __offset(8);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public SequenceRNNOptionsT unpack() {
        SequenceRNNOptionsT sequenceRNNOptionsT = new SequenceRNNOptionsT();
        unpackTo(sequenceRNNOptionsT);
        return sequenceRNNOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSequenceRNNOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SequenceRNNOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SequenceRNNOptionsT sequenceRNNOptionsT) {
        sequenceRNNOptionsT.setTimeMajor(timeMajor());
        sequenceRNNOptionsT.setFusedActivationFunction(fusedActivationFunction());
        sequenceRNNOptionsT.setAsymmetricQuantizeInputs(asymmetricQuantizeInputs());
    }
}
