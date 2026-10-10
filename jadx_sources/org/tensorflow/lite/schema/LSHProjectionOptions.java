package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class LSHProjectionOptions extends Table {

    public static final class Vector extends BaseVector {
        public LSHProjectionOptions get(int i11) {
            return get(new LSHProjectionOptions(), i11);
        }

        public LSHProjectionOptions get(LSHProjectionOptions lSHProjectionOptions, int i11) {
            return lSHProjectionOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static int createLSHProjectionOptions(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.startTable(1);
        addType(flatBufferBuilder, b11);
        return endLSHProjectionOptions(flatBufferBuilder);
    }

    public static LSHProjectionOptions getRootAsLSHProjectionOptions(ByteBuffer byteBuffer) {
        return getRootAsLSHProjectionOptions(byteBuffer, new LSHProjectionOptions());
    }

    public static void startLSHProjectionOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public byte type() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static LSHProjectionOptions getRootAsLSHProjectionOptions(ByteBuffer byteBuffer, LSHProjectionOptions lSHProjectionOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return lSHProjectionOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, LSHProjectionOptionsT lSHProjectionOptionsT) {
        if (lSHProjectionOptionsT == null) {
            return 0;
        }
        return createLSHProjectionOptions(flatBufferBuilder, lSHProjectionOptionsT.getType());
    }

    public LSHProjectionOptionsT unpack() {
        LSHProjectionOptionsT lSHProjectionOptionsT = new LSHProjectionOptionsT();
        unpackTo(lSHProjectionOptionsT);
        return lSHProjectionOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endLSHProjectionOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public LSHProjectionOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(LSHProjectionOptionsT lSHProjectionOptionsT) {
        lSHProjectionOptionsT.setType(type());
    }
}
