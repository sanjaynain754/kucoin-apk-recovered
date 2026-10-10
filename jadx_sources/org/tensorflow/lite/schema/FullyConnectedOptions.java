package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class FullyConnectedOptions extends Table {

    public static final class Vector extends BaseVector {
        public FullyConnectedOptions get(int i11) {
            return get(new FullyConnectedOptions(), i11);
        }

        public FullyConnectedOptions get(FullyConnectedOptions fullyConnectedOptions, int i11) {
            return fullyConnectedOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
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
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static void addKeepNumDims(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(2, z11, false);
    }

    public static void addWeightsFormat(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(1, b11, 0);
    }

    public static int createFullyConnectedOptions(FlatBufferBuilder flatBufferBuilder, byte b11, byte b12, boolean z11, boolean z12) {
        flatBufferBuilder.startTable(4);
        addAsymmetricQuantizeInputs(flatBufferBuilder, z12);
        addKeepNumDims(flatBufferBuilder, z11);
        addWeightsFormat(flatBufferBuilder, b12);
        addFusedActivationFunction(flatBufferBuilder, b11);
        return endFullyConnectedOptions(flatBufferBuilder);
    }

    public static FullyConnectedOptions getRootAsFullyConnectedOptions(ByteBuffer byteBuffer) {
        return getRootAsFullyConnectedOptions(byteBuffer, new FullyConnectedOptions());
    }

    public static void startFullyConnectedOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(4);
    }

    public byte fusedActivationFunction() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public byte weightsFormat() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static FullyConnectedOptions getRootAsFullyConnectedOptions(ByteBuffer byteBuffer, FullyConnectedOptions fullyConnectedOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return fullyConnectedOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, FullyConnectedOptionsT fullyConnectedOptionsT) {
        if (fullyConnectedOptionsT == null) {
            return 0;
        }
        return createFullyConnectedOptions(flatBufferBuilder, fullyConnectedOptionsT.getFusedActivationFunction(), fullyConnectedOptionsT.getWeightsFormat(), fullyConnectedOptionsT.getKeepNumDims(), fullyConnectedOptionsT.getAsymmetricQuantizeInputs());
    }

    public boolean asymmetricQuantizeInputs() {
        int i__offset = __offset(10);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public boolean keepNumDims() {
        int i__offset = __offset(8);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public FullyConnectedOptionsT unpack() {
        FullyConnectedOptionsT fullyConnectedOptionsT = new FullyConnectedOptionsT();
        unpackTo(fullyConnectedOptionsT);
        return fullyConnectedOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endFullyConnectedOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public FullyConnectedOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(FullyConnectedOptionsT fullyConnectedOptionsT) {
        fullyConnectedOptionsT.setFusedActivationFunction(fusedActivationFunction());
        fullyConnectedOptionsT.setWeightsFormat(weightsFormat());
        fullyConnectedOptionsT.setKeepNumDims(keepNumDims());
        fullyConnectedOptionsT.setAsymmetricQuantizeInputs(asymmetricQuantizeInputs());
    }
}
