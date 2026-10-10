package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class MulOptions extends Table {

    public static final class Vector extends BaseVector {
        public MulOptions get(int i11) {
            return get(new MulOptions(), i11);
        }

        public MulOptions get(MulOptions mulOptions, int i11) {
            return mulOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static int createMulOptions(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.startTable(1);
        addFusedActivationFunction(flatBufferBuilder, b11);
        return endMulOptions(flatBufferBuilder);
    }

    public static MulOptions getRootAsMulOptions(ByteBuffer byteBuffer) {
        return getRootAsMulOptions(byteBuffer, new MulOptions());
    }

    public static void startMulOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public byte fusedActivationFunction() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static MulOptions getRootAsMulOptions(ByteBuffer byteBuffer, MulOptions mulOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return mulOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, MulOptionsT mulOptionsT) {
        if (mulOptionsT == null) {
            return 0;
        }
        return createMulOptions(flatBufferBuilder, mulOptionsT.getFusedActivationFunction());
    }

    public MulOptionsT unpack() {
        MulOptionsT mulOptionsT = new MulOptionsT();
        unpackTo(mulOptionsT);
        return mulOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endMulOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public MulOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(MulOptionsT mulOptionsT) {
        mulOptionsT.setFusedActivationFunction(fusedActivationFunction());
    }
}
