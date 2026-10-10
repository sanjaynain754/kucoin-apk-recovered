package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class DynamicUpdateSliceOptions extends Table {

    public static final class Vector extends BaseVector {
        public DynamicUpdateSliceOptions get(int i11) {
            return get(new DynamicUpdateSliceOptions(), i11);
        }

        public DynamicUpdateSliceOptions get(DynamicUpdateSliceOptions dynamicUpdateSliceOptions, int i11) {
            return dynamicUpdateSliceOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static DynamicUpdateSliceOptions getRootAsDynamicUpdateSliceOptions(ByteBuffer byteBuffer) {
        return getRootAsDynamicUpdateSliceOptions(byteBuffer, new DynamicUpdateSliceOptions());
    }

    public static void startDynamicUpdateSliceOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static DynamicUpdateSliceOptions getRootAsDynamicUpdateSliceOptions(ByteBuffer byteBuffer, DynamicUpdateSliceOptions dynamicUpdateSliceOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return dynamicUpdateSliceOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, DynamicUpdateSliceOptionsT dynamicUpdateSliceOptionsT) {
        if (dynamicUpdateSliceOptionsT == null) {
            return 0;
        }
        startDynamicUpdateSliceOptions(flatBufferBuilder);
        return endDynamicUpdateSliceOptions(flatBufferBuilder);
    }

    public DynamicUpdateSliceOptionsT unpack() {
        DynamicUpdateSliceOptionsT dynamicUpdateSliceOptionsT = new DynamicUpdateSliceOptionsT();
        unpackTo(dynamicUpdateSliceOptionsT);
        return dynamicUpdateSliceOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endDynamicUpdateSliceOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public DynamicUpdateSliceOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(DynamicUpdateSliceOptionsT dynamicUpdateSliceOptionsT) {
    }
}
