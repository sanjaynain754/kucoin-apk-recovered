package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class FloorModOptions extends Table {

    public static final class Vector extends BaseVector {
        public FloorModOptions get(int i11) {
            return get(new FloorModOptions(), i11);
        }

        public FloorModOptions get(FloorModOptions floorModOptions, int i11) {
            return floorModOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static FloorModOptions getRootAsFloorModOptions(ByteBuffer byteBuffer) {
        return getRootAsFloorModOptions(byteBuffer, new FloorModOptions());
    }

    public static void startFloorModOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static FloorModOptions getRootAsFloorModOptions(ByteBuffer byteBuffer, FloorModOptions floorModOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return floorModOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, FloorModOptionsT floorModOptionsT) {
        if (floorModOptionsT == null) {
            return 0;
        }
        startFloorModOptions(flatBufferBuilder);
        return endFloorModOptions(flatBufferBuilder);
    }

    public FloorModOptionsT unpack() {
        FloorModOptionsT floorModOptionsT = new FloorModOptionsT();
        unpackTo(floorModOptionsT);
        return floorModOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endFloorModOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public FloorModOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(FloorModOptionsT floorModOptionsT) {
    }
}
