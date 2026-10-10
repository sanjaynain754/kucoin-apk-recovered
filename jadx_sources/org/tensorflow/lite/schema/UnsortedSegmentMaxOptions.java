package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class UnsortedSegmentMaxOptions extends Table {

    public static final class Vector extends BaseVector {
        public UnsortedSegmentMaxOptions get(int i11) {
            return get(new UnsortedSegmentMaxOptions(), i11);
        }

        public UnsortedSegmentMaxOptions get(UnsortedSegmentMaxOptions unsortedSegmentMaxOptions, int i11) {
            return unsortedSegmentMaxOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static UnsortedSegmentMaxOptions getRootAsUnsortedSegmentMaxOptions(ByteBuffer byteBuffer) {
        return getRootAsUnsortedSegmentMaxOptions(byteBuffer, new UnsortedSegmentMaxOptions());
    }

    public static void startUnsortedSegmentMaxOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static UnsortedSegmentMaxOptions getRootAsUnsortedSegmentMaxOptions(ByteBuffer byteBuffer, UnsortedSegmentMaxOptions unsortedSegmentMaxOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return unsortedSegmentMaxOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, UnsortedSegmentMaxOptionsT unsortedSegmentMaxOptionsT) {
        if (unsortedSegmentMaxOptionsT == null) {
            return 0;
        }
        startUnsortedSegmentMaxOptions(flatBufferBuilder);
        return endUnsortedSegmentMaxOptions(flatBufferBuilder);
    }

    public UnsortedSegmentMaxOptionsT unpack() {
        UnsortedSegmentMaxOptionsT unsortedSegmentMaxOptionsT = new UnsortedSegmentMaxOptionsT();
        unpackTo(unsortedSegmentMaxOptionsT);
        return unsortedSegmentMaxOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endUnsortedSegmentMaxOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public UnsortedSegmentMaxOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(UnsortedSegmentMaxOptionsT unsortedSegmentMaxOptionsT) {
    }
}
