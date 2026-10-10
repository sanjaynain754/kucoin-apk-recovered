package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p852kotlin.UShort;

/* JADX INFO: loaded from: classes61.dex */
public final class Uint16Vector extends Table {

    public static final class Vector extends BaseVector {
        public Uint16Vector get(int i11) {
            return get(new Uint16Vector(), i11);
        }

        public Uint16Vector get(Uint16Vector uint16Vector, int i11) {
            return uint16Vector.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addValues(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static int createUint16Vector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addValues(flatBufferBuilder, i11);
        return endUint16Vector(flatBufferBuilder);
    }

    public static int createValuesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(2, iArr.length, 2);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addShort((short) iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static Uint16Vector getRootAsUint16Vector(ByteBuffer byteBuffer) {
        return getRootAsUint16Vector(byteBuffer, new Uint16Vector());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, Uint16VectorT uint16VectorT) {
        if (uint16VectorT == null) {
            return 0;
        }
        return createUint16Vector(flatBufferBuilder, uint16VectorT.getValues() != null ? createValuesVector(flatBufferBuilder, uint16VectorT.getValues()) : 0);
    }

    public static void startUint16Vector(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public static void startValuesVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(2, i11, 2);
    }

    public int values(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getShort(__vector(i__offset) + (i11 * 2)) & UShort.MAX_VALUE;
        }
        return 0;
    }

    public ByteBuffer valuesAsByteBuffer() {
        return __vector_as_bytebuffer(4, 2);
    }

    public ByteBuffer valuesInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 2);
    }

    public int valuesLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public ShortVector valuesVector() {
        return valuesVector(new ShortVector());
    }

    public static Uint16Vector getRootAsUint16Vector(ByteBuffer byteBuffer, Uint16Vector uint16Vector) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return uint16Vector.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public Uint16VectorT unpack() {
        Uint16VectorT uint16VectorT = new Uint16VectorT();
        unpackTo(uint16VectorT);
        return uint16VectorT;
    }

    public ShortVector valuesVector(ShortVector shortVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return shortVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endUint16Vector(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public Uint16Vector __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(Uint16VectorT uint16VectorT) {
        int[] iArr = new int[valuesLength()];
        for (int i11 = 0; i11 < valuesLength(); i11++) {
            iArr[i11] = values(i11);
        }
        uint16VectorT.setValues(iArr);
    }
}
