package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class RankOptions extends Table {

    public static final class Vector extends BaseVector {
        public RankOptions get(int i11) {
            return get(new RankOptions(), i11);
        }

        public RankOptions get(RankOptions rankOptions, int i11) {
            return rankOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static RankOptions getRootAsRankOptions(ByteBuffer byteBuffer) {
        return getRootAsRankOptions(byteBuffer, new RankOptions());
    }

    public static void startRankOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static RankOptions getRootAsRankOptions(ByteBuffer byteBuffer, RankOptions rankOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return rankOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, RankOptionsT rankOptionsT) {
        if (rankOptionsT == null) {
            return 0;
        }
        startRankOptions(flatBufferBuilder);
        return endRankOptions(flatBufferBuilder);
    }

    public RankOptionsT unpack() {
        RankOptionsT rankOptionsT = new RankOptionsT();
        unpackTo(rankOptionsT);
        return rankOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endRankOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public RankOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(RankOptionsT rankOptionsT) {
    }
}
