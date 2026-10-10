package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class LogicalNotOptions extends Table {

    public static final class Vector extends BaseVector {
        public LogicalNotOptions get(int i11) {
            return get(new LogicalNotOptions(), i11);
        }

        public LogicalNotOptions get(LogicalNotOptions logicalNotOptions, int i11) {
            return logicalNotOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static LogicalNotOptions getRootAsLogicalNotOptions(ByteBuffer byteBuffer) {
        return getRootAsLogicalNotOptions(byteBuffer, new LogicalNotOptions());
    }

    public static void startLogicalNotOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static LogicalNotOptions getRootAsLogicalNotOptions(ByteBuffer byteBuffer, LogicalNotOptions logicalNotOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return logicalNotOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, LogicalNotOptionsT logicalNotOptionsT) {
        if (logicalNotOptionsT == null) {
            return 0;
        }
        startLogicalNotOptions(flatBufferBuilder);
        return endLogicalNotOptions(flatBufferBuilder);
    }

    public LogicalNotOptionsT unpack() {
        LogicalNotOptionsT logicalNotOptionsT = new LogicalNotOptionsT();
        unpackTo(logicalNotOptionsT);
        return logicalNotOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endLogicalNotOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public LogicalNotOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(LogicalNotOptionsT logicalNotOptionsT) {
    }
}
