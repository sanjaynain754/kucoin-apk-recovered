package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ZerosLikeOptions extends Table {

    public static final class Vector extends BaseVector {
        public ZerosLikeOptions get(int i11) {
            return get(new ZerosLikeOptions(), i11);
        }

        public ZerosLikeOptions get(ZerosLikeOptions zerosLikeOptions, int i11) {
            return zerosLikeOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static ZerosLikeOptions getRootAsZerosLikeOptions(ByteBuffer byteBuffer) {
        return getRootAsZerosLikeOptions(byteBuffer, new ZerosLikeOptions());
    }

    public static void startZerosLikeOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static ZerosLikeOptions getRootAsZerosLikeOptions(ByteBuffer byteBuffer, ZerosLikeOptions zerosLikeOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return zerosLikeOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ZerosLikeOptionsT zerosLikeOptionsT) {
        if (zerosLikeOptionsT == null) {
            return 0;
        }
        startZerosLikeOptions(flatBufferBuilder);
        return endZerosLikeOptions(flatBufferBuilder);
    }

    public ZerosLikeOptionsT unpack() {
        ZerosLikeOptionsT zerosLikeOptionsT = new ZerosLikeOptionsT();
        unpackTo(zerosLikeOptionsT);
        return zerosLikeOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endZerosLikeOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ZerosLikeOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ZerosLikeOptionsT zerosLikeOptionsT) {
    }
}
