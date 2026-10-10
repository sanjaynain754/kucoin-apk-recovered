package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class DivOptions extends Table {

    public static final class Vector extends BaseVector {
        public DivOptions get(int i11) {
            return get(new DivOptions(), i11);
        }

        public DivOptions get(DivOptions divOptions, int i11) {
            return divOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static int createDivOptions(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.startTable(1);
        addFusedActivationFunction(flatBufferBuilder, b11);
        return endDivOptions(flatBufferBuilder);
    }

    public static DivOptions getRootAsDivOptions(ByteBuffer byteBuffer) {
        return getRootAsDivOptions(byteBuffer, new DivOptions());
    }

    public static void startDivOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public byte fusedActivationFunction() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static DivOptions getRootAsDivOptions(ByteBuffer byteBuffer, DivOptions divOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return divOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, DivOptionsT divOptionsT) {
        if (divOptionsT == null) {
            return 0;
        }
        return createDivOptions(flatBufferBuilder, divOptionsT.getFusedActivationFunction());
    }

    public DivOptionsT unpack() {
        DivOptionsT divOptionsT = new DivOptionsT();
        unpackTo(divOptionsT);
        return divOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endDivOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public DivOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(DivOptionsT divOptionsT) {
        divOptionsT.setFusedActivationFunction(fusedActivationFunction());
    }
}
