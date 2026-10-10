package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class GreaterOptions extends Table {

    public static final class Vector extends BaseVector {
        public GreaterOptions get(int i11) {
            return get(new GreaterOptions(), i11);
        }

        public GreaterOptions get(GreaterOptions greaterOptions, int i11) {
            return greaterOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static GreaterOptions getRootAsGreaterOptions(ByteBuffer byteBuffer) {
        return getRootAsGreaterOptions(byteBuffer, new GreaterOptions());
    }

    public static void startGreaterOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static GreaterOptions getRootAsGreaterOptions(ByteBuffer byteBuffer, GreaterOptions greaterOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return greaterOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, GreaterOptionsT greaterOptionsT) {
        if (greaterOptionsT == null) {
            return 0;
        }
        startGreaterOptions(flatBufferBuilder);
        return endGreaterOptions(flatBufferBuilder);
    }

    public GreaterOptionsT unpack() {
        GreaterOptionsT greaterOptionsT = new GreaterOptionsT();
        unpackTo(greaterOptionsT);
        return greaterOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endGreaterOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public GreaterOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(GreaterOptionsT greaterOptionsT) {
    }
}
