package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class Uint8Vector extends Table {

    public static final class Vector extends BaseVector {
        public Uint8Vector get(int i11) {
            return get(new Uint8Vector(), i11);
        }

        public Uint8Vector get(Uint8Vector uint8Vector, int i11) {
            return uint8Vector.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addValues(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static int createUint8Vector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addValues(flatBufferBuilder, i11);
        return endUint8Vector(flatBufferBuilder);
    }

    public static int createValuesVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        return flatBufferBuilder.createByteVector(bArr);
    }

    public static Uint8Vector getRootAsUint8Vector(ByteBuffer byteBuffer) {
        return getRootAsUint8Vector(byteBuffer, new Uint8Vector());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, Uint8VectorT uint8VectorT) {
        int iCreateValuesVector = 0;
        if (uint8VectorT == null) {
            return 0;
        }
        if (uint8VectorT.getValues() != null) {
            byte[] bArr = new byte[uint8VectorT.getValues().length];
            int[] values = uint8VectorT.getValues();
            int length = values.length;
            int i11 = 0;
            while (iCreateValuesVector < length) {
                bArr[i11] = (byte) values[iCreateValuesVector];
                i11++;
                iCreateValuesVector++;
            }
            iCreateValuesVector = createValuesVector(flatBufferBuilder, bArr);
        }
        return createUint8Vector(flatBufferBuilder, iCreateValuesVector);
    }

    public static void startUint8Vector(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public static void startValuesVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(1, i11, 1);
    }

    public int values(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(__vector(i__offset) + i11) & 255;
        }
        return 0;
    }

    public ByteBuffer valuesAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer valuesInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public int valuesLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public ByteVector valuesVector() {
        return valuesVector(new ByteVector());
    }

    public static int createValuesVector(FlatBufferBuilder flatBufferBuilder, ByteBuffer byteBuffer) {
        return flatBufferBuilder.createByteVector(byteBuffer);
    }

    public static Uint8Vector getRootAsUint8Vector(ByteBuffer byteBuffer, Uint8Vector uint8Vector) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return uint8Vector.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public Uint8VectorT unpack() {
        Uint8VectorT uint8VectorT = new Uint8VectorT();
        unpackTo(uint8VectorT);
        return uint8VectorT;
    }

    public ByteVector valuesVector(ByteVector byteVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return byteVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endUint8Vector(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public Uint8Vector __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(Uint8VectorT uint8VectorT) {
        int[] iArr = new int[valuesLength()];
        for (int i11 = 0; i11 < valuesLength(); i11++) {
            iArr[i11] = values(i11);
        }
        uint8VectorT.setValues(iArr);
    }
}
