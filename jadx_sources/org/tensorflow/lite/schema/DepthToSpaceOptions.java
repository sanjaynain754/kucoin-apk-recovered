package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class DepthToSpaceOptions extends Table {

    public static final class Vector extends BaseVector {
        public DepthToSpaceOptions get(int i11) {
            return get(new DepthToSpaceOptions(), i11);
        }

        public DepthToSpaceOptions get(DepthToSpaceOptions depthToSpaceOptions, int i11) {
            return depthToSpaceOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addBlockSize(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createDepthToSpaceOptions(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addBlockSize(flatBufferBuilder, i11);
        return endDepthToSpaceOptions(flatBufferBuilder);
    }

    public static DepthToSpaceOptions getRootAsDepthToSpaceOptions(ByteBuffer byteBuffer) {
        return getRootAsDepthToSpaceOptions(byteBuffer, new DepthToSpaceOptions());
    }

    public static void startDepthToSpaceOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public int blockSize() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static DepthToSpaceOptions getRootAsDepthToSpaceOptions(ByteBuffer byteBuffer, DepthToSpaceOptions depthToSpaceOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return depthToSpaceOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, DepthToSpaceOptionsT depthToSpaceOptionsT) {
        if (depthToSpaceOptionsT == null) {
            return 0;
        }
        return createDepthToSpaceOptions(flatBufferBuilder, depthToSpaceOptionsT.getBlockSize());
    }

    public DepthToSpaceOptionsT unpack() {
        DepthToSpaceOptionsT depthToSpaceOptionsT = new DepthToSpaceOptionsT();
        unpackTo(depthToSpaceOptionsT);
        return depthToSpaceOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endDepthToSpaceOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public DepthToSpaceOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(DepthToSpaceOptionsT depthToSpaceOptionsT) {
        depthToSpaceOptionsT.setBlockSize(blockSize());
    }
}
