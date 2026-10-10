package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SegmentSumOptions extends Table {

    public static final class Vector extends BaseVector {
        public SegmentSumOptions get(int i11) {
            return get(new SegmentSumOptions(), i11);
        }

        public SegmentSumOptions get(SegmentSumOptions segmentSumOptions, int i11) {
            return segmentSumOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static SegmentSumOptions getRootAsSegmentSumOptions(ByteBuffer byteBuffer) {
        return getRootAsSegmentSumOptions(byteBuffer, new SegmentSumOptions());
    }

    public static void startSegmentSumOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static SegmentSumOptions getRootAsSegmentSumOptions(ByteBuffer byteBuffer, SegmentSumOptions segmentSumOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return segmentSumOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SegmentSumOptionsT segmentSumOptionsT) {
        if (segmentSumOptionsT == null) {
            return 0;
        }
        startSegmentSumOptions(flatBufferBuilder);
        return endSegmentSumOptions(flatBufferBuilder);
    }

    public SegmentSumOptionsT unpack() {
        SegmentSumOptionsT segmentSumOptionsT = new SegmentSumOptionsT();
        unpackTo(segmentSumOptionsT);
        return segmentSumOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSegmentSumOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SegmentSumOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SegmentSumOptionsT segmentSumOptionsT) {
    }
}
