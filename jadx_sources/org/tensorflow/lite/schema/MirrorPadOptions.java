package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class MirrorPadOptions extends Table {

    public static final class Vector extends BaseVector {
        public MirrorPadOptions get(int i11) {
            return get(new MirrorPadOptions(), i11);
        }

        public MirrorPadOptions get(MirrorPadOptions mirrorPadOptions, int i11) {
            return mirrorPadOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addMode(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static int createMirrorPadOptions(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.startTable(1);
        addMode(flatBufferBuilder, b11);
        return endMirrorPadOptions(flatBufferBuilder);
    }

    public static MirrorPadOptions getRootAsMirrorPadOptions(ByteBuffer byteBuffer) {
        return getRootAsMirrorPadOptions(byteBuffer, new MirrorPadOptions());
    }

    public static void startMirrorPadOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public byte mode() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static MirrorPadOptions getRootAsMirrorPadOptions(ByteBuffer byteBuffer, MirrorPadOptions mirrorPadOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return mirrorPadOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, MirrorPadOptionsT mirrorPadOptionsT) {
        if (mirrorPadOptionsT == null) {
            return 0;
        }
        return createMirrorPadOptions(flatBufferBuilder, mirrorPadOptionsT.getMode());
    }

    public MirrorPadOptionsT unpack() {
        MirrorPadOptionsT mirrorPadOptionsT = new MirrorPadOptionsT();
        unpackTo(mirrorPadOptionsT);
        return mirrorPadOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endMirrorPadOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public MirrorPadOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(MirrorPadOptionsT mirrorPadOptionsT) {
        mirrorPadOptionsT.setMode(mode());
    }
}
