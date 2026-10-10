package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class LessOptions extends Table {

    public static final class Vector extends BaseVector {
        public LessOptions get(int i11) {
            return get(new LessOptions(), i11);
        }

        public LessOptions get(LessOptions lessOptions, int i11) {
            return lessOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static LessOptions getRootAsLessOptions(ByteBuffer byteBuffer) {
        return getRootAsLessOptions(byteBuffer, new LessOptions());
    }

    public static void startLessOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static LessOptions getRootAsLessOptions(ByteBuffer byteBuffer, LessOptions lessOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return lessOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, LessOptionsT lessOptionsT) {
        if (lessOptionsT == null) {
            return 0;
        }
        startLessOptions(flatBufferBuilder);
        return endLessOptions(flatBufferBuilder);
    }

    public LessOptionsT unpack() {
        LessOptionsT lessOptionsT = new LessOptionsT();
        unpackTo(lessOptionsT);
        return lessOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endLessOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public LessOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(LessOptionsT lessOptionsT) {
    }
}
