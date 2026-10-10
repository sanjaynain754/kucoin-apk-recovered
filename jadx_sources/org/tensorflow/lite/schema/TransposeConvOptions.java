package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class TransposeConvOptions extends Table {

    public static final class Vector extends BaseVector {
        public TransposeConvOptions get(int i11) {
            return get(new TransposeConvOptions(), i11);
        }

        public TransposeConvOptions get(TransposeConvOptions transposeConvOptions, int i11) {
            return transposeConvOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(3, b11, 0);
    }

    public static void addPadding(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static void addStrideH(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(2, i11, 0);
    }

    public static void addStrideW(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(1, i11, 0);
    }

    public static int createTransposeConvOptions(FlatBufferBuilder flatBufferBuilder, byte b11, int i11, int i12, byte b12) {
        flatBufferBuilder.startTable(4);
        addStrideH(flatBufferBuilder, i12);
        addStrideW(flatBufferBuilder, i11);
        addFusedActivationFunction(flatBufferBuilder, b12);
        addPadding(flatBufferBuilder, b11);
        return endTransposeConvOptions(flatBufferBuilder);
    }

    public static TransposeConvOptions getRootAsTransposeConvOptions(ByteBuffer byteBuffer) {
        return getRootAsTransposeConvOptions(byteBuffer, new TransposeConvOptions());
    }

    public static void startTransposeConvOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(4);
    }

    public byte padding() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public int strideW() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static TransposeConvOptions getRootAsTransposeConvOptions(ByteBuffer byteBuffer, TransposeConvOptions transposeConvOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return transposeConvOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, TransposeConvOptionsT transposeConvOptionsT) {
        if (transposeConvOptionsT == null) {
            return 0;
        }
        return createTransposeConvOptions(flatBufferBuilder, transposeConvOptionsT.getPadding(), transposeConvOptionsT.getStrideW(), transposeConvOptionsT.getStrideH(), transposeConvOptionsT.getFusedActivationFunction());
    }

    public byte fusedActivationFunction() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public int strideH() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public TransposeConvOptionsT unpack() {
        TransposeConvOptionsT transposeConvOptionsT = new TransposeConvOptionsT();
        unpackTo(transposeConvOptionsT);
        return transposeConvOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endTransposeConvOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public TransposeConvOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(TransposeConvOptionsT transposeConvOptionsT) {
        transposeConvOptionsT.setPadding(padding());
        transposeConvOptionsT.setStrideW(strideW());
        transposeConvOptionsT.setStrideH(strideH());
        transposeConvOptionsT.setFusedActivationFunction(fusedActivationFunction());
    }
}
