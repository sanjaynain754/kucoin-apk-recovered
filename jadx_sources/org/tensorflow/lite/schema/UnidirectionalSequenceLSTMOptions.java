package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class UnidirectionalSequenceLSTMOptions extends Table {

    public static final class Vector extends BaseVector {
        public UnidirectionalSequenceLSTMOptions get(int i11) {
            return get(new UnidirectionalSequenceLSTMOptions(), i11);
        }

        public UnidirectionalSequenceLSTMOptions get(UnidirectionalSequenceLSTMOptions unidirectionalSequenceLSTMOptions, int i11) {
            return unidirectionalSequenceLSTMOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
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

    public static void addDiagonalRecurrentTensors(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(5, z11, false);
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static void addProjClip(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.addFloat(2, f11, 0.0d);
    }

    public static void addTimeMajor(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(3, z11, false);
    }

    public static int createUnidirectionalSequenceLSTMOptions(FlatBufferBuilder flatBufferBuilder, byte b11, float f11, float f12, boolean z11, boolean z12, boolean z13) {
        flatBufferBuilder.startTable(6);
        addProjClip(flatBufferBuilder, f12);
        addCellClip(flatBufferBuilder, f11);
        addDiagonalRecurrentTensors(flatBufferBuilder, z13);
        addAsymmetricQuantizeInputs(flatBufferBuilder, z12);
        addTimeMajor(flatBufferBuilder, z11);
        addFusedActivationFunction(flatBufferBuilder, b11);
        return endUnidirectionalSequenceLSTMOptions(flatBufferBuilder);
    }

    public static UnidirectionalSequenceLSTMOptions getRootAsUnidirectionalSequenceLSTMOptions(ByteBuffer byteBuffer) {
        return getRootAsUnidirectionalSequenceLSTMOptions(byteBuffer, new UnidirectionalSequenceLSTMOptions());
    }

    public static void startUnidirectionalSequenceLSTMOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(6);
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

    public static UnidirectionalSequenceLSTMOptions getRootAsUnidirectionalSequenceLSTMOptions(ByteBuffer byteBuffer, UnidirectionalSequenceLSTMOptions unidirectionalSequenceLSTMOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return unidirectionalSequenceLSTMOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, UnidirectionalSequenceLSTMOptionsT unidirectionalSequenceLSTMOptionsT) {
        if (unidirectionalSequenceLSTMOptionsT == null) {
            return 0;
        }
        return createUnidirectionalSequenceLSTMOptions(flatBufferBuilder, unidirectionalSequenceLSTMOptionsT.getFusedActivationFunction(), unidirectionalSequenceLSTMOptionsT.getCellClip(), unidirectionalSequenceLSTMOptionsT.getProjClip(), unidirectionalSequenceLSTMOptionsT.getTimeMajor(), unidirectionalSequenceLSTMOptionsT.getAsymmetricQuantizeInputs(), unidirectionalSequenceLSTMOptionsT.getDiagonalRecurrentTensors());
    }

    public boolean asymmetricQuantizeInputs() {
        int i__offset = __offset(12);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public boolean diagonalRecurrentTensors() {
        int i__offset = __offset(14);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public float projClip() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public boolean timeMajor() {
        int i__offset = __offset(10);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public UnidirectionalSequenceLSTMOptionsT unpack() {
        UnidirectionalSequenceLSTMOptionsT unidirectionalSequenceLSTMOptionsT = new UnidirectionalSequenceLSTMOptionsT();
        unpackTo(unidirectionalSequenceLSTMOptionsT);
        return unidirectionalSequenceLSTMOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endUnidirectionalSequenceLSTMOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public UnidirectionalSequenceLSTMOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(UnidirectionalSequenceLSTMOptionsT unidirectionalSequenceLSTMOptionsT) {
        unidirectionalSequenceLSTMOptionsT.setFusedActivationFunction(fusedActivationFunction());
        unidirectionalSequenceLSTMOptionsT.setCellClip(cellClip());
        unidirectionalSequenceLSTMOptionsT.setProjClip(projClip());
        unidirectionalSequenceLSTMOptionsT.setTimeMajor(timeMajor());
        unidirectionalSequenceLSTMOptionsT.setAsymmetricQuantizeInputs(asymmetricQuantizeInputs());
        unidirectionalSequenceLSTMOptionsT.setDiagonalRecurrentTensors(diagonalRecurrentTensors());
    }
}
