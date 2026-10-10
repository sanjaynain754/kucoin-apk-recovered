package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class GatherNdOptions extends Table {

    public static final class Vector extends BaseVector {
        public GatherNdOptions get(int i11) {
            return get(new GatherNdOptions(), i11);
        }

        public GatherNdOptions get(GatherNdOptions gatherNdOptions, int i11) {
            return gatherNdOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static GatherNdOptions getRootAsGatherNdOptions(ByteBuffer byteBuffer) {
        return getRootAsGatherNdOptions(byteBuffer, new GatherNdOptions());
    }

    public static void startGatherNdOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static GatherNdOptions getRootAsGatherNdOptions(ByteBuffer byteBuffer, GatherNdOptions gatherNdOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return gatherNdOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, GatherNdOptionsT gatherNdOptionsT) {
        if (gatherNdOptionsT == null) {
            return 0;
        }
        startGatherNdOptions(flatBufferBuilder);
        return endGatherNdOptions(flatBufferBuilder);
    }

    public GatherNdOptionsT unpack() {
        GatherNdOptionsT gatherNdOptionsT = new GatherNdOptionsT();
        unpackTo(gatherNdOptionsT);
        return gatherNdOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endGatherNdOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public GatherNdOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(GatherNdOptionsT gatherNdOptionsT) {
    }
}
