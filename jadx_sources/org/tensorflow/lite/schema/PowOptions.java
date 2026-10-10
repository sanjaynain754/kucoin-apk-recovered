package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class PowOptions extends Table {

    public static final class Vector extends BaseVector {
        public PowOptions get(int i11) {
            return get(new PowOptions(), i11);
        }

        public PowOptions get(PowOptions powOptions, int i11) {
            return powOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static PowOptions getRootAsPowOptions(ByteBuffer byteBuffer) {
        return getRootAsPowOptions(byteBuffer, new PowOptions());
    }

    public static void startPowOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static PowOptions getRootAsPowOptions(ByteBuffer byteBuffer, PowOptions powOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return powOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, PowOptionsT powOptionsT) {
        if (powOptionsT == null) {
            return 0;
        }
        startPowOptions(flatBufferBuilder);
        return endPowOptions(flatBufferBuilder);
    }

    public PowOptionsT unpack() {
        PowOptionsT powOptionsT = new PowOptionsT();
        unpackTo(powOptionsT);
        return powOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endPowOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public PowOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(PowOptionsT powOptionsT) {
    }
}
