package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class BitcastOptions extends Table {

    public static final class Vector extends BaseVector {
        public BitcastOptions get(int i11) {
            return get(new BitcastOptions(), i11);
        }

        public BitcastOptions get(BitcastOptions bitcastOptions, int i11) {
            return bitcastOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static BitcastOptions getRootAsBitcastOptions(ByteBuffer byteBuffer) {
        return getRootAsBitcastOptions(byteBuffer, new BitcastOptions());
    }

    public static void startBitcastOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static BitcastOptions getRootAsBitcastOptions(ByteBuffer byteBuffer, BitcastOptions bitcastOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bitcastOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, BitcastOptionsT bitcastOptionsT) {
        if (bitcastOptionsT == null) {
            return 0;
        }
        startBitcastOptions(flatBufferBuilder);
        return endBitcastOptions(flatBufferBuilder);
    }

    public BitcastOptionsT unpack() {
        BitcastOptionsT bitcastOptionsT = new BitcastOptionsT();
        unpackTo(bitcastOptionsT);
        return bitcastOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endBitcastOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public BitcastOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(BitcastOptionsT bitcastOptionsT) {
    }
}
