package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SquaredDifferenceOptions extends Table {

    public static final class Vector extends BaseVector {
        public SquaredDifferenceOptions get(int i11) {
            return get(new SquaredDifferenceOptions(), i11);
        }

        public SquaredDifferenceOptions get(SquaredDifferenceOptions squaredDifferenceOptions, int i11) {
            return squaredDifferenceOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static SquaredDifferenceOptions getRootAsSquaredDifferenceOptions(ByteBuffer byteBuffer) {
        return getRootAsSquaredDifferenceOptions(byteBuffer, new SquaredDifferenceOptions());
    }

    public static void startSquaredDifferenceOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static SquaredDifferenceOptions getRootAsSquaredDifferenceOptions(ByteBuffer byteBuffer, SquaredDifferenceOptions squaredDifferenceOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return squaredDifferenceOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SquaredDifferenceOptionsT squaredDifferenceOptionsT) {
        if (squaredDifferenceOptionsT == null) {
            return 0;
        }
        startSquaredDifferenceOptions(flatBufferBuilder);
        return endSquaredDifferenceOptions(flatBufferBuilder);
    }

    public SquaredDifferenceOptionsT unpack() {
        SquaredDifferenceOptionsT squaredDifferenceOptionsT = new SquaredDifferenceOptionsT();
        unpackTo(squaredDifferenceOptionsT);
        return squaredDifferenceOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSquaredDifferenceOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SquaredDifferenceOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SquaredDifferenceOptionsT squaredDifferenceOptionsT) {
    }
}
