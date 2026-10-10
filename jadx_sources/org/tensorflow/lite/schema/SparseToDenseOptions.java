package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SparseToDenseOptions extends Table {

    public static final class Vector extends BaseVector {
        public SparseToDenseOptions get(int i11) {
            return get(new SparseToDenseOptions(), i11);
        }

        public SparseToDenseOptions get(SparseToDenseOptions sparseToDenseOptions, int i11) {
            return sparseToDenseOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addValidateIndices(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(0, z11, false);
    }

    public static int createSparseToDenseOptions(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.startTable(1);
        addValidateIndices(flatBufferBuilder, z11);
        return endSparseToDenseOptions(flatBufferBuilder);
    }

    public static SparseToDenseOptions getRootAsSparseToDenseOptions(ByteBuffer byteBuffer) {
        return getRootAsSparseToDenseOptions(byteBuffer, new SparseToDenseOptions());
    }

    public static void startSparseToDenseOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public boolean validateIndices() {
        int i__offset = __offset(4);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public static SparseToDenseOptions getRootAsSparseToDenseOptions(ByteBuffer byteBuffer, SparseToDenseOptions sparseToDenseOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return sparseToDenseOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SparseToDenseOptionsT sparseToDenseOptionsT) {
        if (sparseToDenseOptionsT == null) {
            return 0;
        }
        return createSparseToDenseOptions(flatBufferBuilder, sparseToDenseOptionsT.getValidateIndices());
    }

    public SparseToDenseOptionsT unpack() {
        SparseToDenseOptionsT sparseToDenseOptionsT = new SparseToDenseOptionsT();
        unpackTo(sparseToDenseOptionsT);
        return sparseToDenseOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSparseToDenseOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SparseToDenseOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SparseToDenseOptionsT sparseToDenseOptionsT) {
        sparseToDenseOptionsT.setValidateIndices(validateIndices());
    }
}
