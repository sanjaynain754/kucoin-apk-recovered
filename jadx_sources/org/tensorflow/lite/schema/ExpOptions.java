package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ExpOptions extends Table {

    public static final class Vector extends BaseVector {
        public ExpOptions get(int i11) {
            return get(new ExpOptions(), i11);
        }

        public ExpOptions get(ExpOptions expOptions, int i11) {
            return expOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static ExpOptions getRootAsExpOptions(ByteBuffer byteBuffer) {
        return getRootAsExpOptions(byteBuffer, new ExpOptions());
    }

    public static void startExpOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static ExpOptions getRootAsExpOptions(ByteBuffer byteBuffer, ExpOptions expOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return expOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ExpOptionsT expOptionsT) {
        if (expOptionsT == null) {
            return 0;
        }
        startExpOptions(flatBufferBuilder);
        return endExpOptions(flatBufferBuilder);
    }

    public ExpOptionsT unpack() {
        ExpOptionsT expOptionsT = new ExpOptionsT();
        unpackTo(expOptionsT);
        return expOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endExpOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ExpOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ExpOptionsT expOptionsT) {
    }
}
