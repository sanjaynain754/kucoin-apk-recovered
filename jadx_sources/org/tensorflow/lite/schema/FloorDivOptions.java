package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class FloorDivOptions extends Table {

    public static final class Vector extends BaseVector {
        public FloorDivOptions get(int i11) {
            return get(new FloorDivOptions(), i11);
        }

        public FloorDivOptions get(FloorDivOptions floorDivOptions, int i11) {
            return floorDivOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static FloorDivOptions getRootAsFloorDivOptions(ByteBuffer byteBuffer) {
        return getRootAsFloorDivOptions(byteBuffer, new FloorDivOptions());
    }

    public static void startFloorDivOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static FloorDivOptions getRootAsFloorDivOptions(ByteBuffer byteBuffer, FloorDivOptions floorDivOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return floorDivOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, FloorDivOptionsT floorDivOptionsT) {
        if (floorDivOptionsT == null) {
            return 0;
        }
        startFloorDivOptions(flatBufferBuilder);
        return endFloorDivOptions(flatBufferBuilder);
    }

    public FloorDivOptionsT unpack() {
        FloorDivOptionsT floorDivOptionsT = new FloorDivOptionsT();
        unpackTo(floorDivOptionsT);
        return floorDivOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endFloorDivOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public FloorDivOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(FloorDivOptionsT floorDivOptionsT) {
    }
}
