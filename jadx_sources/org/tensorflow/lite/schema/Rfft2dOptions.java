package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class Rfft2dOptions extends Table {

    public static final class Vector extends BaseVector {
        public Rfft2dOptions get(int i11) {
            return get(new Rfft2dOptions(), i11);
        }

        public Rfft2dOptions get(Rfft2dOptions rfft2dOptions, int i11) {
            return rfft2dOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static Rfft2dOptions getRootAsRfft2dOptions(ByteBuffer byteBuffer) {
        return getRootAsRfft2dOptions(byteBuffer, new Rfft2dOptions());
    }

    public static void startRfft2dOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static Rfft2dOptions getRootAsRfft2dOptions(ByteBuffer byteBuffer, Rfft2dOptions rfft2dOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return rfft2dOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, Rfft2dOptionsT rfft2dOptionsT) {
        if (rfft2dOptionsT == null) {
            return 0;
        }
        startRfft2dOptions(flatBufferBuilder);
        return endRfft2dOptions(flatBufferBuilder);
    }

    public Rfft2dOptionsT unpack() {
        Rfft2dOptionsT rfft2dOptionsT = new Rfft2dOptionsT();
        unpackTo(rfft2dOptionsT);
        return rfft2dOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endRfft2dOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public Rfft2dOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(Rfft2dOptionsT rfft2dOptionsT) {
    }
}
