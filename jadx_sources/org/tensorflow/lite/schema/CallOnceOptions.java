package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class CallOnceOptions extends Table {

    public static final class Vector extends BaseVector {
        public CallOnceOptions get(int i11) {
            return get(new CallOnceOptions(), i11);
        }

        public CallOnceOptions get(CallOnceOptions callOnceOptions, int i11) {
            return callOnceOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addInitSubgraphIndex(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createCallOnceOptions(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addInitSubgraphIndex(flatBufferBuilder, i11);
        return endCallOnceOptions(flatBufferBuilder);
    }

    public static CallOnceOptions getRootAsCallOnceOptions(ByteBuffer byteBuffer) {
        return getRootAsCallOnceOptions(byteBuffer, new CallOnceOptions());
    }

    public static void startCallOnceOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public int initSubgraphIndex() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static CallOnceOptions getRootAsCallOnceOptions(ByteBuffer byteBuffer, CallOnceOptions callOnceOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return callOnceOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, CallOnceOptionsT callOnceOptionsT) {
        if (callOnceOptionsT == null) {
            return 0;
        }
        return createCallOnceOptions(flatBufferBuilder, callOnceOptionsT.getInitSubgraphIndex());
    }

    public CallOnceOptionsT unpack() {
        CallOnceOptionsT callOnceOptionsT = new CallOnceOptionsT();
        unpackTo(callOnceOptionsT);
        return callOnceOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endCallOnceOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public CallOnceOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(CallOnceOptionsT callOnceOptionsT) {
        callOnceOptionsT.setInitSubgraphIndex(initSubgraphIndex());
    }
}
