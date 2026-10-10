package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class QuantizeOptions extends Table {

    public static final class Vector extends BaseVector {
        public QuantizeOptions get(int i11) {
            return get(new QuantizeOptions(), i11);
        }

        public QuantizeOptions get(QuantizeOptions quantizeOptions, int i11) {
            return quantizeOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static QuantizeOptions getRootAsQuantizeOptions(ByteBuffer byteBuffer) {
        return getRootAsQuantizeOptions(byteBuffer, new QuantizeOptions());
    }

    public static void startQuantizeOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static QuantizeOptions getRootAsQuantizeOptions(ByteBuffer byteBuffer, QuantizeOptions quantizeOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return quantizeOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, QuantizeOptionsT quantizeOptionsT) {
        if (quantizeOptionsT == null) {
            return 0;
        }
        startQuantizeOptions(flatBufferBuilder);
        return endQuantizeOptions(flatBufferBuilder);
    }

    public QuantizeOptionsT unpack() {
        QuantizeOptionsT quantizeOptionsT = new QuantizeOptionsT();
        unpackTo(quantizeOptionsT);
        return quantizeOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endQuantizeOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public QuantizeOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(QuantizeOptionsT quantizeOptionsT) {
    }
}
