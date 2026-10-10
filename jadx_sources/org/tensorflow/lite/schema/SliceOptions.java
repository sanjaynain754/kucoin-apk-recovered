package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SliceOptions extends Table {

    public static final class Vector extends BaseVector {
        public SliceOptions get(int i11) {
            return get(new SliceOptions(), i11);
        }

        public SliceOptions get(SliceOptions sliceOptions, int i11) {
            return sliceOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static SliceOptions getRootAsSliceOptions(ByteBuffer byteBuffer) {
        return getRootAsSliceOptions(byteBuffer, new SliceOptions());
    }

    public static void startSliceOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static SliceOptions getRootAsSliceOptions(ByteBuffer byteBuffer, SliceOptions sliceOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return sliceOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SliceOptionsT sliceOptionsT) {
        if (sliceOptionsT == null) {
            return 0;
        }
        startSliceOptions(flatBufferBuilder);
        return endSliceOptions(flatBufferBuilder);
    }

    public SliceOptionsT unpack() {
        SliceOptionsT sliceOptionsT = new SliceOptionsT();
        unpackTo(sliceOptionsT);
        return sliceOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSliceOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SliceOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SliceOptionsT sliceOptionsT) {
    }
}
