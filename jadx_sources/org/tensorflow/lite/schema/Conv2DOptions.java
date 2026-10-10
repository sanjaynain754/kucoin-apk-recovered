package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class Conv2DOptions extends Table {

    public static final class Vector extends BaseVector {
        public Conv2DOptions get(int i11) {
            return get(new Conv2DOptions(), i11);
        }

        public Conv2DOptions get(Conv2DOptions conv2DOptions, int i11) {
            return conv2DOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addDilationHFactor(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(5, i11, 1);
    }

    public static void addDilationWFactor(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(4, i11, 1);
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

    public static int createConv2DOptions(FlatBufferBuilder flatBufferBuilder, byte b11, int i11, int i12, byte b12, int i13, int i14) {
        flatBufferBuilder.startTable(6);
        addDilationHFactor(flatBufferBuilder, i14);
        addDilationWFactor(flatBufferBuilder, i13);
        addStrideH(flatBufferBuilder, i12);
        addStrideW(flatBufferBuilder, i11);
        addFusedActivationFunction(flatBufferBuilder, b12);
        addPadding(flatBufferBuilder, b11);
        return endConv2DOptions(flatBufferBuilder);
    }

    public static Conv2DOptions getRootAsConv2DOptions(ByteBuffer byteBuffer) {
        return getRootAsConv2DOptions(byteBuffer, new Conv2DOptions());
    }

    public static void startConv2DOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(6);
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

    public static Conv2DOptions getRootAsConv2DOptions(ByteBuffer byteBuffer, Conv2DOptions conv2DOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return conv2DOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, Conv2DOptionsT conv2DOptionsT) {
        if (conv2DOptionsT == null) {
            return 0;
        }
        return createConv2DOptions(flatBufferBuilder, conv2DOptionsT.getPadding(), conv2DOptionsT.getStrideW(), conv2DOptionsT.getStrideH(), conv2DOptionsT.getFusedActivationFunction(), conv2DOptionsT.getDilationWFactor(), conv2DOptionsT.getDilationHFactor());
    }

    public int dilationHFactor() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 1;
    }

    public int dilationWFactor() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 1;
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

    public Conv2DOptionsT unpack() {
        Conv2DOptionsT conv2DOptionsT = new Conv2DOptionsT();
        unpackTo(conv2DOptionsT);
        return conv2DOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endConv2DOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public Conv2DOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(Conv2DOptionsT conv2DOptionsT) {
        conv2DOptionsT.setPadding(padding());
        conv2DOptionsT.setStrideW(strideW());
        conv2DOptionsT.setStrideH(strideH());
        conv2DOptionsT.setFusedActivationFunction(fusedActivationFunction());
        conv2DOptionsT.setDilationWFactor(dilationWFactor());
        conv2DOptionsT.setDilationHFactor(dilationHFactor());
    }
}
