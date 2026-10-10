package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class UnpackOptions extends Table {

    public static final class Vector extends BaseVector {
        public UnpackOptions get(int i11) {
            return get(new UnpackOptions(), i11);
        }

        public UnpackOptions get(UnpackOptions unpackOptions, int i11) {
            return unpackOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAxis(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(1, i11, 0);
    }

    public static void addNum(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createUnpackOptions(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addAxis(flatBufferBuilder, i12);
        addNum(flatBufferBuilder, i11);
        return endUnpackOptions(flatBufferBuilder);
    }

    public static UnpackOptions getRootAsUnpackOptions(ByteBuffer byteBuffer) {
        return getRootAsUnpackOptions(byteBuffer, new UnpackOptions());
    }

    public static void startUnpackOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public int axis() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int num() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static UnpackOptions getRootAsUnpackOptions(ByteBuffer byteBuffer, UnpackOptions unpackOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return unpackOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, UnpackOptionsT unpackOptionsT) {
        if (unpackOptionsT == null) {
            return 0;
        }
        return createUnpackOptions(flatBufferBuilder, unpackOptionsT.getNum(), unpackOptionsT.getAxis());
    }

    public UnpackOptionsT unpack() {
        UnpackOptionsT unpackOptionsT = new UnpackOptionsT();
        unpackTo(unpackOptionsT);
        return unpackOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endUnpackOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public UnpackOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(UnpackOptionsT unpackOptionsT) {
        unpackOptionsT.setNum(num());
        unpackOptionsT.setAxis(axis());
    }
}
