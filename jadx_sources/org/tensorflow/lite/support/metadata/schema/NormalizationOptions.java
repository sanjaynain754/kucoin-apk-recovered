package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class NormalizationOptions extends Table {

    public static final class Vector extends BaseVector {
        public NormalizationOptions get(int i11) {
            return get(new NormalizationOptions(), i11);
        }

        public NormalizationOptions get(NormalizationOptions normalizationOptions, int i11) {
            return normalizationOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addMean(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addStd(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static int createMeanVector(FlatBufferBuilder flatBufferBuilder, float[] fArr) {
        flatBufferBuilder.startVector(4, fArr.length, 4);
        for (int length = fArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addFloat(fArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createNormalizationOptions(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addStd(flatBufferBuilder, i12);
        addMean(flatBufferBuilder, i11);
        return endNormalizationOptions(flatBufferBuilder);
    }

    public static int createStdVector(FlatBufferBuilder flatBufferBuilder, float[] fArr) {
        flatBufferBuilder.startVector(4, fArr.length, 4);
        for (int length = fArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addFloat(fArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static NormalizationOptions getRootAsNormalizationOptions(ByteBuffer byteBuffer) {
        return getRootAsNormalizationOptions(byteBuffer, new NormalizationOptions());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, NormalizationOptionsT normalizationOptionsT) {
        if (normalizationOptionsT == null) {
            return 0;
        }
        return createNormalizationOptions(flatBufferBuilder, normalizationOptionsT.getMean() != null ? createMeanVector(flatBufferBuilder, normalizationOptionsT.getMean()) : 0, normalizationOptionsT.getStd() != null ? createStdVector(flatBufferBuilder, normalizationOptionsT.getStd()) : 0);
    }

    public static void startMeanVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startNormalizationOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public static void startStdVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public float mean(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(__vector(i__offset) + (i11 * 4));
        }
        return 0.0f;
    }

    public ByteBuffer meanAsByteBuffer() {
        return __vector_as_bytebuffer(4, 4);
    }

    public ByteBuffer meanInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 4);
    }

    public int meanLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public FloatVector meanVector() {
        return meanVector(new FloatVector());
    }

    public float std(int i11) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(__vector(i__offset) + (i11 * 4));
        }
        return 0.0f;
    }

    public ByteBuffer stdAsByteBuffer() {
        return __vector_as_bytebuffer(6, 4);
    }

    public ByteBuffer stdInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 4);
    }

    public int stdLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public FloatVector stdVector() {
        return stdVector(new FloatVector());
    }

    public static NormalizationOptions getRootAsNormalizationOptions(ByteBuffer byteBuffer, NormalizationOptions normalizationOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return normalizationOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public FloatVector meanVector(FloatVector floatVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return floatVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public FloatVector stdVector(FloatVector floatVector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return floatVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public NormalizationOptionsT unpack() {
        NormalizationOptionsT normalizationOptionsT = new NormalizationOptionsT();
        unpackTo(normalizationOptionsT);
        return normalizationOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endNormalizationOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public NormalizationOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(NormalizationOptionsT normalizationOptionsT) {
        float[] fArr = new float[meanLength()];
        for (int i11 = 0; i11 < meanLength(); i11++) {
            fArr[i11] = mean(i11);
        }
        normalizationOptionsT.setMean(fArr);
        float[] fArr2 = new float[stdLength()];
        for (int i12 = 0; i12 < stdLength(); i12++) {
            fArr2[i12] = std(i12);
        }
        normalizationOptionsT.setStd(fArr2);
    }
}
