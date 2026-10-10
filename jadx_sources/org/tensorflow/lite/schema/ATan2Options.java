package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ATan2Options extends Table {

    public static final class Vector extends BaseVector {
        public ATan2Options get(int i11) {
            return get(new ATan2Options(), i11);
        }

        public ATan2Options get(ATan2Options aTan2Options, int i11) {
            return aTan2Options.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static ATan2Options getRootAsATan2Options(ByteBuffer byteBuffer) {
        return getRootAsATan2Options(byteBuffer, new ATan2Options());
    }

    public static void startATan2Options(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static ATan2Options getRootAsATan2Options(ByteBuffer byteBuffer, ATan2Options aTan2Options) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return aTan2Options.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ATan2OptionsT aTan2OptionsT) {
        if (aTan2OptionsT == null) {
            return 0;
        }
        startATan2Options(flatBufferBuilder);
        return endATan2Options(flatBufferBuilder);
    }

    public ATan2OptionsT unpack() {
        ATan2OptionsT aTan2OptionsT = new ATan2OptionsT();
        unpackTo(aTan2OptionsT);
        return aTan2OptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endATan2Options(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ATan2Options __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ATan2OptionsT aTan2OptionsT) {
    }
}
