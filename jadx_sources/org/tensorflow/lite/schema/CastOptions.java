package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class CastOptions extends Table {

    public static final class Vector extends BaseVector {
        public CastOptions get(int i11) {
            return get(new CastOptions(), i11);
        }

        public CastOptions get(CastOptions castOptions, int i11) {
            return castOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addInDataType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static void addOutDataType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(1, b11, 0);
    }

    public static int createCastOptions(FlatBufferBuilder flatBufferBuilder, byte b11, byte b12) {
        flatBufferBuilder.startTable(2);
        addOutDataType(flatBufferBuilder, b12);
        addInDataType(flatBufferBuilder, b11);
        return endCastOptions(flatBufferBuilder);
    }

    public static CastOptions getRootAsCastOptions(ByteBuffer byteBuffer) {
        return getRootAsCastOptions(byteBuffer, new CastOptions());
    }

    public static void startCastOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public byte inDataType() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public byte outDataType() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static CastOptions getRootAsCastOptions(ByteBuffer byteBuffer, CastOptions castOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return castOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, CastOptionsT castOptionsT) {
        if (castOptionsT == null) {
            return 0;
        }
        return createCastOptions(flatBufferBuilder, castOptionsT.getInDataType(), castOptionsT.getOutDataType());
    }

    public CastOptionsT unpack() {
        CastOptionsT castOptionsT = new CastOptionsT();
        unpackTo(castOptionsT);
        return castOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endCastOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public CastOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(CastOptionsT castOptionsT) {
        castOptionsT.setInDataType(inDataType());
        castOptionsT.setOutDataType(outDataType());
    }
}
