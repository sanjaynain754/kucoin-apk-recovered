package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SkipGramOptions extends Table {

    public static final class Vector extends BaseVector {
        public SkipGramOptions get(int i11) {
            return get(new SkipGramOptions(), i11);
        }

        public SkipGramOptions get(SkipGramOptions skipGramOptions, int i11) {
            return skipGramOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addIncludeAllNgrams(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(2, z11, false);
    }

    public static void addMaxSkipSize(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(1, i11, 0);
    }

    public static void addNgramSize(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createSkipGramOptions(FlatBufferBuilder flatBufferBuilder, int i11, int i12, boolean z11) {
        flatBufferBuilder.startTable(3);
        addMaxSkipSize(flatBufferBuilder, i12);
        addNgramSize(flatBufferBuilder, i11);
        addIncludeAllNgrams(flatBufferBuilder, z11);
        return endSkipGramOptions(flatBufferBuilder);
    }

    public static SkipGramOptions getRootAsSkipGramOptions(ByteBuffer byteBuffer) {
        return getRootAsSkipGramOptions(byteBuffer, new SkipGramOptions());
    }

    public static void startSkipGramOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
    }

    public int maxSkipSize() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int ngramSize() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static SkipGramOptions getRootAsSkipGramOptions(ByteBuffer byteBuffer, SkipGramOptions skipGramOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return skipGramOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SkipGramOptionsT skipGramOptionsT) {
        if (skipGramOptionsT == null) {
            return 0;
        }
        return createSkipGramOptions(flatBufferBuilder, skipGramOptionsT.getNgramSize(), skipGramOptionsT.getMaxSkipSize(), skipGramOptionsT.getIncludeAllNgrams());
    }

    public boolean includeAllNgrams() {
        int i__offset = __offset(8);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public SkipGramOptionsT unpack() {
        SkipGramOptionsT skipGramOptionsT = new SkipGramOptionsT();
        unpackTo(skipGramOptionsT);
        return skipGramOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSkipGramOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SkipGramOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SkipGramOptionsT skipGramOptionsT) {
        skipGramOptionsT.setNgramSize(ngramSize());
        skipGramOptionsT.setMaxSkipSize(maxSkipSize());
        skipGramOptionsT.setIncludeAllNgrams(includeAllNgrams());
    }
}
