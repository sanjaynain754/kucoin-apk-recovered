package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SpaceToBatchNDOptions extends Table {

    public static final class Vector extends BaseVector {
        public SpaceToBatchNDOptions get(int i11) {
            return get(new SpaceToBatchNDOptions(), i11);
        }

        public SpaceToBatchNDOptions get(SpaceToBatchNDOptions spaceToBatchNDOptions, int i11) {
            return spaceToBatchNDOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static SpaceToBatchNDOptions getRootAsSpaceToBatchNDOptions(ByteBuffer byteBuffer) {
        return getRootAsSpaceToBatchNDOptions(byteBuffer, new SpaceToBatchNDOptions());
    }

    public static void startSpaceToBatchNDOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static SpaceToBatchNDOptions getRootAsSpaceToBatchNDOptions(ByteBuffer byteBuffer, SpaceToBatchNDOptions spaceToBatchNDOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return spaceToBatchNDOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SpaceToBatchNDOptionsT spaceToBatchNDOptionsT) {
        if (spaceToBatchNDOptionsT == null) {
            return 0;
        }
        startSpaceToBatchNDOptions(flatBufferBuilder);
        return endSpaceToBatchNDOptions(flatBufferBuilder);
    }

    public SpaceToBatchNDOptionsT unpack() {
        SpaceToBatchNDOptionsT spaceToBatchNDOptionsT = new SpaceToBatchNDOptionsT();
        unpackTo(spaceToBatchNDOptionsT);
        return spaceToBatchNDOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSpaceToBatchNDOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SpaceToBatchNDOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SpaceToBatchNDOptionsT spaceToBatchNDOptionsT) {
    }
}
