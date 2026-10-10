package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class BucketizeOptions extends Table {

    public static final class Vector extends BaseVector {
        public BucketizeOptions get(int i11) {
            return get(new BucketizeOptions(), i11);
        }

        public BucketizeOptions get(BucketizeOptions bucketizeOptions, int i11) {
            return bucketizeOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addBoundaries(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static int createBoundariesVector(FlatBufferBuilder flatBufferBuilder, float[] fArr) {
        flatBufferBuilder.startVector(4, fArr.length, 4);
        for (int length = fArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addFloat(fArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createBucketizeOptions(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addBoundaries(flatBufferBuilder, i11);
        return endBucketizeOptions(flatBufferBuilder);
    }

    public static BucketizeOptions getRootAsBucketizeOptions(ByteBuffer byteBuffer) {
        return getRootAsBucketizeOptions(byteBuffer, new BucketizeOptions());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, BucketizeOptionsT bucketizeOptionsT) {
        if (bucketizeOptionsT == null) {
            return 0;
        }
        return createBucketizeOptions(flatBufferBuilder, bucketizeOptionsT.getBoundaries() != null ? createBoundariesVector(flatBufferBuilder, bucketizeOptionsT.getBoundaries()) : 0);
    }

    public static void startBoundariesVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startBucketizeOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public float boundaries(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(__vector(i__offset) + (i11 * 4));
        }
        return 0.0f;
    }

    public ByteBuffer boundariesAsByteBuffer() {
        return __vector_as_bytebuffer(4, 4);
    }

    public ByteBuffer boundariesInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 4);
    }

    public int boundariesLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public FloatVector boundariesVector() {
        return boundariesVector(new FloatVector());
    }

    public static BucketizeOptions getRootAsBucketizeOptions(ByteBuffer byteBuffer, BucketizeOptions bucketizeOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bucketizeOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public FloatVector boundariesVector(FloatVector floatVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return floatVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public BucketizeOptionsT unpack() {
        BucketizeOptionsT bucketizeOptionsT = new BucketizeOptionsT();
        unpackTo(bucketizeOptionsT);
        return bucketizeOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endBucketizeOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public BucketizeOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(BucketizeOptionsT bucketizeOptionsT) {
        float[] fArr = new float[boundariesLength()];
        for (int i11 = 0; i11 < boundariesLength(); i11++) {
            fArr[i11] = boundaries(i11);
        }
        bucketizeOptionsT.setBoundaries(fArr);
    }
}
