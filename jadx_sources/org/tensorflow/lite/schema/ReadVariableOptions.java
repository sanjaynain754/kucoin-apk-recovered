package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ReadVariableOptions extends Table {

    public static final class Vector extends BaseVector {
        public ReadVariableOptions get(int i11) {
            return get(new ReadVariableOptions(), i11);
        }

        public ReadVariableOptions get(ReadVariableOptions readVariableOptions, int i11) {
            return readVariableOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static ReadVariableOptions getRootAsReadVariableOptions(ByteBuffer byteBuffer) {
        return getRootAsReadVariableOptions(byteBuffer, new ReadVariableOptions());
    }

    public static void startReadVariableOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static ReadVariableOptions getRootAsReadVariableOptions(ByteBuffer byteBuffer, ReadVariableOptions readVariableOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return readVariableOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ReadVariableOptionsT readVariableOptionsT) {
        if (readVariableOptionsT == null) {
            return 0;
        }
        startReadVariableOptions(flatBufferBuilder);
        return endReadVariableOptions(flatBufferBuilder);
    }

    public ReadVariableOptionsT unpack() {
        ReadVariableOptionsT readVariableOptionsT = new ReadVariableOptionsT();
        unpackTo(readVariableOptionsT);
        return readVariableOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endReadVariableOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ReadVariableOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ReadVariableOptionsT readVariableOptionsT) {
    }
}
