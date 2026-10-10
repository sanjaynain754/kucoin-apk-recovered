package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class EmbeddingLookupSparseOptions extends Table {

    public static final class Vector extends BaseVector {
        public EmbeddingLookupSparseOptions get(int i11) {
            return get(new EmbeddingLookupSparseOptions(), i11);
        }

        public EmbeddingLookupSparseOptions get(EmbeddingLookupSparseOptions embeddingLookupSparseOptions, int i11) {
            return embeddingLookupSparseOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addCombiner(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static int createEmbeddingLookupSparseOptions(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.startTable(1);
        addCombiner(flatBufferBuilder, b11);
        return endEmbeddingLookupSparseOptions(flatBufferBuilder);
    }

    public static EmbeddingLookupSparseOptions getRootAsEmbeddingLookupSparseOptions(ByteBuffer byteBuffer) {
        return getRootAsEmbeddingLookupSparseOptions(byteBuffer, new EmbeddingLookupSparseOptions());
    }

    public static void startEmbeddingLookupSparseOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public byte combiner() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static EmbeddingLookupSparseOptions getRootAsEmbeddingLookupSparseOptions(ByteBuffer byteBuffer, EmbeddingLookupSparseOptions embeddingLookupSparseOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return embeddingLookupSparseOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, EmbeddingLookupSparseOptionsT embeddingLookupSparseOptionsT) {
        if (embeddingLookupSparseOptionsT == null) {
            return 0;
        }
        return createEmbeddingLookupSparseOptions(flatBufferBuilder, embeddingLookupSparseOptionsT.getCombiner());
    }

    public EmbeddingLookupSparseOptionsT unpack() {
        EmbeddingLookupSparseOptionsT embeddingLookupSparseOptionsT = new EmbeddingLookupSparseOptionsT();
        unpackTo(embeddingLookupSparseOptionsT);
        return embeddingLookupSparseOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endEmbeddingLookupSparseOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public EmbeddingLookupSparseOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(EmbeddingLookupSparseOptionsT embeddingLookupSparseOptionsT) {
        embeddingLookupSparseOptionsT.setCombiner(combiner());
    }
}
