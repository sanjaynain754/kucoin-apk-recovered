package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class VariantSubType extends Table {

    public static final class Vector extends BaseVector {
        public VariantSubType get(int i11) {
            return get(new VariantSubType(), i11);
        }

        public VariantSubType get(VariantSubType variantSubType, int i11) {
            return variantSubType.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addHasRank(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(2, z11, false);
    }

    public static void addShape(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(1, b11, 0);
    }

    public static int createShapeVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createVariantSubType(FlatBufferBuilder flatBufferBuilder, int i11, byte b11, boolean z11) {
        flatBufferBuilder.startTable(3);
        addShape(flatBufferBuilder, i11);
        addHasRank(flatBufferBuilder, z11);
        addType(flatBufferBuilder, b11);
        return endVariantSubType(flatBufferBuilder);
    }

    public static VariantSubType getRootAsVariantSubType(ByteBuffer byteBuffer) {
        return getRootAsVariantSubType(byteBuffer, new VariantSubType());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, VariantSubTypeT variantSubTypeT) {
        if (variantSubTypeT == null) {
            return 0;
        }
        return createVariantSubType(flatBufferBuilder, variantSubTypeT.getShape() != null ? createShapeVector(flatBufferBuilder, variantSubTypeT.getShape()) : 0, variantSubTypeT.getType(), variantSubTypeT.getHasRank());
    }

    public static void startShapeVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startVariantSubType(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
    }

    public int shape(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer shapeAsByteBuffer() {
        return __vector_as_bytebuffer(4, 4);
    }

    public ByteBuffer shapeInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 4);
    }

    public int shapeLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector shapeVector() {
        return shapeVector(new IntVector());
    }

    public byte type() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static VariantSubType getRootAsVariantSubType(ByteBuffer byteBuffer, VariantSubType variantSubType) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return variantSubType.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public boolean hasRank() {
        int i__offset = __offset(8);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public IntVector shapeVector(IntVector intVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public VariantSubTypeT unpack() {
        VariantSubTypeT variantSubTypeT = new VariantSubTypeT();
        unpackTo(variantSubTypeT);
        return variantSubTypeT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endVariantSubType(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public VariantSubType __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(VariantSubTypeT variantSubTypeT) {
        int[] iArr = new int[shapeLength()];
        for (int i11 = 0; i11 < shapeLength(); i11++) {
            iArr[i11] = shape(i11);
        }
        variantSubTypeT.setShape(iArr);
        variantSubTypeT.setType(type());
        variantSubTypeT.setHasRank(hasRank());
    }
}
