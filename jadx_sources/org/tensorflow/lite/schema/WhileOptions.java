package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class WhileOptions extends Table {

    public static final class Vector extends BaseVector {
        public WhileOptions get(int i11) {
            return get(new WhileOptions(), i11);
        }

        public WhileOptions get(WhileOptions whileOptions, int i11) {
            return whileOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addBodySubgraphIndex(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(1, i11, 0);
    }

    public static void addCondSubgraphIndex(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createWhileOptions(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addBodySubgraphIndex(flatBufferBuilder, i12);
        addCondSubgraphIndex(flatBufferBuilder, i11);
        return endWhileOptions(flatBufferBuilder);
    }

    public static WhileOptions getRootAsWhileOptions(ByteBuffer byteBuffer) {
        return getRootAsWhileOptions(byteBuffer, new WhileOptions());
    }

    public static void startWhileOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public int bodySubgraphIndex() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int condSubgraphIndex() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static WhileOptions getRootAsWhileOptions(ByteBuffer byteBuffer, WhileOptions whileOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return whileOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, WhileOptionsT whileOptionsT) {
        if (whileOptionsT == null) {
            return 0;
        }
        return createWhileOptions(flatBufferBuilder, whileOptionsT.getCondSubgraphIndex(), whileOptionsT.getBodySubgraphIndex());
    }

    public WhileOptionsT unpack() {
        WhileOptionsT whileOptionsT = new WhileOptionsT();
        unpackTo(whileOptionsT);
        return whileOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endWhileOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public WhileOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(WhileOptionsT whileOptionsT) {
        whileOptionsT.setCondSubgraphIndex(condSubgraphIndex());
        whileOptionsT.setBodySubgraphIndex(bodySubgraphIndex());
    }
}
