package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ExpandDimsOptions extends Table {

    public static final class Vector extends BaseVector {
        public ExpandDimsOptions get(int i11) {
            return get(new ExpandDimsOptions(), i11);
        }

        public ExpandDimsOptions get(ExpandDimsOptions expandDimsOptions, int i11) {
            return expandDimsOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static ExpandDimsOptions getRootAsExpandDimsOptions(ByteBuffer byteBuffer) {
        return getRootAsExpandDimsOptions(byteBuffer, new ExpandDimsOptions());
    }

    public static void startExpandDimsOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static ExpandDimsOptions getRootAsExpandDimsOptions(ByteBuffer byteBuffer, ExpandDimsOptions expandDimsOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return expandDimsOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ExpandDimsOptionsT expandDimsOptionsT) {
        if (expandDimsOptionsT == null) {
            return 0;
        }
        startExpandDimsOptions(flatBufferBuilder);
        return endExpandDimsOptions(flatBufferBuilder);
    }

    public ExpandDimsOptionsT unpack() {
        ExpandDimsOptionsT expandDimsOptionsT = new ExpandDimsOptionsT();
        unpackTo(expandDimsOptionsT);
        return expandDimsOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endExpandDimsOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ExpandDimsOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ExpandDimsOptionsT expandDimsOptionsT) {
    }
}
