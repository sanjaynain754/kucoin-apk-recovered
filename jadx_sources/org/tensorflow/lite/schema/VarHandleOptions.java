package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class VarHandleOptions extends Table {

    public static final class Vector extends BaseVector {
        public VarHandleOptions get(int i11) {
            return get(new VarHandleOptions(), i11);
        }

        public VarHandleOptions get(VarHandleOptions varHandleOptions, int i11) {
            return varHandleOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addContainer(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addSharedName(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static int createVarHandleOptions(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addSharedName(flatBufferBuilder, i12);
        addContainer(flatBufferBuilder, i11);
        return endVarHandleOptions(flatBufferBuilder);
    }

    public static VarHandleOptions getRootAsVarHandleOptions(ByteBuffer byteBuffer) {
        return getRootAsVarHandleOptions(byteBuffer, new VarHandleOptions());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, VarHandleOptionsT varHandleOptionsT) {
        if (varHandleOptionsT == null) {
            return 0;
        }
        return createVarHandleOptions(flatBufferBuilder, varHandleOptionsT.getContainer() == null ? 0 : flatBufferBuilder.createString(varHandleOptionsT.getContainer()), varHandleOptionsT.getSharedName() != null ? flatBufferBuilder.createString(varHandleOptionsT.getSharedName()) : 0);
    }

    public static void startVarHandleOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public String container() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer containerAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer containerInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public String sharedName() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer sharedNameAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer sharedNameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public static VarHandleOptions getRootAsVarHandleOptions(ByteBuffer byteBuffer, VarHandleOptions varHandleOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return varHandleOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public VarHandleOptionsT unpack() {
        VarHandleOptionsT varHandleOptionsT = new VarHandleOptionsT();
        unpackTo(varHandleOptionsT);
        return varHandleOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endVarHandleOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public VarHandleOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(VarHandleOptionsT varHandleOptionsT) {
        varHandleOptionsT.setContainer(container());
        varHandleOptionsT.setSharedName(sharedName());
    }
}
