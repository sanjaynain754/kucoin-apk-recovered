package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class Conv3DOptions extends Table {

    public static final class Vector extends BaseVector {
        public Conv3DOptions get(int i11) {
            return get(new Conv3DOptions(), i11);
        }

        public Conv3DOptions get(Conv3DOptions conv3DOptions, int i11) {
            return conv3DOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addDilationDFactor(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(5, i11, 1);
    }

    public static void addDilationHFactor(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(7, i11, 1);
    }

    public static void addDilationWFactor(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(6, i11, 1);
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(4, b11, 0);
    }

    public static void addPadding(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static void addStrideD(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(1, i11, 0);
    }

    public static void addStrideH(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(3, i11, 0);
    }

    public static void addStrideW(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(2, i11, 0);
    }

    public static Conv3DOptions getRootAsConv3DOptions(ByteBuffer byteBuffer) {
        return getRootAsConv3DOptions(byteBuffer, new Conv3DOptions());
    }

    public byte padding() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public int strideD() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static int createConv3DOptions(FlatBufferBuilder flatBufferBuilder, byte b11, int i11, int i12, int i13, byte b12, int i14, int i15, int i16) {
        flatBufferBuilder.startTable(8);
        addDilationHFactor(flatBufferBuilder, i16);
        addDilationWFactor(flatBufferBuilder, i15);
        addDilationDFactor(flatBufferBuilder, i14);
        addStrideH(flatBufferBuilder, i13);
        addStrideW(flatBufferBuilder, i12);
        addStrideD(flatBufferBuilder, i11);
        addFusedActivationFunction(flatBufferBuilder, b12);
        addPadding(flatBufferBuilder, b11);
        return endConv3DOptions(flatBufferBuilder);
    }

    public static Conv3DOptions getRootAsConv3DOptions(ByteBuffer byteBuffer, Conv3DOptions conv3DOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return conv3DOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, Conv3DOptionsT conv3DOptionsT) {
        if (conv3DOptionsT == null) {
            return 0;
        }
        return createConv3DOptions(flatBufferBuilder, conv3DOptionsT.getPadding(), conv3DOptionsT.getStrideD(), conv3DOptionsT.getStrideW(), conv3DOptionsT.getStrideH(), conv3DOptionsT.getFusedActivationFunction(), conv3DOptionsT.getDilationDFactor(), conv3DOptionsT.getDilationWFactor(), conv3DOptionsT.getDilationHFactor());
    }

    public static void startConv3DOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(8);
    }

    public int dilationDFactor() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 1;
    }

    public int dilationHFactor() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 1;
    }

    public int dilationWFactor() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 1;
    }

    public byte fusedActivationFunction() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public int strideH() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int strideW() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public Conv3DOptionsT unpack() {
        Conv3DOptionsT conv3DOptionsT = new Conv3DOptionsT();
        unpackTo(conv3DOptionsT);
        return conv3DOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endConv3DOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public Conv3DOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(Conv3DOptionsT conv3DOptionsT) {
        conv3DOptionsT.setPadding(padding());
        conv3DOptionsT.setStrideD(strideD());
        conv3DOptionsT.setStrideW(strideW());
        conv3DOptionsT.setStrideH(strideH());
        conv3DOptionsT.setFusedActivationFunction(fusedActivationFunction());
        conv3DOptionsT.setDilationDFactor(dilationDFactor());
        conv3DOptionsT.setDilationWFactor(dilationWFactor());
        conv3DOptionsT.setDilationHFactor(dilationHFactor());
    }
}
