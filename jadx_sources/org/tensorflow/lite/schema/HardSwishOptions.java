package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class HardSwishOptions extends Table {

    public static final class Vector extends BaseVector {
        public HardSwishOptions get(int i11) {
            return get(new HardSwishOptions(), i11);
        }

        public HardSwishOptions get(HardSwishOptions hardSwishOptions, int i11) {
            return hardSwishOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static HardSwishOptions getRootAsHardSwishOptions(ByteBuffer byteBuffer) {
        return getRootAsHardSwishOptions(byteBuffer, new HardSwishOptions());
    }

    public static void startHardSwishOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static HardSwishOptions getRootAsHardSwishOptions(ByteBuffer byteBuffer, HardSwishOptions hardSwishOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return hardSwishOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, HardSwishOptionsT hardSwishOptionsT) {
        if (hardSwishOptionsT == null) {
            return 0;
        }
        startHardSwishOptions(flatBufferBuilder);
        return endHardSwishOptions(flatBufferBuilder);
    }

    public HardSwishOptionsT unpack() {
        HardSwishOptionsT hardSwishOptionsT = new HardSwishOptionsT();
        unpackTo(hardSwishOptionsT);
        return hardSwishOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endHardSwishOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public HardSwishOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(HardSwishOptionsT hardSwishOptionsT) {
    }
}
