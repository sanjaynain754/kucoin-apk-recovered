package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ShapeOptions extends Table {

    public static final class Vector extends BaseVector {
        public ShapeOptions get(int i11) {
            return get(new ShapeOptions(), i11);
        }

        public ShapeOptions get(ShapeOptions shapeOptions, int i11) {
            return shapeOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addOutType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static int createShapeOptions(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.startTable(1);
        addOutType(flatBufferBuilder, b11);
        return endShapeOptions(flatBufferBuilder);
    }

    public static ShapeOptions getRootAsShapeOptions(ByteBuffer byteBuffer) {
        return getRootAsShapeOptions(byteBuffer, new ShapeOptions());
    }

    public static void startShapeOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public byte outType() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static ShapeOptions getRootAsShapeOptions(ByteBuffer byteBuffer, ShapeOptions shapeOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return shapeOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ShapeOptionsT shapeOptionsT) {
        if (shapeOptionsT == null) {
            return 0;
        }
        return createShapeOptions(flatBufferBuilder, shapeOptionsT.getOutType());
    }

    public ShapeOptionsT unpack() {
        ShapeOptionsT shapeOptionsT = new ShapeOptionsT();
        unpackTo(shapeOptionsT);
        return shapeOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endShapeOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ShapeOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ShapeOptionsT shapeOptionsT) {
        shapeOptionsT.setOutType(outType());
    }
}
