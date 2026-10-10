package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class TransposeOptions extends Table {

    public static final class Vector extends BaseVector {
        public TransposeOptions get(int i11) {
            return get(new TransposeOptions(), i11);
        }

        public TransposeOptions get(TransposeOptions transposeOptions, int i11) {
            return transposeOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static TransposeOptions getRootAsTransposeOptions(ByteBuffer byteBuffer) {
        return getRootAsTransposeOptions(byteBuffer, new TransposeOptions());
    }

    public static void startTransposeOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static TransposeOptions getRootAsTransposeOptions(ByteBuffer byteBuffer, TransposeOptions transposeOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return transposeOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, TransposeOptionsT transposeOptionsT) {
        if (transposeOptionsT == null) {
            return 0;
        }
        startTransposeOptions(flatBufferBuilder);
        return endTransposeOptions(flatBufferBuilder);
    }

    public TransposeOptionsT unpack() {
        TransposeOptionsT transposeOptionsT = new TransposeOptionsT();
        unpackTo(transposeOptionsT);
        return transposeOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endTransposeOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public TransposeOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(TransposeOptionsT transposeOptionsT) {
    }
}
