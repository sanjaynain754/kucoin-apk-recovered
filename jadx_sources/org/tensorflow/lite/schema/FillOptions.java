package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class FillOptions extends Table {

    public static final class Vector extends BaseVector {
        public FillOptions get(int i11) {
            return get(new FillOptions(), i11);
        }

        public FillOptions get(FillOptions fillOptions, int i11) {
            return fillOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static FillOptions getRootAsFillOptions(ByteBuffer byteBuffer) {
        return getRootAsFillOptions(byteBuffer, new FillOptions());
    }

    public static void startFillOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static FillOptions getRootAsFillOptions(ByteBuffer byteBuffer, FillOptions fillOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return fillOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, FillOptionsT fillOptionsT) {
        if (fillOptionsT == null) {
            return 0;
        }
        startFillOptions(flatBufferBuilder);
        return endFillOptions(flatBufferBuilder);
    }

    public FillOptionsT unpack() {
        FillOptionsT fillOptionsT = new FillOptionsT();
        unpackTo(fillOptionsT);
        return fillOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endFillOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public FillOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(FillOptionsT fillOptionsT) {
    }
}
