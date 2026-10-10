package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SquareOptions extends Table {

    public static final class Vector extends BaseVector {
        public SquareOptions get(int i11) {
            return get(new SquareOptions(), i11);
        }

        public SquareOptions get(SquareOptions squareOptions, int i11) {
            return squareOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static SquareOptions getRootAsSquareOptions(ByteBuffer byteBuffer) {
        return getRootAsSquareOptions(byteBuffer, new SquareOptions());
    }

    public static void startSquareOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static SquareOptions getRootAsSquareOptions(ByteBuffer byteBuffer, SquareOptions squareOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return squareOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SquareOptionsT squareOptionsT) {
        if (squareOptionsT == null) {
            return 0;
        }
        startSquareOptions(flatBufferBuilder);
        return endSquareOptions(flatBufferBuilder);
    }

    public SquareOptionsT unpack() {
        SquareOptionsT squareOptionsT = new SquareOptionsT();
        unpackTo(squareOptionsT);
        return squareOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSquareOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SquareOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SquareOptionsT squareOptionsT) {
    }
}
