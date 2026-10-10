package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ConcatenationOptions extends Table {

    public static final class Vector extends BaseVector {
        public ConcatenationOptions get(int i11) {
            return get(new ConcatenationOptions(), i11);
        }

        public ConcatenationOptions get(ConcatenationOptions concatenationOptions, int i11) {
            return concatenationOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAxis(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(1, b11, 0);
    }

    public static int createConcatenationOptions(FlatBufferBuilder flatBufferBuilder, int i11, byte b11) {
        flatBufferBuilder.startTable(2);
        addAxis(flatBufferBuilder, i11);
        addFusedActivationFunction(flatBufferBuilder, b11);
        return endConcatenationOptions(flatBufferBuilder);
    }

    public static ConcatenationOptions getRootAsConcatenationOptions(ByteBuffer byteBuffer) {
        return getRootAsConcatenationOptions(byteBuffer, new ConcatenationOptions());
    }

    public static void startConcatenationOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public int axis() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public byte fusedActivationFunction() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static ConcatenationOptions getRootAsConcatenationOptions(ByteBuffer byteBuffer, ConcatenationOptions concatenationOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return concatenationOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ConcatenationOptionsT concatenationOptionsT) {
        if (concatenationOptionsT == null) {
            return 0;
        }
        return createConcatenationOptions(flatBufferBuilder, concatenationOptionsT.getAxis(), concatenationOptionsT.getFusedActivationFunction());
    }

    public ConcatenationOptionsT unpack() {
        ConcatenationOptionsT concatenationOptionsT = new ConcatenationOptionsT();
        unpackTo(concatenationOptionsT);
        return concatenationOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endConcatenationOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ConcatenationOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ConcatenationOptionsT concatenationOptionsT) {
        concatenationOptionsT.setAxis(axis());
        concatenationOptionsT.setFusedActivationFunction(fusedActivationFunction());
    }
}
