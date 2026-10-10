package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SoftmaxOptions extends Table {

    public static final class Vector extends BaseVector {
        public SoftmaxOptions get(int i11) {
            return get(new SoftmaxOptions(), i11);
        }

        public SoftmaxOptions get(SoftmaxOptions softmaxOptions, int i11) {
            return softmaxOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addBeta(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.addFloat(0, f11, 0.0d);
    }

    public static int createSoftmaxOptions(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.startTable(1);
        addBeta(flatBufferBuilder, f11);
        return endSoftmaxOptions(flatBufferBuilder);
    }

    public static SoftmaxOptions getRootAsSoftmaxOptions(ByteBuffer byteBuffer) {
        return getRootAsSoftmaxOptions(byteBuffer, new SoftmaxOptions());
    }

    public static void startSoftmaxOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public float beta() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public static SoftmaxOptions getRootAsSoftmaxOptions(ByteBuffer byteBuffer, SoftmaxOptions softmaxOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return softmaxOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SoftmaxOptionsT softmaxOptionsT) {
        if (softmaxOptionsT == null) {
            return 0;
        }
        return createSoftmaxOptions(flatBufferBuilder, softmaxOptionsT.getBeta());
    }

    public SoftmaxOptionsT unpack() {
        SoftmaxOptionsT softmaxOptionsT = new SoftmaxOptionsT();
        unpackTo(softmaxOptionsT);
        return softmaxOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSoftmaxOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SoftmaxOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SoftmaxOptionsT softmaxOptionsT) {
        softmaxOptionsT.setBeta(beta());
    }
}
