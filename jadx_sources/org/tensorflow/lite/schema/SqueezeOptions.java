package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SqueezeOptions extends Table {

    public static final class Vector extends BaseVector {
        public SqueezeOptions get(int i11) {
            return get(new SqueezeOptions(), i11);
        }

        public SqueezeOptions get(SqueezeOptions squeezeOptions, int i11) {
            return squeezeOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addSqueezeDims(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static int createSqueezeDimsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createSqueezeOptions(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addSqueezeDims(flatBufferBuilder, i11);
        return endSqueezeOptions(flatBufferBuilder);
    }

    public static SqueezeOptions getRootAsSqueezeOptions(ByteBuffer byteBuffer) {
        return getRootAsSqueezeOptions(byteBuffer, new SqueezeOptions());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SqueezeOptionsT squeezeOptionsT) {
        if (squeezeOptionsT == null) {
            return 0;
        }
        return createSqueezeOptions(flatBufferBuilder, squeezeOptionsT.getSqueezeDims() != null ? createSqueezeDimsVector(flatBufferBuilder, squeezeOptionsT.getSqueezeDims()) : 0);
    }

    public static void startSqueezeDimsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startSqueezeOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public int squeezeDims(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer squeezeDimsAsByteBuffer() {
        return __vector_as_bytebuffer(4, 4);
    }

    public ByteBuffer squeezeDimsInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 4);
    }

    public int squeezeDimsLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector squeezeDimsVector() {
        return squeezeDimsVector(new IntVector());
    }

    public static SqueezeOptions getRootAsSqueezeOptions(ByteBuffer byteBuffer, SqueezeOptions squeezeOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return squeezeOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public IntVector squeezeDimsVector(IntVector intVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public SqueezeOptionsT unpack() {
        SqueezeOptionsT squeezeOptionsT = new SqueezeOptionsT();
        unpackTo(squeezeOptionsT);
        return squeezeOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSqueezeOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SqueezeOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SqueezeOptionsT squeezeOptionsT) {
        int[] iArr = new int[squeezeDimsLength()];
        for (int i11 = 0; i11 < squeezeDimsLength(); i11++) {
            iArr[i11] = squeezeDims(i11);
        }
        squeezeOptionsT.setSqueezeDims(iArr);
    }
}
