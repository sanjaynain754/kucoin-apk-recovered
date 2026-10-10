package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class Stats extends Table {

    public static final class Vector extends BaseVector {
        public Stats get(int i11) {
            return get(new Stats(), i11);
        }

        public Stats get(Stats stats, int i11) {
            return stats.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addMax(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addMin(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
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

    public static int createStats(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addMin(flatBufferBuilder, i12);
        addMax(flatBufferBuilder, i11);
        return endStats(flatBufferBuilder);
    }

    public static Stats getRootAsStats(ByteBuffer byteBuffer) {
        return getRootAsStats(byteBuffer, new Stats());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, StatsT statsT) {
        if (statsT == null) {
            return 0;
        }
        return createStats(flatBufferBuilder, statsT.getMax() != null ? createMaxVector(flatBufferBuilder, statsT.getMax()) : 0, statsT.getMin() != null ? createMinVector(flatBufferBuilder, statsT.getMin()) : 0);
    }

    public static void startMaxVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startMinVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startStats(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public float max(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(__vector(i__offset) + (i11 * 4));
        }
        return 0.0f;
    }

    public ByteBuffer maxAsByteBuffer() {
        return __vector_as_bytebuffer(4, 4);
    }

    public ByteBuffer maxInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 4);
    }

    public int maxLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public FloatVector maxVector() {
        return maxVector(new FloatVector());
    }

    public float min(int i11) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(__vector(i__offset) + (i11 * 4));
        }
        return 0.0f;
    }

    public ByteBuffer minAsByteBuffer() {
        return __vector_as_bytebuffer(6, 4);
    }

    public ByteBuffer minInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 4);
    }

    public int minLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public FloatVector minVector() {
        return minVector(new FloatVector());
    }

    public static Stats getRootAsStats(ByteBuffer byteBuffer, Stats stats) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return stats.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public FloatVector maxVector(FloatVector floatVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return floatVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public FloatVector minVector(FloatVector floatVector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return floatVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public StatsT unpack() {
        StatsT statsT = new StatsT();
        unpackTo(statsT);
        return statsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endStats(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public Stats __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(StatsT statsT) {
        float[] fArr = new float[maxLength()];
        for (int i11 = 0; i11 < maxLength(); i11++) {
            fArr[i11] = max(i11);
        }
        statsT.setMax(fArr);
        float[] fArr2 = new float[minLength()];
        for (int i12 = 0; i12 < minLength(); i12++) {
            fArr2[i12] = min(i12);
        }
        statsT.setMin(fArr2);
    }
}
