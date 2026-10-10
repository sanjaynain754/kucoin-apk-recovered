package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class OneHotOptions extends Table {

    public static final class Vector extends BaseVector {
        public OneHotOptions get(int i11) {
            return get(new OneHotOptions(), i11);
        }

        public OneHotOptions get(OneHotOptions oneHotOptions, int i11) {
            return oneHotOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAxis(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createOneHotOptions(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addAxis(flatBufferBuilder, i11);
        return endOneHotOptions(flatBufferBuilder);
    }

    public static OneHotOptions getRootAsOneHotOptions(ByteBuffer byteBuffer) {
        return getRootAsOneHotOptions(byteBuffer, new OneHotOptions());
    }

    public static void startOneHotOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public int axis() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static OneHotOptions getRootAsOneHotOptions(ByteBuffer byteBuffer, OneHotOptions oneHotOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return oneHotOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, OneHotOptionsT oneHotOptionsT) {
        if (oneHotOptionsT == null) {
            return 0;
        }
        return createOneHotOptions(flatBufferBuilder, oneHotOptionsT.getAxis());
    }

    public OneHotOptionsT unpack() {
        OneHotOptionsT oneHotOptionsT = new OneHotOptionsT();
        unpackTo(oneHotOptionsT);
        return oneHotOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endOneHotOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public OneHotOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(OneHotOptionsT oneHotOptionsT) {
        oneHotOptionsT.setAxis(axis());
    }
}
