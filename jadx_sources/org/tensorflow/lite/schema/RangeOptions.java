package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class RangeOptions extends Table {

    public static final class Vector extends BaseVector {
        public RangeOptions get(int i11) {
            return get(new RangeOptions(), i11);
        }

        public RangeOptions get(RangeOptions rangeOptions, int i11) {
            return rangeOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static RangeOptions getRootAsRangeOptions(ByteBuffer byteBuffer) {
        return getRootAsRangeOptions(byteBuffer, new RangeOptions());
    }

    public static void startRangeOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static RangeOptions getRootAsRangeOptions(ByteBuffer byteBuffer, RangeOptions rangeOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return rangeOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, RangeOptionsT rangeOptionsT) {
        if (rangeOptionsT == null) {
            return 0;
        }
        startRangeOptions(flatBufferBuilder);
        return endRangeOptions(flatBufferBuilder);
    }

    public RangeOptionsT unpack() {
        RangeOptionsT rangeOptionsT = new RangeOptionsT();
        unpackTo(rangeOptionsT);
        return rangeOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endRangeOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public RangeOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(RangeOptionsT rangeOptionsT) {
    }
}
