package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class Metadata extends Table {

    public static final class Vector extends BaseVector {
        public Metadata get(int i11) {
            return get(new Metadata(), i11);
        }

        public Metadata get(Metadata metadata, int i11) {
            return metadata.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addBuffer(FlatBufferBuilder flatBufferBuilder, long j11) {
        flatBufferBuilder.addInt(1, (int) j11, 0);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static int createMetadata(FlatBufferBuilder flatBufferBuilder, int i11, long j11) {
        flatBufferBuilder.startTable(2);
        addBuffer(flatBufferBuilder, j11);
        addName(flatBufferBuilder, i11);
        return endMetadata(flatBufferBuilder);
    }

    public static Metadata getRootAsMetadata(ByteBuffer byteBuffer) {
        return getRootAsMetadata(byteBuffer, new Metadata());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, MetadataT metadataT) {
        if (metadataT == null) {
            return 0;
        }
        return createMetadata(flatBufferBuilder, metadataT.getName() != null ? flatBufferBuilder.createString(metadataT.getName()) : 0, metadataT.getBuffer());
    }

    public static void startMetadata(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public long buffer() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return ((long) this.f12714bb.getInt(i__offset + this.bb_pos)) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public String name() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer nameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public static Metadata getRootAsMetadata(ByteBuffer byteBuffer, Metadata metadata) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return metadata.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public MetadataT unpack() {
        MetadataT metadataT = new MetadataT();
        unpackTo(metadataT);
        return metadataT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endMetadata(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public Metadata __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(MetadataT metadataT) {
        metadataT.setName(name());
        metadataT.setBuffer(buffer());
    }
}
