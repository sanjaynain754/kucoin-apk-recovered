package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class MaximumMinimumOptions extends Table {

    public static final class Vector extends BaseVector {
        public MaximumMinimumOptions get(int i11) {
            return get(new MaximumMinimumOptions(), i11);
        }

        public MaximumMinimumOptions get(MaximumMinimumOptions maximumMinimumOptions, int i11) {
            return maximumMinimumOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static MaximumMinimumOptions getRootAsMaximumMinimumOptions(ByteBuffer byteBuffer) {
        return getRootAsMaximumMinimumOptions(byteBuffer, new MaximumMinimumOptions());
    }

    public static void startMaximumMinimumOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static MaximumMinimumOptions getRootAsMaximumMinimumOptions(ByteBuffer byteBuffer, MaximumMinimumOptions maximumMinimumOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return maximumMinimumOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, MaximumMinimumOptionsT maximumMinimumOptionsT) {
        if (maximumMinimumOptionsT == null) {
            return 0;
        }
        startMaximumMinimumOptions(flatBufferBuilder);
        return endMaximumMinimumOptions(flatBufferBuilder);
    }

    public MaximumMinimumOptionsT unpack() {
        MaximumMinimumOptionsT maximumMinimumOptionsT = new MaximumMinimumOptionsT();
        unpackTo(maximumMinimumOptionsT);
        return maximumMinimumOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endMaximumMinimumOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public MaximumMinimumOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(MaximumMinimumOptionsT maximumMinimumOptionsT) {
    }
}
