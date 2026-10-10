package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.Table;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class BoundingBoxProperties extends Table {

    public static final class Vector extends BaseVector {
        public BoundingBoxProperties get(int i11) {
            return get(new BoundingBoxProperties(), i11);
        }

        public BoundingBoxProperties get(BoundingBoxProperties boundingBoxProperties, int i11) {
            return boundingBoxProperties.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addCoordinateType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(2, b11, 0);
    }

    public static void addIndex(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(1, b11, 0);
    }

    public static int createBoundingBoxProperties(FlatBufferBuilder flatBufferBuilder, int i11, byte b11, byte b12) {
        flatBufferBuilder.startTable(3);
        addIndex(flatBufferBuilder, i11);
        addCoordinateType(flatBufferBuilder, b12);
        addType(flatBufferBuilder, b11);
        return endBoundingBoxProperties(flatBufferBuilder);
    }

    public static int createIndexVector(FlatBufferBuilder flatBufferBuilder, long[] jArr) {
        flatBufferBuilder.startVector(4, jArr.length, 4);
        for (int length = jArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt((int) jArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static BoundingBoxProperties getRootAsBoundingBoxProperties(ByteBuffer byteBuffer) {
        return getRootAsBoundingBoxProperties(byteBuffer, new BoundingBoxProperties());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, BoundingBoxPropertiesT boundingBoxPropertiesT) {
        if (boundingBoxPropertiesT == null) {
            return 0;
        }
        return createBoundingBoxProperties(flatBufferBuilder, boundingBoxPropertiesT.getIndex() != null ? createIndexVector(flatBufferBuilder, boundingBoxPropertiesT.getIndex()) : 0, boundingBoxPropertiesT.getType(), boundingBoxPropertiesT.getCoordinateType());
    }

    public static void startBoundingBoxProperties(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
    }

    public static void startIndexVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public long index(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return ((long) this.f12714bb.getInt(__vector(i__offset) + (i11 * 4))) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public ByteBuffer indexAsByteBuffer() {
        return __vector_as_bytebuffer(4, 4);
    }

    public ByteBuffer indexInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 4);
    }

    public int indexLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector indexVector() {
        return indexVector(new IntVector());
    }

    public byte type() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static BoundingBoxProperties getRootAsBoundingBoxProperties(ByteBuffer byteBuffer, BoundingBoxProperties boundingBoxProperties) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return boundingBoxProperties.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public byte coordinateType() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public IntVector indexVector(IntVector intVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public BoundingBoxPropertiesT unpack() {
        BoundingBoxPropertiesT boundingBoxPropertiesT = new BoundingBoxPropertiesT();
        unpackTo(boundingBoxPropertiesT);
        return boundingBoxPropertiesT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endBoundingBoxProperties(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public BoundingBoxProperties __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(BoundingBoxPropertiesT boundingBoxPropertiesT) {
        long[] jArr = new long[indexLength()];
        for (int i11 = 0; i11 < indexLength(); i11++) {
            jArr[i11] = index(i11);
        }
        boundingBoxPropertiesT.setIndex(jArr);
        boundingBoxPropertiesT.setType(type());
        boundingBoxPropertiesT.setCoordinateType(coordinateType());
    }
}
