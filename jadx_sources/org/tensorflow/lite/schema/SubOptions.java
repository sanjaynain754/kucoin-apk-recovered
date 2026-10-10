package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SubOptions extends Table {

    public static final class Vector extends BaseVector {
        public SubOptions get(int i11) {
            return get(new SubOptions(), i11);
        }

        public SubOptions get(SubOptions subOptions, int i11) {
            return subOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static void addPotScaleInt16(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(1, z11, true);
    }

    public static int createSubOptions(FlatBufferBuilder flatBufferBuilder, byte b11, boolean z11) {
        flatBufferBuilder.startTable(2);
        addPotScaleInt16(flatBufferBuilder, z11);
        addFusedActivationFunction(flatBufferBuilder, b11);
        return endSubOptions(flatBufferBuilder);
    }

    public static SubOptions getRootAsSubOptions(ByteBuffer byteBuffer) {
        return getRootAsSubOptions(byteBuffer, new SubOptions());
    }

    public static void startSubOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public byte fusedActivationFunction() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public boolean potScaleInt16() {
        int i__offset = __offset(6);
        return i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) != 0;
    }

    public static SubOptions getRootAsSubOptions(ByteBuffer byteBuffer, SubOptions subOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return subOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SubOptionsT subOptionsT) {
        if (subOptionsT == null) {
            return 0;
        }
        return createSubOptions(flatBufferBuilder, subOptionsT.getFusedActivationFunction(), subOptionsT.getPotScaleInt16());
    }

    public SubOptionsT unpack() {
        SubOptionsT subOptionsT = new SubOptionsT();
        unpackTo(subOptionsT);
        return subOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSubOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SubOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SubOptionsT subOptionsT) {
        subOptionsT.setFusedActivationFunction(fusedActivationFunction());
        subOptionsT.setPotScaleInt16(potScaleInt16());
    }
}
