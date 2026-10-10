package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class TopKV2Options extends Table {

    public static final class Vector extends BaseVector {
        public TopKV2Options get(int i11) {
            return get(new TopKV2Options(), i11);
        }

        public TopKV2Options get(TopKV2Options topKV2Options, int i11) {
            return topKV2Options.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static TopKV2Options getRootAsTopKV2Options(ByteBuffer byteBuffer) {
        return getRootAsTopKV2Options(byteBuffer, new TopKV2Options());
    }

    public static void startTopKV2Options(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static TopKV2Options getRootAsTopKV2Options(ByteBuffer byteBuffer, TopKV2Options topKV2Options) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return topKV2Options.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, TopKV2OptionsT topKV2OptionsT) {
        if (topKV2OptionsT == null) {
            return 0;
        }
        startTopKV2Options(flatBufferBuilder);
        return endTopKV2Options(flatBufferBuilder);
    }

    public TopKV2OptionsT unpack() {
        TopKV2OptionsT topKV2OptionsT = new TopKV2OptionsT();
        unpackTo(topKV2OptionsT);
        return topKV2OptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endTopKV2Options(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public TopKV2Options __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(TopKV2OptionsT topKV2OptionsT) {
    }
}
