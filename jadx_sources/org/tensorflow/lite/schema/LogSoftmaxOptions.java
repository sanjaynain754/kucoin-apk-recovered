package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class LogSoftmaxOptions extends Table {

    public static final class Vector extends BaseVector {
        public LogSoftmaxOptions get(int i11) {
            return get(new LogSoftmaxOptions(), i11);
        }

        public LogSoftmaxOptions get(LogSoftmaxOptions logSoftmaxOptions, int i11) {
            return logSoftmaxOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static LogSoftmaxOptions getRootAsLogSoftmaxOptions(ByteBuffer byteBuffer) {
        return getRootAsLogSoftmaxOptions(byteBuffer, new LogSoftmaxOptions());
    }

    public static void startLogSoftmaxOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static LogSoftmaxOptions getRootAsLogSoftmaxOptions(ByteBuffer byteBuffer, LogSoftmaxOptions logSoftmaxOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return logSoftmaxOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, LogSoftmaxOptionsT logSoftmaxOptionsT) {
        if (logSoftmaxOptionsT == null) {
            return 0;
        }
        startLogSoftmaxOptions(flatBufferBuilder);
        return endLogSoftmaxOptions(flatBufferBuilder);
    }

    public LogSoftmaxOptionsT unpack() {
        LogSoftmaxOptionsT logSoftmaxOptionsT = new LogSoftmaxOptionsT();
        unpackTo(logSoftmaxOptionsT);
        return logSoftmaxOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endLogSoftmaxOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public LogSoftmaxOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(LogSoftmaxOptionsT logSoftmaxOptionsT) {
    }
}
