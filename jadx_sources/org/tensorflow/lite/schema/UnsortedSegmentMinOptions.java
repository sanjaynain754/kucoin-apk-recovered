package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class UnsortedSegmentMinOptions extends Table {

    public static final class Vector extends BaseVector {
        public UnsortedSegmentMinOptions get(int i11) {
            return get(new UnsortedSegmentMinOptions(), i11);
        }

        public UnsortedSegmentMinOptions get(UnsortedSegmentMinOptions unsortedSegmentMinOptions, int i11) {
            return unsortedSegmentMinOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static UnsortedSegmentMinOptions getRootAsUnsortedSegmentMinOptions(ByteBuffer byteBuffer) {
        return getRootAsUnsortedSegmentMinOptions(byteBuffer, new UnsortedSegmentMinOptions());
    }

    public static void startUnsortedSegmentMinOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static UnsortedSegmentMinOptions getRootAsUnsortedSegmentMinOptions(ByteBuffer byteBuffer, UnsortedSegmentMinOptions unsortedSegmentMinOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return unsortedSegmentMinOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, UnsortedSegmentMinOptionsT unsortedSegmentMinOptionsT) {
        if (unsortedSegmentMinOptionsT == null) {
            return 0;
        }
        startUnsortedSegmentMinOptions(flatBufferBuilder);
        return endUnsortedSegmentMinOptions(flatBufferBuilder);
    }

    public UnsortedSegmentMinOptionsT unpack() {
        UnsortedSegmentMinOptionsT unsortedSegmentMinOptionsT = new UnsortedSegmentMinOptionsT();
        unpackTo(unsortedSegmentMinOptionsT);
        return unsortedSegmentMinOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endUnsortedSegmentMinOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public UnsortedSegmentMinOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(UnsortedSegmentMinOptionsT unsortedSegmentMinOptionsT) {
    }
}
