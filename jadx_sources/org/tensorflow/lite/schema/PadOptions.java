package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class PadOptions extends Table {

    public static final class Vector extends BaseVector {
        public PadOptions get(int i11) {
            return get(new PadOptions(), i11);
        }

        public PadOptions get(PadOptions padOptions, int i11) {
            return padOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static PadOptions getRootAsPadOptions(ByteBuffer byteBuffer) {
        return getRootAsPadOptions(byteBuffer, new PadOptions());
    }

    public static void startPadOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static PadOptions getRootAsPadOptions(ByteBuffer byteBuffer, PadOptions padOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return padOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, PadOptionsT padOptionsT) {
        if (padOptionsT == null) {
            return 0;
        }
        startPadOptions(flatBufferBuilder);
        return endPadOptions(flatBufferBuilder);
    }

    public PadOptionsT unpack() {
        PadOptionsT padOptionsT = new PadOptionsT();
        unpackTo(padOptionsT);
        return padOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endPadOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public PadOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(PadOptionsT padOptionsT) {
    }
}
