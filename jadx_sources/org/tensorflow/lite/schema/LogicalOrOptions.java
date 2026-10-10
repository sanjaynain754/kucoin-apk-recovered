package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class LogicalOrOptions extends Table {

    public static final class Vector extends BaseVector {
        public LogicalOrOptions get(int i11) {
            return get(new LogicalOrOptions(), i11);
        }

        public LogicalOrOptions get(LogicalOrOptions logicalOrOptions, int i11) {
            return logicalOrOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static LogicalOrOptions getRootAsLogicalOrOptions(ByteBuffer byteBuffer) {
        return getRootAsLogicalOrOptions(byteBuffer, new LogicalOrOptions());
    }

    public static void startLogicalOrOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static LogicalOrOptions getRootAsLogicalOrOptions(ByteBuffer byteBuffer, LogicalOrOptions logicalOrOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return logicalOrOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, LogicalOrOptionsT logicalOrOptionsT) {
        if (logicalOrOptionsT == null) {
            return 0;
        }
        startLogicalOrOptions(flatBufferBuilder);
        return endLogicalOrOptions(flatBufferBuilder);
    }

    public LogicalOrOptionsT unpack() {
        LogicalOrOptionsT logicalOrOptionsT = new LogicalOrOptionsT();
        unpackTo(logicalOrOptionsT);
        return logicalOrOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endLogicalOrOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public LogicalOrOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(LogicalOrOptionsT logicalOrOptionsT) {
    }
}
