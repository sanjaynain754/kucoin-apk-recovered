package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class CallOptions extends Table {

    public static final class Vector extends BaseVector {
        public CallOptions get(int i11) {
            return get(new CallOptions(), i11);
        }

        public CallOptions get(CallOptions callOptions, int i11) {
            return callOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addSubgraph(FlatBufferBuilder flatBufferBuilder, long j11) {
        flatBufferBuilder.addInt(0, (int) j11, 0);
    }

    public static int createCallOptions(FlatBufferBuilder flatBufferBuilder, long j11) {
        flatBufferBuilder.startTable(1);
        addSubgraph(flatBufferBuilder, j11);
        return endCallOptions(flatBufferBuilder);
    }

    public static CallOptions getRootAsCallOptions(ByteBuffer byteBuffer) {
        return getRootAsCallOptions(byteBuffer, new CallOptions());
    }

    public static void startCallOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public long subgraph() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return ((long) this.f12714bb.getInt(i__offset + this.bb_pos)) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public static CallOptions getRootAsCallOptions(ByteBuffer byteBuffer, CallOptions callOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return callOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, CallOptionsT callOptionsT) {
        if (callOptionsT == null) {
            return 0;
        }
        return createCallOptions(flatBufferBuilder, callOptionsT.getSubgraph());
    }

    public CallOptionsT unpack() {
        CallOptionsT callOptionsT = new CallOptionsT();
        unpackTo(callOptionsT);
        return callOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endCallOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public CallOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(CallOptionsT callOptionsT) {
        callOptionsT.setSubgraph(subgraph());
    }
}
