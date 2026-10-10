package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class UnsortedSegmentSumOptions extends Table {

    public static final class Vector extends BaseVector {
        public UnsortedSegmentSumOptions get(int i11) {
            return get(new UnsortedSegmentSumOptions(), i11);
        }

        public UnsortedSegmentSumOptions get(UnsortedSegmentSumOptions unsortedSegmentSumOptions, int i11) {
            return unsortedSegmentSumOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static UnsortedSegmentSumOptions getRootAsUnsortedSegmentSumOptions(ByteBuffer byteBuffer) {
        return getRootAsUnsortedSegmentSumOptions(byteBuffer, new UnsortedSegmentSumOptions());
    }

    public static void startUnsortedSegmentSumOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static UnsortedSegmentSumOptions getRootAsUnsortedSegmentSumOptions(ByteBuffer byteBuffer, UnsortedSegmentSumOptions unsortedSegmentSumOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return unsortedSegmentSumOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, UnsortedSegmentSumOptionsT unsortedSegmentSumOptionsT) {
        if (unsortedSegmentSumOptionsT == null) {
            return 0;
        }
        startUnsortedSegmentSumOptions(flatBufferBuilder);
        return endUnsortedSegmentSumOptions(flatBufferBuilder);
    }

    public UnsortedSegmentSumOptionsT unpack() {
        UnsortedSegmentSumOptionsT unsortedSegmentSumOptionsT = new UnsortedSegmentSumOptionsT();
        unpackTo(unsortedSegmentSumOptionsT);
        return unsortedSegmentSumOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endUnsortedSegmentSumOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public UnsortedSegmentSumOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(UnsortedSegmentSumOptionsT unsortedSegmentSumOptionsT) {
    }
}
