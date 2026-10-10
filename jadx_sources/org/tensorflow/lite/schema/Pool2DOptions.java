package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class Pool2DOptions extends Table {

    public static final class Vector extends BaseVector {
        public Pool2DOptions get(int i11) {
            return get(new Pool2DOptions(), i11);
        }

        public Pool2DOptions get(Pool2DOptions pool2DOptions, int i11) {
            return pool2DOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addFilterHeight(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(4, i11, 0);
    }

    public static void addFilterWidth(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(3, i11, 0);
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(5, b11, 0);
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

    public static int createPool2DOptions(FlatBufferBuilder flatBufferBuilder, byte b11, int i11, int i12, int i13, int i14, byte b12) {
        flatBufferBuilder.startTable(6);
        addFilterHeight(flatBufferBuilder, i14);
        addFilterWidth(flatBufferBuilder, i13);
        addStrideH(flatBufferBuilder, i12);
        addStrideW(flatBufferBuilder, i11);
        addFusedActivationFunction(flatBufferBuilder, b12);
        addPadding(flatBufferBuilder, b11);
        return endPool2DOptions(flatBufferBuilder);
    }

    public static Pool2DOptions getRootAsPool2DOptions(ByteBuffer byteBuffer) {
        return getRootAsPool2DOptions(byteBuffer, new Pool2DOptions());
    }

    public static void startPool2DOptions(FlatBufferBuilder flatBufferBuilder) {
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

    public static Pool2DOptions getRootAsPool2DOptions(ByteBuffer byteBuffer, Pool2DOptions pool2DOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return pool2DOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, Pool2DOptionsT pool2DOptionsT) {
        if (pool2DOptionsT == null) {
            return 0;
        }
        return createPool2DOptions(flatBufferBuilder, pool2DOptionsT.getPadding(), pool2DOptionsT.getStrideW(), pool2DOptionsT.getStrideH(), pool2DOptionsT.getFilterWidth(), pool2DOptionsT.getFilterHeight(), pool2DOptionsT.getFusedActivationFunction());
    }

    public int filterHeight() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int filterWidth() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public byte fusedActivationFunction() {
        int i__offset = __offset(14);
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

    public Pool2DOptionsT unpack() {
        Pool2DOptionsT pool2DOptionsT = new Pool2DOptionsT();
        unpackTo(pool2DOptionsT);
        return pool2DOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endPool2DOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public Pool2DOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(Pool2DOptionsT pool2DOptionsT) {
        pool2DOptionsT.setPadding(padding());
        pool2DOptionsT.setStrideW(strideW());
        pool2DOptionsT.setStrideH(strideH());
        pool2DOptionsT.setFilterWidth(filterWidth());
        pool2DOptionsT.setFilterHeight(filterHeight());
        pool2DOptionsT.setFusedActivationFunction(fusedActivationFunction());
    }
}
