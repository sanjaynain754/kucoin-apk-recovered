package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class LogicalAndOptions extends Table {

    public static final class Vector extends BaseVector {
        public LogicalAndOptions get(int i11) {
            return get(new LogicalAndOptions(), i11);
        }

        public LogicalAndOptions get(LogicalAndOptions logicalAndOptions, int i11) {
            return logicalAndOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static LogicalAndOptions getRootAsLogicalAndOptions(ByteBuffer byteBuffer) {
        return getRootAsLogicalAndOptions(byteBuffer, new LogicalAndOptions());
    }

    public static void startLogicalAndOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static LogicalAndOptions getRootAsLogicalAndOptions(ByteBuffer byteBuffer, LogicalAndOptions logicalAndOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return logicalAndOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, LogicalAndOptionsT logicalAndOptionsT) {
        if (logicalAndOptionsT == null) {
            return 0;
        }
        startLogicalAndOptions(flatBufferBuilder);
        return endLogicalAndOptions(flatBufferBuilder);
    }

    public LogicalAndOptionsT unpack() {
        LogicalAndOptionsT logicalAndOptionsT = new LogicalAndOptionsT();
        unpackTo(logicalAndOptionsT);
        return logicalAndOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endLogicalAndOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public LogicalAndOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(LogicalAndOptionsT logicalAndOptionsT) {
    }
}
