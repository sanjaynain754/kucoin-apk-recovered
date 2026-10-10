package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class NonMaxSuppressionV4Options extends Table {

    public static final class Vector extends BaseVector {
        public NonMaxSuppressionV4Options get(int i11) {
            return get(new NonMaxSuppressionV4Options(), i11);
        }

        public NonMaxSuppressionV4Options get(NonMaxSuppressionV4Options nonMaxSuppressionV4Options, int i11) {
            return nonMaxSuppressionV4Options.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static NonMaxSuppressionV4Options getRootAsNonMaxSuppressionV4Options(ByteBuffer byteBuffer) {
        return getRootAsNonMaxSuppressionV4Options(byteBuffer, new NonMaxSuppressionV4Options());
    }

    public static void startNonMaxSuppressionV4Options(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static NonMaxSuppressionV4Options getRootAsNonMaxSuppressionV4Options(ByteBuffer byteBuffer, NonMaxSuppressionV4Options nonMaxSuppressionV4Options) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return nonMaxSuppressionV4Options.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, NonMaxSuppressionV4OptionsT nonMaxSuppressionV4OptionsT) {
        if (nonMaxSuppressionV4OptionsT == null) {
            return 0;
        }
        startNonMaxSuppressionV4Options(flatBufferBuilder);
        return endNonMaxSuppressionV4Options(flatBufferBuilder);
    }

    public NonMaxSuppressionV4OptionsT unpack() {
        NonMaxSuppressionV4OptionsT nonMaxSuppressionV4OptionsT = new NonMaxSuppressionV4OptionsT();
        unpackTo(nonMaxSuppressionV4OptionsT);
        return nonMaxSuppressionV4OptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endNonMaxSuppressionV4Options(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public NonMaxSuppressionV4Options __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(NonMaxSuppressionV4OptionsT nonMaxSuppressionV4OptionsT) {
    }
}
