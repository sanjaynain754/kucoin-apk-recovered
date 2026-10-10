package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ReducerOptions extends Table {

    public static final class Vector extends BaseVector {
        public ReducerOptions get(int i11) {
            return get(new ReducerOptions(), i11);
        }

        public ReducerOptions get(ReducerOptions reducerOptions, int i11) {
            return reducerOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addKeepDims(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(0, z11, false);
    }

    public static int createReducerOptions(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.startTable(1);
        addKeepDims(flatBufferBuilder, z11);
        return endReducerOptions(flatBufferBuilder);
    }

    public static ReducerOptions getRootAsReducerOptions(ByteBuffer byteBuffer) {
        return getRootAsReducerOptions(byteBuffer, new ReducerOptions());
    }

    public static void startReducerOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public boolean keepDims() {
        int i__offset = __offset(4);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public static ReducerOptions getRootAsReducerOptions(ByteBuffer byteBuffer, ReducerOptions reducerOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return reducerOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ReducerOptionsT reducerOptionsT) {
        if (reducerOptionsT == null) {
            return 0;
        }
        return createReducerOptions(flatBufferBuilder, reducerOptionsT.getKeepDims());
    }

    public ReducerOptionsT unpack() {
        ReducerOptionsT reducerOptionsT = new ReducerOptionsT();
        unpackTo(reducerOptionsT);
        return reducerOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endReducerOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ReducerOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ReducerOptionsT reducerOptionsT) {
        reducerOptionsT.setKeepDims(keepDims());
    }
}
