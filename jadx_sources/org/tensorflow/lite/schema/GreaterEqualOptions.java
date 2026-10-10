package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class GreaterEqualOptions extends Table {

    public static final class Vector extends BaseVector {
        public GreaterEqualOptions get(int i11) {
            return get(new GreaterEqualOptions(), i11);
        }

        public GreaterEqualOptions get(GreaterEqualOptions greaterEqualOptions, int i11) {
            return greaterEqualOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static GreaterEqualOptions getRootAsGreaterEqualOptions(ByteBuffer byteBuffer) {
        return getRootAsGreaterEqualOptions(byteBuffer, new GreaterEqualOptions());
    }

    public static void startGreaterEqualOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static GreaterEqualOptions getRootAsGreaterEqualOptions(ByteBuffer byteBuffer, GreaterEqualOptions greaterEqualOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return greaterEqualOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, GreaterEqualOptionsT greaterEqualOptionsT) {
        if (greaterEqualOptionsT == null) {
            return 0;
        }
        startGreaterEqualOptions(flatBufferBuilder);
        return endGreaterEqualOptions(flatBufferBuilder);
    }

    public GreaterEqualOptionsT unpack() {
        GreaterEqualOptionsT greaterEqualOptionsT = new GreaterEqualOptionsT();
        unpackTo(greaterEqualOptionsT);
        return greaterEqualOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endGreaterEqualOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public GreaterEqualOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(GreaterEqualOptionsT greaterEqualOptionsT) {
    }
}
