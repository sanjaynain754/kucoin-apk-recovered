package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class WhereOptions extends Table {

    public static final class Vector extends BaseVector {
        public WhereOptions get(int i11) {
            return get(new WhereOptions(), i11);
        }

        public WhereOptions get(WhereOptions whereOptions, int i11) {
            return whereOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static WhereOptions getRootAsWhereOptions(ByteBuffer byteBuffer) {
        return getRootAsWhereOptions(byteBuffer, new WhereOptions());
    }

    public static void startWhereOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static WhereOptions getRootAsWhereOptions(ByteBuffer byteBuffer, WhereOptions whereOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return whereOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, WhereOptionsT whereOptionsT) {
        if (whereOptionsT == null) {
            return 0;
        }
        startWhereOptions(flatBufferBuilder);
        return endWhereOptions(flatBufferBuilder);
    }

    public WhereOptionsT unpack() {
        WhereOptionsT whereOptionsT = new WhereOptionsT();
        unpackTo(whereOptionsT);
        return whereOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endWhereOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public WhereOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(WhereOptionsT whereOptionsT) {
    }
}
