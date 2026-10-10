package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SpaceToDepthOptions extends Table {

    public static final class Vector extends BaseVector {
        public SpaceToDepthOptions get(int i11) {
            return get(new SpaceToDepthOptions(), i11);
        }

        public SpaceToDepthOptions get(SpaceToDepthOptions spaceToDepthOptions, int i11) {
            return spaceToDepthOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addBlockSize(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createSpaceToDepthOptions(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addBlockSize(flatBufferBuilder, i11);
        return endSpaceToDepthOptions(flatBufferBuilder);
    }

    public static SpaceToDepthOptions getRootAsSpaceToDepthOptions(ByteBuffer byteBuffer) {
        return getRootAsSpaceToDepthOptions(byteBuffer, new SpaceToDepthOptions());
    }

    public static void startSpaceToDepthOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public int blockSize() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static SpaceToDepthOptions getRootAsSpaceToDepthOptions(ByteBuffer byteBuffer, SpaceToDepthOptions spaceToDepthOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return spaceToDepthOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SpaceToDepthOptionsT spaceToDepthOptionsT) {
        if (spaceToDepthOptionsT == null) {
            return 0;
        }
        return createSpaceToDepthOptions(flatBufferBuilder, spaceToDepthOptionsT.getBlockSize());
    }

    public SpaceToDepthOptionsT unpack() {
        SpaceToDepthOptionsT spaceToDepthOptionsT = new SpaceToDepthOptionsT();
        unpackTo(spaceToDepthOptionsT);
        return spaceToDepthOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSpaceToDepthOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SpaceToDepthOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SpaceToDepthOptionsT spaceToDepthOptionsT) {
        spaceToDepthOptionsT.setBlockSize(blockSize());
    }
}
