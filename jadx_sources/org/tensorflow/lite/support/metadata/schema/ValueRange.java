package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ValueRange extends Table {

    public static final class Vector extends BaseVector {
        public ValueRange get(int i11) {
            return get(new ValueRange(), i11);
        }

        public ValueRange get(ValueRange valueRange, int i11) {
            return valueRange.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addMax(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(1, i11, 0);
    }

    public static void addMin(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createValueRange(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addMax(flatBufferBuilder, i12);
        addMin(flatBufferBuilder, i11);
        return endValueRange(flatBufferBuilder);
    }

    public static ValueRange getRootAsValueRange(ByteBuffer byteBuffer) {
        return getRootAsValueRange(byteBuffer, new ValueRange());
    }

    public static void startValueRange(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public int max() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int min() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static ValueRange getRootAsValueRange(ByteBuffer byteBuffer, ValueRange valueRange) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return valueRange.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ValueRangeT valueRangeT) {
        if (valueRangeT == null) {
            return 0;
        }
        return createValueRange(flatBufferBuilder, valueRangeT.getMin(), valueRangeT.getMax());
    }

    public ValueRangeT unpack() {
        ValueRangeT valueRangeT = new ValueRangeT();
        unpackTo(valueRangeT);
        return valueRangeT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endValueRange(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ValueRange __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ValueRangeT valueRangeT) {
        valueRangeT.setMin(min());
        valueRangeT.setMax(max());
    }
}
