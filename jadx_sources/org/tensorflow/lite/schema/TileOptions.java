package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class TileOptions extends Table {

    public static final class Vector extends BaseVector {
        public TileOptions get(int i11) {
            return get(new TileOptions(), i11);
        }

        public TileOptions get(TileOptions tileOptions, int i11) {
            return tileOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static TileOptions getRootAsTileOptions(ByteBuffer byteBuffer) {
        return getRootAsTileOptions(byteBuffer, new TileOptions());
    }

    public static void startTileOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static TileOptions getRootAsTileOptions(ByteBuffer byteBuffer, TileOptions tileOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tileOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, TileOptionsT tileOptionsT) {
        if (tileOptionsT == null) {
            return 0;
        }
        startTileOptions(flatBufferBuilder);
        return endTileOptions(flatBufferBuilder);
    }

    public TileOptionsT unpack() {
        TileOptionsT tileOptionsT = new TileOptionsT();
        unpackTo(tileOptionsT);
        return tileOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endTileOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public TileOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(TileOptionsT tileOptionsT) {
    }
}
