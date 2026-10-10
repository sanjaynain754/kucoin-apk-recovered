package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class NonMaxSuppressionV5Options extends Table {

    public static final class Vector extends BaseVector {
        public NonMaxSuppressionV5Options get(int i11) {
            return get(new NonMaxSuppressionV5Options(), i11);
        }

        public NonMaxSuppressionV5Options get(NonMaxSuppressionV5Options nonMaxSuppressionV5Options, int i11) {
            return nonMaxSuppressionV5Options.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static NonMaxSuppressionV5Options getRootAsNonMaxSuppressionV5Options(ByteBuffer byteBuffer) {
        return getRootAsNonMaxSuppressionV5Options(byteBuffer, new NonMaxSuppressionV5Options());
    }

    public static void startNonMaxSuppressionV5Options(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static NonMaxSuppressionV5Options getRootAsNonMaxSuppressionV5Options(ByteBuffer byteBuffer, NonMaxSuppressionV5Options nonMaxSuppressionV5Options) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return nonMaxSuppressionV5Options.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, NonMaxSuppressionV5OptionsT nonMaxSuppressionV5OptionsT) {
        if (nonMaxSuppressionV5OptionsT == null) {
            return 0;
        }
        startNonMaxSuppressionV5Options(flatBufferBuilder);
        return endNonMaxSuppressionV5Options(flatBufferBuilder);
    }

    public NonMaxSuppressionV5OptionsT unpack() {
        NonMaxSuppressionV5OptionsT nonMaxSuppressionV5OptionsT = new NonMaxSuppressionV5OptionsT();
        unpackTo(nonMaxSuppressionV5OptionsT);
        return nonMaxSuppressionV5OptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endNonMaxSuppressionV5Options(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public NonMaxSuppressionV5Options __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(NonMaxSuppressionV5OptionsT nonMaxSuppressionV5OptionsT) {
    }
}
