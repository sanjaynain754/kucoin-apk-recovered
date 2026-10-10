package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class RNNOptions extends Table {

    public static final class Vector extends BaseVector {
        public RNNOptions get(int i11) {
            return get(new RNNOptions(), i11);
        }

        public RNNOptions get(RNNOptions rNNOptions, int i11) {
            return rNNOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAsymmetricQuantizeInputs(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(1, z11, false);
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static int createRNNOptions(FlatBufferBuilder flatBufferBuilder, byte b11, boolean z11) {
        flatBufferBuilder.startTable(2);
        addAsymmetricQuantizeInputs(flatBufferBuilder, z11);
        addFusedActivationFunction(flatBufferBuilder, b11);
        return endRNNOptions(flatBufferBuilder);
    }

    public static RNNOptions getRootAsRNNOptions(ByteBuffer byteBuffer) {
        return getRootAsRNNOptions(byteBuffer, new RNNOptions());
    }

    public static void startRNNOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public boolean asymmetricQuantizeInputs() {
        int i__offset = __offset(6);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public byte fusedActivationFunction() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static RNNOptions getRootAsRNNOptions(ByteBuffer byteBuffer, RNNOptions rNNOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return rNNOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, RNNOptionsT rNNOptionsT) {
        if (rNNOptionsT == null) {
            return 0;
        }
        return createRNNOptions(flatBufferBuilder, rNNOptionsT.getFusedActivationFunction(), rNNOptionsT.getAsymmetricQuantizeInputs());
    }

    public RNNOptionsT unpack() {
        RNNOptionsT rNNOptionsT = new RNNOptionsT();
        unpackTo(rNNOptionsT);
        return rNNOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endRNNOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public RNNOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(RNNOptionsT rNNOptionsT) {
        rNNOptionsT.setFusedActivationFunction(fusedActivationFunction());
        rNNOptionsT.setAsymmetricQuantizeInputs(asymmetricQuantizeInputs());
    }
}
