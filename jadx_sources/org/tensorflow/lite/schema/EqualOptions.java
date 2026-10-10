package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class EqualOptions extends Table {

    public static final class Vector extends BaseVector {
        public EqualOptions get(int i11) {
            return get(new EqualOptions(), i11);
        }

        public EqualOptions get(EqualOptions equalOptions, int i11) {
            return equalOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static EqualOptions getRootAsEqualOptions(ByteBuffer byteBuffer) {
        return getRootAsEqualOptions(byteBuffer, new EqualOptions());
    }

    public static void startEqualOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static EqualOptions getRootAsEqualOptions(ByteBuffer byteBuffer, EqualOptions equalOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return equalOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, EqualOptionsT equalOptionsT) {
        if (equalOptionsT == null) {
            return 0;
        }
        startEqualOptions(flatBufferBuilder);
        return endEqualOptions(flatBufferBuilder);
    }

    public EqualOptionsT unpack() {
        EqualOptionsT equalOptionsT = new EqualOptionsT();
        unpackTo(equalOptionsT);
        return equalOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endEqualOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public EqualOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(EqualOptionsT equalOptionsT) {
    }
}
