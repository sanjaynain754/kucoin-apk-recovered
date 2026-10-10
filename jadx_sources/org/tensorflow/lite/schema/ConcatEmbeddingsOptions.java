package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ConcatEmbeddingsOptions extends Table {

    public static final class Vector extends BaseVector {
        public ConcatEmbeddingsOptions get(int i11) {
            return get(new ConcatEmbeddingsOptions(), i11);
        }

        public ConcatEmbeddingsOptions get(ConcatEmbeddingsOptions concatEmbeddingsOptions, int i11) {
            return concatEmbeddingsOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addEmbeddingDimPerChannel(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(2, i11, 0);
    }

    public static void addNumChannels(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static void addNumColumnsPerChannel(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static int createConcatEmbeddingsOptions(FlatBufferBuilder flatBufferBuilder, int i11, int i12, int i13) {
        flatBufferBuilder.startTable(3);
        addEmbeddingDimPerChannel(flatBufferBuilder, i13);
        addNumColumnsPerChannel(flatBufferBuilder, i12);
        addNumChannels(flatBufferBuilder, i11);
        return endConcatEmbeddingsOptions(flatBufferBuilder);
    }

    public static int createEmbeddingDimPerChannelVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createNumColumnsPerChannelVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static ConcatEmbeddingsOptions getRootAsConcatEmbeddingsOptions(ByteBuffer byteBuffer) {
        return getRootAsConcatEmbeddingsOptions(byteBuffer, new ConcatEmbeddingsOptions());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ConcatEmbeddingsOptionsT concatEmbeddingsOptionsT) {
        if (concatEmbeddingsOptionsT == null) {
            return 0;
        }
        return createConcatEmbeddingsOptions(flatBufferBuilder, concatEmbeddingsOptionsT.getNumChannels(), concatEmbeddingsOptionsT.getNumColumnsPerChannel() != null ? createNumColumnsPerChannelVector(flatBufferBuilder, concatEmbeddingsOptionsT.getNumColumnsPerChannel()) : 0, concatEmbeddingsOptionsT.getEmbeddingDimPerChannel() != null ? createEmbeddingDimPerChannelVector(flatBufferBuilder, concatEmbeddingsOptionsT.getEmbeddingDimPerChannel()) : 0);
    }

    public static void startConcatEmbeddingsOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
    }

    public static void startEmbeddingDimPerChannelVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startNumColumnsPerChannelVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public IntVector embeddingDimPerChannelVector() {
        return embeddingDimPerChannelVector(new IntVector());
    }

    public int numChannels() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int numColumnsPerChannel(int i11) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer numColumnsPerChannelAsByteBuffer() {
        return __vector_as_bytebuffer(6, 4);
    }

    public ByteBuffer numColumnsPerChannelInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 4);
    }

    public int numColumnsPerChannelLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector numColumnsPerChannelVector() {
        return numColumnsPerChannelVector(new IntVector());
    }

    public static ConcatEmbeddingsOptions getRootAsConcatEmbeddingsOptions(ByteBuffer byteBuffer, ConcatEmbeddingsOptions concatEmbeddingsOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return concatEmbeddingsOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public int embeddingDimPerChannel(int i11) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer embeddingDimPerChannelAsByteBuffer() {
        return __vector_as_bytebuffer(8, 4);
    }

    public ByteBuffer embeddingDimPerChannelInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 4);
    }

    public int embeddingDimPerChannelLength() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector embeddingDimPerChannelVector(IntVector intVector) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public IntVector numColumnsPerChannelVector(IntVector intVector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public ConcatEmbeddingsOptionsT unpack() {
        ConcatEmbeddingsOptionsT concatEmbeddingsOptionsT = new ConcatEmbeddingsOptionsT();
        unpackTo(concatEmbeddingsOptionsT);
        return concatEmbeddingsOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endConcatEmbeddingsOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ConcatEmbeddingsOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ConcatEmbeddingsOptionsT concatEmbeddingsOptionsT) {
        concatEmbeddingsOptionsT.setNumChannels(numChannels());
        int[] iArr = new int[numColumnsPerChannelLength()];
        for (int i11 = 0; i11 < numColumnsPerChannelLength(); i11++) {
            iArr[i11] = numColumnsPerChannel(i11);
        }
        concatEmbeddingsOptionsT.setNumColumnsPerChannel(iArr);
        int[] iArr2 = new int[embeddingDimPerChannelLength()];
        for (int i12 = 0; i12 < embeddingDimPerChannelLength(); i12++) {
            iArr2[i12] = embeddingDimPerChannel(i12);
        }
        concatEmbeddingsOptionsT.setEmbeddingDimPerChannel(iArr2);
    }
}
