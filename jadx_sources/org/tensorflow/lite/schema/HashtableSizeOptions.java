package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class HashtableSizeOptions extends Table {

    public static final class Vector extends BaseVector {
        public HashtableSizeOptions get(int i11) {
            return get(new HashtableSizeOptions(), i11);
        }

        public HashtableSizeOptions get(HashtableSizeOptions hashtableSizeOptions, int i11) {
            return hashtableSizeOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static HashtableSizeOptions getRootAsHashtableSizeOptions(ByteBuffer byteBuffer) {
        return getRootAsHashtableSizeOptions(byteBuffer, new HashtableSizeOptions());
    }

    public static void startHashtableSizeOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static HashtableSizeOptions getRootAsHashtableSizeOptions(ByteBuffer byteBuffer, HashtableSizeOptions hashtableSizeOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return hashtableSizeOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, HashtableSizeOptionsT hashtableSizeOptionsT) {
        if (hashtableSizeOptionsT == null) {
            return 0;
        }
        startHashtableSizeOptions(flatBufferBuilder);
        return endHashtableSizeOptions(flatBufferBuilder);
    }

    public HashtableSizeOptionsT unpack() {
        HashtableSizeOptionsT hashtableSizeOptionsT = new HashtableSizeOptionsT();
        unpackTo(hashtableSizeOptionsT);
        return hashtableSizeOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endHashtableSizeOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public HashtableSizeOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(HashtableSizeOptionsT hashtableSizeOptionsT) {
    }
}
