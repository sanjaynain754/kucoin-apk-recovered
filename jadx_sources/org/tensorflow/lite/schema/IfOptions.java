package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class IfOptions extends Table {

    public static final class Vector extends BaseVector {
        public IfOptions get(int i11) {
            return get(new IfOptions(), i11);
        }

        public IfOptions get(IfOptions ifOptions, int i11) {
            return ifOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addElseSubgraphIndex(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(1, i11, 0);
    }

    public static void addThenSubgraphIndex(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createIfOptions(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addElseSubgraphIndex(flatBufferBuilder, i12);
        addThenSubgraphIndex(flatBufferBuilder, i11);
        return endIfOptions(flatBufferBuilder);
    }

    public static IfOptions getRootAsIfOptions(ByteBuffer byteBuffer) {
        return getRootAsIfOptions(byteBuffer, new IfOptions());
    }

    public static void startIfOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public int elseSubgraphIndex() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int thenSubgraphIndex() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static IfOptions getRootAsIfOptions(ByteBuffer byteBuffer, IfOptions ifOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return ifOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, IfOptionsT ifOptionsT) {
        if (ifOptionsT == null) {
            return 0;
        }
        return createIfOptions(flatBufferBuilder, ifOptionsT.getThenSubgraphIndex(), ifOptionsT.getElseSubgraphIndex());
    }

    public IfOptionsT unpack() {
        IfOptionsT ifOptionsT = new IfOptionsT();
        unpackTo(ifOptionsT);
        return ifOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endIfOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public IfOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(IfOptionsT ifOptionsT) {
        ifOptionsT.setThenSubgraphIndex(thenSubgraphIndex());
        ifOptionsT.setElseSubgraphIndex(elseSubgraphIndex());
    }
}
