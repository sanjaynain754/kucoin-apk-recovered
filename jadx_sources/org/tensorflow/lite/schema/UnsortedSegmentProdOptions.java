package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class UnsortedSegmentProdOptions extends Table {

    public static final class Vector extends BaseVector {
        public UnsortedSegmentProdOptions get(int i11) {
            return get(new UnsortedSegmentProdOptions(), i11);
        }

        public UnsortedSegmentProdOptions get(UnsortedSegmentProdOptions unsortedSegmentProdOptions, int i11) {
            return unsortedSegmentProdOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static UnsortedSegmentProdOptions getRootAsUnsortedSegmentProdOptions(ByteBuffer byteBuffer) {
        return getRootAsUnsortedSegmentProdOptions(byteBuffer, new UnsortedSegmentProdOptions());
    }

    public static void startUnsortedSegmentProdOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static UnsortedSegmentProdOptions getRootAsUnsortedSegmentProdOptions(ByteBuffer byteBuffer, UnsortedSegmentProdOptions unsortedSegmentProdOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return unsortedSegmentProdOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, UnsortedSegmentProdOptionsT unsortedSegmentProdOptionsT) {
        if (unsortedSegmentProdOptionsT == null) {
            return 0;
        }
        startUnsortedSegmentProdOptions(flatBufferBuilder);
        return endUnsortedSegmentProdOptions(flatBufferBuilder);
    }

    public UnsortedSegmentProdOptionsT unpack() {
        UnsortedSegmentProdOptionsT unsortedSegmentProdOptionsT = new UnsortedSegmentProdOptionsT();
        unpackTo(unsortedSegmentProdOptionsT);
        return unsortedSegmentProdOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endUnsortedSegmentProdOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public UnsortedSegmentProdOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(UnsortedSegmentProdOptionsT unsortedSegmentProdOptionsT) {
    }
}
