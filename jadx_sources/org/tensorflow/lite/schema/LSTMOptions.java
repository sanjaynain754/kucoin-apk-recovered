package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class LSTMOptions extends Table {

    public static final class Vector extends BaseVector {
        public LSTMOptions get(int i11) {
            return get(new LSTMOptions(), i11);
        }

        public LSTMOptions get(LSTMOptions lSTMOptions, int i11) {
            return lSTMOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAsymmetricQuantizeInputs(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(4, z11, false);
    }

    public static void addCellClip(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.addFloat(1, f11, 0.0d);
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static void addKernelType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(3, b11, 0);
    }

    public static void addProjClip(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.addFloat(2, f11, 0.0d);
    }

    public static int createLSTMOptions(FlatBufferBuilder flatBufferBuilder, byte b11, float f11, float f12, byte b12, boolean z11) {
        flatBufferBuilder.startTable(5);
        addProjClip(flatBufferBuilder, f12);
        addCellClip(flatBufferBuilder, f11);
        addAsymmetricQuantizeInputs(flatBufferBuilder, z11);
        addKernelType(flatBufferBuilder, b12);
        addFusedActivationFunction(flatBufferBuilder, b11);
        return endLSTMOptions(flatBufferBuilder);
    }

    public static LSTMOptions getRootAsLSTMOptions(ByteBuffer byteBuffer) {
        return getRootAsLSTMOptions(byteBuffer, new LSTMOptions());
    }

    public static void startLSTMOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(5);
    }

    public float cellClip() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public byte fusedActivationFunction() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static LSTMOptions getRootAsLSTMOptions(ByteBuffer byteBuffer, LSTMOptions lSTMOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return lSTMOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, LSTMOptionsT lSTMOptionsT) {
        if (lSTMOptionsT == null) {
            return 0;
        }
        return createLSTMOptions(flatBufferBuilder, lSTMOptionsT.getFusedActivationFunction(), lSTMOptionsT.getCellClip(), lSTMOptionsT.getProjClip(), lSTMOptionsT.getKernelType(), lSTMOptionsT.getAsymmetricQuantizeInputs());
    }

    public boolean asymmetricQuantizeInputs() {
        int i__offset = __offset(12);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public byte kernelType() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public float projClip() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public LSTMOptionsT unpack() {
        LSTMOptionsT lSTMOptionsT = new LSTMOptionsT();
        unpackTo(lSTMOptionsT);
        return lSTMOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endLSTMOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public LSTMOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(LSTMOptionsT lSTMOptionsT) {
        lSTMOptionsT.setFusedActivationFunction(fusedActivationFunction());
        lSTMOptionsT.setCellClip(cellClip());
        lSTMOptionsT.setProjClip(projClip());
        lSTMOptionsT.setKernelType(kernelType());
        lSTMOptionsT.setAsymmetricQuantizeInputs(asymmetricQuantizeInputs());
    }
}
