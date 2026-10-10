package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class QuantizationParameters extends Table {

    public static final class Vector extends BaseVector {
        public QuantizationParameters get(int i11) {
            return get(new QuantizationParameters(), i11);
        }

        public QuantizationParameters get(QuantizationParameters quantizationParameters, int i11) {
            return quantizationParameters.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addDetails(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(5, i11, 0);
    }

    public static void addDetailsType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(4, b11, 0);
    }

    public static void addMax(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static void addMin(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addQuantizedDimension(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(6, i11, 0);
    }

    public static void addScale(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(2, i11, 0);
    }

    public static void addZeroPoint(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(3, i11, 0);
    }

    public static int createMaxVector(FlatBufferBuilder flatBufferBuilder, float[] fArr) {
        flatBufferBuilder.startVector(4, fArr.length, 4);
        for (int length = fArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addFloat(fArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createMinVector(FlatBufferBuilder flatBufferBuilder, float[] fArr) {
        flatBufferBuilder.startVector(4, fArr.length, 4);
        for (int length = fArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addFloat(fArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createQuantizationParameters(FlatBufferBuilder flatBufferBuilder, int i11, int i12, int i13, int i14, byte b11, int i15, int i16) {
        flatBufferBuilder.startTable(7);
        addQuantizedDimension(flatBufferBuilder, i16);
        addDetails(flatBufferBuilder, i15);
        addZeroPoint(flatBufferBuilder, i14);
        addScale(flatBufferBuilder, i13);
        addMax(flatBufferBuilder, i12);
        addMin(flatBufferBuilder, i11);
        addDetailsType(flatBufferBuilder, b11);
        return endQuantizationParameters(flatBufferBuilder);
    }

    public static int createScaleVector(FlatBufferBuilder flatBufferBuilder, float[] fArr) {
        flatBufferBuilder.startVector(4, fArr.length, 4);
        for (int length = fArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addFloat(fArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createZeroPointVector(FlatBufferBuilder flatBufferBuilder, long[] jArr) {
        flatBufferBuilder.startVector(8, jArr.length, 8);
        for (int length = jArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addLong(jArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static QuantizationParameters getRootAsQuantizationParameters(ByteBuffer byteBuffer) {
        return getRootAsQuantizationParameters(byteBuffer, new QuantizationParameters());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, QuantizationParametersT quantizationParametersT) {
        if (quantizationParametersT == null) {
            return 0;
        }
        return createQuantizationParameters(flatBufferBuilder, quantizationParametersT.getMin() != null ? createMinVector(flatBufferBuilder, quantizationParametersT.getMin()) : 0, quantizationParametersT.getMax() != null ? createMaxVector(flatBufferBuilder, quantizationParametersT.getMax()) : 0, quantizationParametersT.getScale() != null ? createScaleVector(flatBufferBuilder, quantizationParametersT.getScale()) : 0, quantizationParametersT.getZeroPoint() != null ? createZeroPointVector(flatBufferBuilder, quantizationParametersT.getZeroPoint()) : 0, quantizationParametersT.getDetails() == null ? (byte) 0 : quantizationParametersT.getDetails().getType(), quantizationParametersT.getDetails() != null ? QuantizationDetailsUnion.pack(flatBufferBuilder, quantizationParametersT.getDetails()) : 0, quantizationParametersT.getQuantizedDimension());
    }

    public static void startMaxVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startMinVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startQuantizationParameters(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(7);
    }

    public static void startScaleVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public float max(int i11) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(__vector(i__offset) + (i11 * 4));
        }
        return 0.0f;
    }

    public ByteBuffer maxAsByteBuffer() {
        return __vector_as_bytebuffer(6, 4);
    }

    public ByteBuffer maxInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 4);
    }

    public int maxLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public FloatVector maxVector() {
        return maxVector(new FloatVector());
    }

    public float min(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(__vector(i__offset) + (i11 * 4));
        }
        return 0.0f;
    }

    public ByteBuffer minAsByteBuffer() {
        return __vector_as_bytebuffer(4, 4);
    }

    public ByteBuffer minInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 4);
    }

    public int minLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public FloatVector minVector() {
        return minVector(new FloatVector());
    }

    public FloatVector scaleVector() {
        return scaleVector(new FloatVector());
    }

    public LongVector zeroPointVector() {
        return zeroPointVector(new LongVector());
    }

    public static QuantizationParameters getRootAsQuantizationParameters(ByteBuffer byteBuffer, QuantizationParameters quantizationParameters) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return quantizationParameters.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startZeroPointVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(8, i11, 8);
    }

    public Table details(Table table) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __union(table, i__offset + this.bb_pos);
        }
        return null;
    }

    public byte detailsType() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public FloatVector maxVector(FloatVector floatVector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return floatVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public FloatVector minVector(FloatVector floatVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return floatVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public int quantizedDimension() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public float scale(int i11) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(__vector(i__offset) + (i11 * 4));
        }
        return 0.0f;
    }

    public ByteBuffer scaleAsByteBuffer() {
        return __vector_as_bytebuffer(8, 4);
    }

    public ByteBuffer scaleInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 4);
    }

    public int scaleLength() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public FloatVector scaleVector(FloatVector floatVector) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return floatVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public QuantizationParametersT unpack() {
        QuantizationParametersT quantizationParametersT = new QuantizationParametersT();
        unpackTo(quantizationParametersT);
        return quantizationParametersT;
    }

    public long zeroPoint(int i11) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f12714bb.getLong(__vector(i__offset) + (i11 * 8));
        }
        return 0L;
    }

    public ByteBuffer zeroPointAsByteBuffer() {
        return __vector_as_bytebuffer(10, 8);
    }

    public ByteBuffer zeroPointInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 10, 8);
    }

    public int zeroPointLength() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public LongVector zeroPointVector(LongVector longVector) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return longVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endQuantizationParameters(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public QuantizationParameters __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(QuantizationParametersT quantizationParametersT) {
        CustomQuantizationT customQuantizationTUnpack;
        float[] fArr = new float[minLength()];
        for (int i11 = 0; i11 < minLength(); i11++) {
            fArr[i11] = min(i11);
        }
        quantizationParametersT.setMin(fArr);
        float[] fArr2 = new float[maxLength()];
        for (int i12 = 0; i12 < maxLength(); i12++) {
            fArr2[i12] = max(i12);
        }
        quantizationParametersT.setMax(fArr2);
        float[] fArr3 = new float[scaleLength()];
        for (int i13 = 0; i13 < scaleLength(); i13++) {
            fArr3[i13] = scale(i13);
        }
        quantizationParametersT.setScale(fArr3);
        long[] jArr = new long[zeroPointLength()];
        for (int i14 = 0; i14 < zeroPointLength(); i14++) {
            jArr[i14] = zeroPoint(i14);
        }
        quantizationParametersT.setZeroPoint(jArr);
        QuantizationDetailsUnion quantizationDetailsUnion = new QuantizationDetailsUnion();
        byte bDetailsType = detailsType();
        quantizationDetailsUnion.setType(bDetailsType);
        if (bDetailsType == 1) {
            Table tableDetails = details(new CustomQuantization());
            if (tableDetails != null) {
                customQuantizationTUnpack = ((CustomQuantization) tableDetails).unpack();
            } else {
                customQuantizationTUnpack = null;
            }
            quantizationDetailsUnion.setValue(customQuantizationTUnpack);
        }
        quantizationParametersT.setDetails(quantizationDetailsUnion);
        quantizationParametersT.setQuantizedDimension(quantizedDimension());
    }
}
