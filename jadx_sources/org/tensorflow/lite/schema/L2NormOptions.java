package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class L2NormOptions extends Table {

    public static final class Vector extends BaseVector {
        public L2NormOptions get(int i11) {
            return get(new L2NormOptions(), i11);
        }

        public L2NormOptions get(L2NormOptions l2NormOptions, int i11) {
            return l2NormOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static int createL2NormOptions(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.startTable(1);
        addFusedActivationFunction(flatBufferBuilder, b11);
        return endL2NormOptions(flatBufferBuilder);
    }

    public static L2NormOptions getRootAsL2NormOptions(ByteBuffer byteBuffer) {
        return getRootAsL2NormOptions(byteBuffer, new L2NormOptions());
    }

    public static void startL2NormOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public byte fusedActivationFunction() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static L2NormOptions getRootAsL2NormOptions(ByteBuffer byteBuffer, L2NormOptions l2NormOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return l2NormOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, L2NormOptionsT l2NormOptionsT) {
        if (l2NormOptionsT == null) {
            return 0;
        }
        return createL2NormOptions(flatBufferBuilder, l2NormOptionsT.getFusedActivationFunction());
    }

    public L2NormOptionsT unpack() {
        L2NormOptionsT l2NormOptionsT = new L2NormOptionsT();
        unpackTo(l2NormOptionsT);
        return l2NormOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endL2NormOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public L2NormOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(L2NormOptionsT l2NormOptionsT) {
        l2NormOptionsT.setFusedActivationFunction(fusedActivationFunction());
    }
}
