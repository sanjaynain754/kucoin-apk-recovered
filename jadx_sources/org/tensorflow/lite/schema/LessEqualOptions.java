package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class LessEqualOptions extends Table {

    public static final class Vector extends BaseVector {
        public LessEqualOptions get(int i11) {
            return get(new LessEqualOptions(), i11);
        }

        public LessEqualOptions get(LessEqualOptions lessEqualOptions, int i11) {
            return lessEqualOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static LessEqualOptions getRootAsLessEqualOptions(ByteBuffer byteBuffer) {
        return getRootAsLessEqualOptions(byteBuffer, new LessEqualOptions());
    }

    public static void startLessEqualOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static LessEqualOptions getRootAsLessEqualOptions(ByteBuffer byteBuffer, LessEqualOptions lessEqualOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return lessEqualOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, LessEqualOptionsT lessEqualOptionsT) {
        if (lessEqualOptionsT == null) {
            return 0;
        }
        startLessEqualOptions(flatBufferBuilder);
        return endLessEqualOptions(flatBufferBuilder);
    }

    public LessEqualOptionsT unpack() {
        LessEqualOptionsT lessEqualOptionsT = new LessEqualOptionsT();
        unpackTo(lessEqualOptionsT);
        return lessEqualOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endLessEqualOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public LessEqualOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(LessEqualOptionsT lessEqualOptionsT) {
    }
}
