package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class LocalResponseNormalizationOptions extends Table {

    public static final class Vector extends BaseVector {
        public LocalResponseNormalizationOptions get(int i11) {
            return get(new LocalResponseNormalizationOptions(), i11);
        }

        public LocalResponseNormalizationOptions get(LocalResponseNormalizationOptions localResponseNormalizationOptions, int i11) {
            return localResponseNormalizationOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAlpha(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.addFloat(2, f11, 0.0d);
    }

    public static void addBeta(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.addFloat(3, f11, 0.0d);
    }

    public static void addBias(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.addFloat(1, f11, 0.0d);
    }

    public static void addRadius(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createLocalResponseNormalizationOptions(FlatBufferBuilder flatBufferBuilder, int i11, float f11, float f12, float f13) {
        flatBufferBuilder.startTable(4);
        addBeta(flatBufferBuilder, f13);
        addAlpha(flatBufferBuilder, f12);
        addBias(flatBufferBuilder, f11);
        addRadius(flatBufferBuilder, i11);
        return endLocalResponseNormalizationOptions(flatBufferBuilder);
    }

    public static LocalResponseNormalizationOptions getRootAsLocalResponseNormalizationOptions(ByteBuffer byteBuffer) {
        return getRootAsLocalResponseNormalizationOptions(byteBuffer, new LocalResponseNormalizationOptions());
    }

    public static void startLocalResponseNormalizationOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(4);
    }

    public float bias() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public int radius() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static LocalResponseNormalizationOptions getRootAsLocalResponseNormalizationOptions(ByteBuffer byteBuffer, LocalResponseNormalizationOptions localResponseNormalizationOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return localResponseNormalizationOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, LocalResponseNormalizationOptionsT localResponseNormalizationOptionsT) {
        if (localResponseNormalizationOptionsT == null) {
            return 0;
        }
        return createLocalResponseNormalizationOptions(flatBufferBuilder, localResponseNormalizationOptionsT.getRadius(), localResponseNormalizationOptionsT.getBias(), localResponseNormalizationOptionsT.getAlpha(), localResponseNormalizationOptionsT.getBeta());
    }

    public float alpha() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public float beta() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public LocalResponseNormalizationOptionsT unpack() {
        LocalResponseNormalizationOptionsT localResponseNormalizationOptionsT = new LocalResponseNormalizationOptionsT();
        unpackTo(localResponseNormalizationOptionsT);
        return localResponseNormalizationOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endLocalResponseNormalizationOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public LocalResponseNormalizationOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(LocalResponseNormalizationOptionsT localResponseNormalizationOptionsT) {
        localResponseNormalizationOptionsT.setRadius(radius());
        localResponseNormalizationOptionsT.setBias(bias());
        localResponseNormalizationOptionsT.setAlpha(alpha());
        localResponseNormalizationOptionsT.setBeta(beta());
    }
}
