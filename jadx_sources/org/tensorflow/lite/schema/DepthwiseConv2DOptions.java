package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class DepthwiseConv2DOptions extends Table {

    public static final class Vector extends BaseVector {
        public DepthwiseConv2DOptions get(int i11) {
            return get(new DepthwiseConv2DOptions(), i11);
        }

        public DepthwiseConv2DOptions get(DepthwiseConv2DOptions depthwiseConv2DOptions, int i11) {
            return depthwiseConv2DOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addDepthMultiplier(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(3, i11, 0);
    }

    public static void addDilationHFactor(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(6, i11, 1);
    }

    public static void addDilationWFactor(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(5, i11, 1);
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(4, b11, 0);
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

    public static int createDepthwiseConv2DOptions(FlatBufferBuilder flatBufferBuilder, byte b11, int i11, int i12, int i13, byte b12, int i14, int i15) {
        flatBufferBuilder.startTable(7);
        addDilationHFactor(flatBufferBuilder, i15);
        addDilationWFactor(flatBufferBuilder, i14);
        addDepthMultiplier(flatBufferBuilder, i13);
        addStrideH(flatBufferBuilder, i12);
        addStrideW(flatBufferBuilder, i11);
        addFusedActivationFunction(flatBufferBuilder, b12);
        addPadding(flatBufferBuilder, b11);
        return endDepthwiseConv2DOptions(flatBufferBuilder);
    }

    public static DepthwiseConv2DOptions getRootAsDepthwiseConv2DOptions(ByteBuffer byteBuffer) {
        return getRootAsDepthwiseConv2DOptions(byteBuffer, new DepthwiseConv2DOptions());
    }

    public static void startDepthwiseConv2DOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(7);
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

    public static DepthwiseConv2DOptions getRootAsDepthwiseConv2DOptions(ByteBuffer byteBuffer, DepthwiseConv2DOptions depthwiseConv2DOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return depthwiseConv2DOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, DepthwiseConv2DOptionsT depthwiseConv2DOptionsT) {
        if (depthwiseConv2DOptionsT == null) {
            return 0;
        }
        return createDepthwiseConv2DOptions(flatBufferBuilder, depthwiseConv2DOptionsT.getPadding(), depthwiseConv2DOptionsT.getStrideW(), depthwiseConv2DOptionsT.getStrideH(), depthwiseConv2DOptionsT.getDepthMultiplier(), depthwiseConv2DOptionsT.getFusedActivationFunction(), depthwiseConv2DOptionsT.getDilationWFactor(), depthwiseConv2DOptionsT.getDilationHFactor());
    }

    public int depthMultiplier() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int dilationHFactor() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 1;
    }

    public int dilationWFactor() {
        int i__offset = __offset(14);
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
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public DepthwiseConv2DOptionsT unpack() {
        DepthwiseConv2DOptionsT depthwiseConv2DOptionsT = new DepthwiseConv2DOptionsT();
        unpackTo(depthwiseConv2DOptionsT);
        return depthwiseConv2DOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endDepthwiseConv2DOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public DepthwiseConv2DOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(DepthwiseConv2DOptionsT depthwiseConv2DOptionsT) {
        depthwiseConv2DOptionsT.setPadding(padding());
        depthwiseConv2DOptionsT.setStrideW(strideW());
        depthwiseConv2DOptionsT.setStrideH(strideH());
        depthwiseConv2DOptionsT.setDepthMultiplier(depthMultiplier());
        depthwiseConv2DOptionsT.setFusedActivationFunction(fusedActivationFunction());
        depthwiseConv2DOptionsT.setDilationWFactor(dilationWFactor());
        depthwiseConv2DOptionsT.setDilationHFactor(dilationHFactor());
    }
}
