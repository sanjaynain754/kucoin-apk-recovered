package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class DensifyOptions extends Table {

    public static final class Vector extends BaseVector {
        public DensifyOptions get(int i11) {
            return get(new DensifyOptions(), i11);
        }

        public DensifyOptions get(DensifyOptions densifyOptions, int i11) {
            return densifyOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static DensifyOptions getRootAsDensifyOptions(ByteBuffer byteBuffer) {
        return getRootAsDensifyOptions(byteBuffer, new DensifyOptions());
    }

    public static void startDensifyOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static DensifyOptions getRootAsDensifyOptions(ByteBuffer byteBuffer, DensifyOptions densifyOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return densifyOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, DensifyOptionsT densifyOptionsT) {
        if (densifyOptionsT == null) {
            return 0;
        }
        startDensifyOptions(flatBufferBuilder);
        return endDensifyOptions(flatBufferBuilder);
    }

    public DensifyOptionsT unpack() {
        DensifyOptionsT densifyOptionsT = new DensifyOptionsT();
        unpackTo(densifyOptionsT);
        return densifyOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endDensifyOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public DensifyOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(DensifyOptionsT densifyOptionsT) {
    }
}
