package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class PadV2Options extends Table {

    public static final class Vector extends BaseVector {
        public PadV2Options get(int i11) {
            return get(new PadV2Options(), i11);
        }

        public PadV2Options get(PadV2Options padV2Options, int i11) {
            return padV2Options.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static PadV2Options getRootAsPadV2Options(ByteBuffer byteBuffer) {
        return getRootAsPadV2Options(byteBuffer, new PadV2Options());
    }

    public static void startPadV2Options(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static PadV2Options getRootAsPadV2Options(ByteBuffer byteBuffer, PadV2Options padV2Options) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return padV2Options.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, PadV2OptionsT padV2OptionsT) {
        if (padV2OptionsT == null) {
            return 0;
        }
        startPadV2Options(flatBufferBuilder);
        return endPadV2Options(flatBufferBuilder);
    }

    public PadV2OptionsT unpack() {
        PadV2OptionsT padV2OptionsT = new PadV2OptionsT();
        unpackTo(padV2OptionsT);
        return padV2OptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endPadV2Options(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public PadV2Options __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(PadV2OptionsT padV2OptionsT) {
    }
}
