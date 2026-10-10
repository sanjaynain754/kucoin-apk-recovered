package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class NegOptions extends Table {

    public static final class Vector extends BaseVector {
        public NegOptions get(int i11) {
            return get(new NegOptions(), i11);
        }

        public NegOptions get(NegOptions negOptions, int i11) {
            return negOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static NegOptions getRootAsNegOptions(ByteBuffer byteBuffer) {
        return getRootAsNegOptions(byteBuffer, new NegOptions());
    }

    public static void startNegOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static NegOptions getRootAsNegOptions(ByteBuffer byteBuffer, NegOptions negOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return negOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, NegOptionsT negOptionsT) {
        if (negOptionsT == null) {
            return 0;
        }
        startNegOptions(flatBufferBuilder);
        return endNegOptions(flatBufferBuilder);
    }

    public NegOptionsT unpack() {
        NegOptionsT negOptionsT = new NegOptionsT();
        unpackTo(negOptionsT);
        return negOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endNegOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public NegOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(NegOptionsT negOptionsT) {
    }
}
