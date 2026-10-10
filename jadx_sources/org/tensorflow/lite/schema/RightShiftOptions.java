package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class RightShiftOptions extends Table {

    public static final class Vector extends BaseVector {
        public RightShiftOptions get(int i11) {
            return get(new RightShiftOptions(), i11);
        }

        public RightShiftOptions get(RightShiftOptions rightShiftOptions, int i11) {
            return rightShiftOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static RightShiftOptions getRootAsRightShiftOptions(ByteBuffer byteBuffer) {
        return getRootAsRightShiftOptions(byteBuffer, new RightShiftOptions());
    }

    public static void startRightShiftOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static RightShiftOptions getRootAsRightShiftOptions(ByteBuffer byteBuffer, RightShiftOptions rightShiftOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return rightShiftOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, RightShiftOptionsT rightShiftOptionsT) {
        if (rightShiftOptionsT == null) {
            return 0;
        }
        startRightShiftOptions(flatBufferBuilder);
        return endRightShiftOptions(flatBufferBuilder);
    }

    public RightShiftOptionsT unpack() {
        RightShiftOptionsT rightShiftOptionsT = new RightShiftOptionsT();
        unpackTo(rightShiftOptionsT);
        return rightShiftOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endRightShiftOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public RightShiftOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(RightShiftOptionsT rightShiftOptionsT) {
    }
}
