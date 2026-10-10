package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ReshapeOptions extends Table {

    public static final class Vector extends BaseVector {
        public ReshapeOptions get(int i11) {
            return get(new ReshapeOptions(), i11);
        }

        public ReshapeOptions get(ReshapeOptions reshapeOptions, int i11) {
            return reshapeOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addNewShape(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static int createNewShapeVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createReshapeOptions(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addNewShape(flatBufferBuilder, i11);
        return endReshapeOptions(flatBufferBuilder);
    }

    public static ReshapeOptions getRootAsReshapeOptions(ByteBuffer byteBuffer) {
        return getRootAsReshapeOptions(byteBuffer, new ReshapeOptions());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ReshapeOptionsT reshapeOptionsT) {
        if (reshapeOptionsT == null) {
            return 0;
        }
        return createReshapeOptions(flatBufferBuilder, reshapeOptionsT.getNewShape() != null ? createNewShapeVector(flatBufferBuilder, reshapeOptionsT.getNewShape()) : 0);
    }

    public static void startNewShapeVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startReshapeOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public int newShape(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer newShapeAsByteBuffer() {
        return __vector_as_bytebuffer(4, 4);
    }

    public ByteBuffer newShapeInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 4);
    }

    public int newShapeLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector newShapeVector() {
        return newShapeVector(new IntVector());
    }

    public static ReshapeOptions getRootAsReshapeOptions(ByteBuffer byteBuffer, ReshapeOptions reshapeOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return reshapeOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public IntVector newShapeVector(IntVector intVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public ReshapeOptionsT unpack() {
        ReshapeOptionsT reshapeOptionsT = new ReshapeOptionsT();
        unpackTo(reshapeOptionsT);
        return reshapeOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endReshapeOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ReshapeOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ReshapeOptionsT reshapeOptionsT) {
        int[] iArr = new int[newShapeLength()];
        for (int i11 = 0; i11 < newShapeLength(); i11++) {
            iArr[i11] = newShape(i11);
        }
        reshapeOptionsT.setNewShape(iArr);
    }
}
