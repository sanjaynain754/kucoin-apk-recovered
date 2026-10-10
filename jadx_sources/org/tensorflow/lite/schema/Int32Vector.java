package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class Int32Vector extends Table {

    public static final class Vector extends BaseVector {
        public Int32Vector get(int i11) {
            return get(new Int32Vector(), i11);
        }

        public Int32Vector get(Int32Vector int32Vector, int i11) {
            return int32Vector.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addValues(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static int createInt32Vector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addValues(flatBufferBuilder, i11);
        return endInt32Vector(flatBufferBuilder);
    }

    public static int createValuesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static Int32Vector getRootAsInt32Vector(ByteBuffer byteBuffer) {
        return getRootAsInt32Vector(byteBuffer, new Int32Vector());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, Int32VectorT int32VectorT) {
        if (int32VectorT == null) {
            return 0;
        }
        return createInt32Vector(flatBufferBuilder, int32VectorT.getValues() != null ? createValuesVector(flatBufferBuilder, int32VectorT.getValues()) : 0);
    }

    public static void startInt32Vector(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public static void startValuesVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public int values(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer valuesAsByteBuffer() {
        return __vector_as_bytebuffer(4, 4);
    }

    public ByteBuffer valuesInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 4);
    }

    public int valuesLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector valuesVector() {
        return valuesVector(new IntVector());
    }

    public static Int32Vector getRootAsInt32Vector(ByteBuffer byteBuffer, Int32Vector int32Vector) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return int32Vector.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public Int32VectorT unpack() {
        Int32VectorT int32VectorT = new Int32VectorT();
        unpackTo(int32VectorT);
        return int32VectorT;
    }

    public IntVector valuesVector(IntVector intVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endInt32Vector(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public Int32Vector __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(Int32VectorT int32VectorT) {
        int[] iArr = new int[valuesLength()];
        for (int i11 = 0; i11 < valuesLength(); i11++) {
            iArr[i11] = values(i11);
        }
        int32VectorT.setValues(iArr);
    }
}
