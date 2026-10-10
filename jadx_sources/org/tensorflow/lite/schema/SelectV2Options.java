package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SelectV2Options extends Table {

    public static final class Vector extends BaseVector {
        public SelectV2Options get(int i11) {
            return get(new SelectV2Options(), i11);
        }

        public SelectV2Options get(SelectV2Options selectV2Options, int i11) {
            return selectV2Options.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static SelectV2Options getRootAsSelectV2Options(ByteBuffer byteBuffer) {
        return getRootAsSelectV2Options(byteBuffer, new SelectV2Options());
    }

    public static void startSelectV2Options(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static SelectV2Options getRootAsSelectV2Options(ByteBuffer byteBuffer, SelectV2Options selectV2Options) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return selectV2Options.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SelectV2OptionsT selectV2OptionsT) {
        if (selectV2OptionsT == null) {
            return 0;
        }
        startSelectV2Options(flatBufferBuilder);
        return endSelectV2Options(flatBufferBuilder);
    }

    public SelectV2OptionsT unpack() {
        SelectV2OptionsT selectV2OptionsT = new SelectV2OptionsT();
        unpackTo(selectV2OptionsT);
        return selectV2OptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSelectV2Options(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SelectV2Options __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SelectV2OptionsT selectV2OptionsT) {
    }
}
