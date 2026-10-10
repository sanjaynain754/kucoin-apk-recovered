package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ScatterNdOptions extends Table {

    public static final class Vector extends BaseVector {
        public ScatterNdOptions get(int i11) {
            return get(new ScatterNdOptions(), i11);
        }

        public ScatterNdOptions get(ScatterNdOptions scatterNdOptions, int i11) {
            return scatterNdOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static ScatterNdOptions getRootAsScatterNdOptions(ByteBuffer byteBuffer) {
        return getRootAsScatterNdOptions(byteBuffer, new ScatterNdOptions());
    }

    public static void startScatterNdOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static ScatterNdOptions getRootAsScatterNdOptions(ByteBuffer byteBuffer, ScatterNdOptions scatterNdOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return scatterNdOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ScatterNdOptionsT scatterNdOptionsT) {
        if (scatterNdOptionsT == null) {
            return 0;
        }
        startScatterNdOptions(flatBufferBuilder);
        return endScatterNdOptions(flatBufferBuilder);
    }

    public ScatterNdOptionsT unpack() {
        ScatterNdOptionsT scatterNdOptionsT = new ScatterNdOptionsT();
        unpackTo(scatterNdOptionsT);
        return scatterNdOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endScatterNdOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ScatterNdOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ScatterNdOptionsT scatterNdOptionsT) {
    }
}
