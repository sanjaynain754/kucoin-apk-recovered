package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ArgMaxOptions extends Table {

    public static final class Vector extends BaseVector {
        public ArgMaxOptions get(int i11) {
            return get(new ArgMaxOptions(), i11);
        }

        public ArgMaxOptions get(ArgMaxOptions argMaxOptions, int i11) {
            return argMaxOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addOutputType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static int createArgMaxOptions(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.startTable(1);
        addOutputType(flatBufferBuilder, b11);
        return endArgMaxOptions(flatBufferBuilder);
    }

    public static ArgMaxOptions getRootAsArgMaxOptions(ByteBuffer byteBuffer) {
        return getRootAsArgMaxOptions(byteBuffer, new ArgMaxOptions());
    }

    public static void startArgMaxOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public byte outputType() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static ArgMaxOptions getRootAsArgMaxOptions(ByteBuffer byteBuffer, ArgMaxOptions argMaxOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return argMaxOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ArgMaxOptionsT argMaxOptionsT) {
        if (argMaxOptionsT == null) {
            return 0;
        }
        return createArgMaxOptions(flatBufferBuilder, argMaxOptionsT.getOutputType());
    }

    public ArgMaxOptionsT unpack() {
        ArgMaxOptionsT argMaxOptionsT = new ArgMaxOptionsT();
        unpackTo(argMaxOptionsT);
        return argMaxOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endArgMaxOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ArgMaxOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ArgMaxOptionsT argMaxOptionsT) {
        argMaxOptionsT.setOutputType(outputType());
    }
}
