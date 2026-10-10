package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class BitwiseXorOptions extends Table {

    public static final class Vector extends BaseVector {
        public BitwiseXorOptions get(int i11) {
            return get(new BitwiseXorOptions(), i11);
        }

        public BitwiseXorOptions get(BitwiseXorOptions bitwiseXorOptions, int i11) {
            return bitwiseXorOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static BitwiseXorOptions getRootAsBitwiseXorOptions(ByteBuffer byteBuffer) {
        return getRootAsBitwiseXorOptions(byteBuffer, new BitwiseXorOptions());
    }

    public static void startBitwiseXorOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static BitwiseXorOptions getRootAsBitwiseXorOptions(ByteBuffer byteBuffer, BitwiseXorOptions bitwiseXorOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bitwiseXorOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, BitwiseXorOptionsT bitwiseXorOptionsT) {
        if (bitwiseXorOptionsT == null) {
            return 0;
        }
        startBitwiseXorOptions(flatBufferBuilder);
        return endBitwiseXorOptions(flatBufferBuilder);
    }

    public BitwiseXorOptionsT unpack() {
        BitwiseXorOptionsT bitwiseXorOptionsT = new BitwiseXorOptionsT();
        unpackTo(bitwiseXorOptionsT);
        return bitwiseXorOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endBitwiseXorOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public BitwiseXorOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(BitwiseXorOptionsT bitwiseXorOptionsT) {
    }
}
