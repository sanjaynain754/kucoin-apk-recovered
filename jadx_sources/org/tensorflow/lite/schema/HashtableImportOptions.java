package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class HashtableImportOptions extends Table {

    public static final class Vector extends BaseVector {
        public HashtableImportOptions get(int i11) {
            return get(new HashtableImportOptions(), i11);
        }

        public HashtableImportOptions get(HashtableImportOptions hashtableImportOptions, int i11) {
            return hashtableImportOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static HashtableImportOptions getRootAsHashtableImportOptions(ByteBuffer byteBuffer) {
        return getRootAsHashtableImportOptions(byteBuffer, new HashtableImportOptions());
    }

    public static void startHashtableImportOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static HashtableImportOptions getRootAsHashtableImportOptions(ByteBuffer byteBuffer, HashtableImportOptions hashtableImportOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return hashtableImportOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, HashtableImportOptionsT hashtableImportOptionsT) {
        if (hashtableImportOptionsT == null) {
            return 0;
        }
        startHashtableImportOptions(flatBufferBuilder);
        return endHashtableImportOptions(flatBufferBuilder);
    }

    public HashtableImportOptionsT unpack() {
        HashtableImportOptionsT hashtableImportOptionsT = new HashtableImportOptionsT();
        unpackTo(hashtableImportOptionsT);
        return hashtableImportOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endHashtableImportOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public HashtableImportOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(HashtableImportOptionsT hashtableImportOptionsT) {
    }
}
