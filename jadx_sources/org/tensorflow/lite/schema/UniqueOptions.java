package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class UniqueOptions extends Table {

    public static final class Vector extends BaseVector {
        public UniqueOptions get(int i11) {
            return get(new UniqueOptions(), i11);
        }

        public UniqueOptions get(UniqueOptions uniqueOptions, int i11) {
            return uniqueOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addIdxOutType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 2);
    }

    public static int createUniqueOptions(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.startTable(1);
        addIdxOutType(flatBufferBuilder, b11);
        return endUniqueOptions(flatBufferBuilder);
    }

    public static UniqueOptions getRootAsUniqueOptions(ByteBuffer byteBuffer) {
        return getRootAsUniqueOptions(byteBuffer, new UniqueOptions());
    }

    public static void startUniqueOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public byte idxOutType() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 2;
    }

    public static UniqueOptions getRootAsUniqueOptions(ByteBuffer byteBuffer, UniqueOptions uniqueOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return uniqueOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, UniqueOptionsT uniqueOptionsT) {
        if (uniqueOptionsT == null) {
            return 0;
        }
        return createUniqueOptions(flatBufferBuilder, uniqueOptionsT.getIdxOutType());
    }

    public UniqueOptionsT unpack() {
        UniqueOptionsT uniqueOptionsT = new UniqueOptionsT();
        unpackTo(uniqueOptionsT);
        return uniqueOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endUniqueOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public UniqueOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(UniqueOptionsT uniqueOptionsT) {
        uniqueOptionsT.setIdxOutType(idxOutType());
    }
}
