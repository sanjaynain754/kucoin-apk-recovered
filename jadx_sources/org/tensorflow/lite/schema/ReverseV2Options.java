package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ReverseV2Options extends Table {

    public static final class Vector extends BaseVector {
        public ReverseV2Options get(int i11) {
            return get(new ReverseV2Options(), i11);
        }

        public ReverseV2Options get(ReverseV2Options reverseV2Options, int i11) {
            return reverseV2Options.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static ReverseV2Options getRootAsReverseV2Options(ByteBuffer byteBuffer) {
        return getRootAsReverseV2Options(byteBuffer, new ReverseV2Options());
    }

    public static void startReverseV2Options(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static ReverseV2Options getRootAsReverseV2Options(ByteBuffer byteBuffer, ReverseV2Options reverseV2Options) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return reverseV2Options.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ReverseV2OptionsT reverseV2OptionsT) {
        if (reverseV2OptionsT == null) {
            return 0;
        }
        startReverseV2Options(flatBufferBuilder);
        return endReverseV2Options(flatBufferBuilder);
    }

    public ReverseV2OptionsT unpack() {
        ReverseV2OptionsT reverseV2OptionsT = new ReverseV2OptionsT();
        unpackTo(reverseV2OptionsT);
        return reverseV2OptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endReverseV2Options(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ReverseV2Options __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ReverseV2OptionsT reverseV2OptionsT) {
    }
}
