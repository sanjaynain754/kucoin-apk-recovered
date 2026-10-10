package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class CosOptions extends Table {

    public static final class Vector extends BaseVector {
        public CosOptions get(int i11) {
            return get(new CosOptions(), i11);
        }

        public CosOptions get(CosOptions cosOptions, int i11) {
            return cosOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static CosOptions getRootAsCosOptions(ByteBuffer byteBuffer) {
        return getRootAsCosOptions(byteBuffer, new CosOptions());
    }

    public static void startCosOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static CosOptions getRootAsCosOptions(ByteBuffer byteBuffer, CosOptions cosOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return cosOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, CosOptionsT cosOptionsT) {
        if (cosOptionsT == null) {
            return 0;
        }
        startCosOptions(flatBufferBuilder);
        return endCosOptions(flatBufferBuilder);
    }

    public CosOptionsT unpack() {
        CosOptionsT cosOptionsT = new CosOptionsT();
        unpackTo(cosOptionsT);
        return cosOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endCosOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public CosOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(CosOptionsT cosOptionsT) {
    }
}
