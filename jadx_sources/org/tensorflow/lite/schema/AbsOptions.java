package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class AbsOptions extends Table {

    public static final class Vector extends BaseVector {
        public AbsOptions get(int i11) {
            return get(new AbsOptions(), i11);
        }

        public AbsOptions get(AbsOptions absOptions, int i11) {
            return absOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static AbsOptions getRootAsAbsOptions(ByteBuffer byteBuffer) {
        return getRootAsAbsOptions(byteBuffer, new AbsOptions());
    }

    public static void startAbsOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static AbsOptions getRootAsAbsOptions(ByteBuffer byteBuffer, AbsOptions absOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return absOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, AbsOptionsT absOptionsT) {
        if (absOptionsT == null) {
            return 0;
        }
        startAbsOptions(flatBufferBuilder);
        return endAbsOptions(flatBufferBuilder);
    }

    public AbsOptionsT unpack() {
        AbsOptionsT absOptionsT = new AbsOptionsT();
        unpackTo(absOptionsT);
        return absOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endAbsOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public AbsOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(AbsOptionsT absOptionsT) {
    }
}
