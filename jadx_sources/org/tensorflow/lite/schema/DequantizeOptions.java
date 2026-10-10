package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class DequantizeOptions extends Table {

    public static final class Vector extends BaseVector {
        public DequantizeOptions get(int i11) {
            return get(new DequantizeOptions(), i11);
        }

        public DequantizeOptions get(DequantizeOptions dequantizeOptions, int i11) {
            return dequantizeOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static DequantizeOptions getRootAsDequantizeOptions(ByteBuffer byteBuffer) {
        return getRootAsDequantizeOptions(byteBuffer, new DequantizeOptions());
    }

    public static void startDequantizeOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static DequantizeOptions getRootAsDequantizeOptions(ByteBuffer byteBuffer, DequantizeOptions dequantizeOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return dequantizeOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, DequantizeOptionsT dequantizeOptionsT) {
        if (dequantizeOptionsT == null) {
            return 0;
        }
        startDequantizeOptions(flatBufferBuilder);
        return endDequantizeOptions(flatBufferBuilder);
    }

    public DequantizeOptionsT unpack() {
        DequantizeOptionsT dequantizeOptionsT = new DequantizeOptionsT();
        unpackTo(dequantizeOptionsT);
        return dequantizeOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endDequantizeOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public DequantizeOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(DequantizeOptionsT dequantizeOptionsT) {
    }
}
