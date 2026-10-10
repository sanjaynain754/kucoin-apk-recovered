package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class BroadcastToOptions extends Table {

    public static final class Vector extends BaseVector {
        public BroadcastToOptions get(int i11) {
            return get(new BroadcastToOptions(), i11);
        }

        public BroadcastToOptions get(BroadcastToOptions broadcastToOptions, int i11) {
            return broadcastToOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static BroadcastToOptions getRootAsBroadcastToOptions(ByteBuffer byteBuffer) {
        return getRootAsBroadcastToOptions(byteBuffer, new BroadcastToOptions());
    }

    public static void startBroadcastToOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static BroadcastToOptions getRootAsBroadcastToOptions(ByteBuffer byteBuffer, BroadcastToOptions broadcastToOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return broadcastToOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, BroadcastToOptionsT broadcastToOptionsT) {
        if (broadcastToOptionsT == null) {
            return 0;
        }
        startBroadcastToOptions(flatBufferBuilder);
        return endBroadcastToOptions(flatBufferBuilder);
    }

    public BroadcastToOptionsT unpack() {
        BroadcastToOptionsT broadcastToOptionsT = new BroadcastToOptionsT();
        unpackTo(broadcastToOptionsT);
        return broadcastToOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endBroadcastToOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public BroadcastToOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(BroadcastToOptionsT broadcastToOptionsT) {
    }
}
