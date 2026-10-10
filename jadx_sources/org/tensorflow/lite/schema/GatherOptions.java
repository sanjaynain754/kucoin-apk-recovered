package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class GatherOptions extends Table {

    public static final class Vector extends BaseVector {
        public GatherOptions get(int i11) {
            return get(new GatherOptions(), i11);
        }

        public GatherOptions get(GatherOptions gatherOptions, int i11) {
            return gatherOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAxis(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static void addBatchDims(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(1, i11, 0);
    }

    public static int createGatherOptions(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addBatchDims(flatBufferBuilder, i12);
        addAxis(flatBufferBuilder, i11);
        return endGatherOptions(flatBufferBuilder);
    }

    public static GatherOptions getRootAsGatherOptions(ByteBuffer byteBuffer) {
        return getRootAsGatherOptions(byteBuffer, new GatherOptions());
    }

    public static void startGatherOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public int axis() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int batchDims() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static GatherOptions getRootAsGatherOptions(ByteBuffer byteBuffer, GatherOptions gatherOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return gatherOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, GatherOptionsT gatherOptionsT) {
        if (gatherOptionsT == null) {
            return 0;
        }
        return createGatherOptions(flatBufferBuilder, gatherOptionsT.getAxis(), gatherOptionsT.getBatchDims());
    }

    public GatherOptionsT unpack() {
        GatherOptionsT gatherOptionsT = new GatherOptionsT();
        unpackTo(gatherOptionsT);
        return gatherOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endGatherOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public GatherOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(GatherOptionsT gatherOptionsT) {
        gatherOptionsT.setAxis(axis());
        gatherOptionsT.setBatchDims(batchDims());
    }
}
