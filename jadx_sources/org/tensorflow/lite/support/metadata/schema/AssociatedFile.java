package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class AssociatedFile extends Table {

    public static final class Vector extends BaseVector {
        public AssociatedFile get(int i11) {
            return get(new AssociatedFile(), i11);
        }

        public AssociatedFile get(AssociatedFile associatedFile, int i11) {
            return associatedFile.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addDescription(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static void addLocale(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(3, i11, 0);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(2, b11, 0);
    }

    public static void addVersion(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(4, i11, 0);
    }

    public static int createAssociatedFile(FlatBufferBuilder flatBufferBuilder, int i11, int i12, byte b11, int i13, int i14) {
        flatBufferBuilder.startTable(5);
        addVersion(flatBufferBuilder, i14);
        addLocale(flatBufferBuilder, i13);
        addDescription(flatBufferBuilder, i12);
        addName(flatBufferBuilder, i11);
        addType(flatBufferBuilder, b11);
        return endAssociatedFile(flatBufferBuilder);
    }

    public static AssociatedFile getRootAsAssociatedFile(ByteBuffer byteBuffer) {
        return getRootAsAssociatedFile(byteBuffer, new AssociatedFile());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, AssociatedFileT associatedFileT) {
        if (associatedFileT == null) {
            return 0;
        }
        return createAssociatedFile(flatBufferBuilder, associatedFileT.getName() == null ? 0 : flatBufferBuilder.createString(associatedFileT.getName()), associatedFileT.getDescription() == null ? 0 : flatBufferBuilder.createString(associatedFileT.getDescription()), associatedFileT.getType(), associatedFileT.getLocale() == null ? 0 : flatBufferBuilder.createString(associatedFileT.getLocale()), associatedFileT.getVersion() != null ? flatBufferBuilder.createString(associatedFileT.getVersion()) : 0);
    }

    public static void startAssociatedFile(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(5);
    }

    public String description() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer descriptionAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer descriptionInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
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

    public static AssociatedFile getRootAsAssociatedFile(ByteBuffer byteBuffer, AssociatedFile associatedFile) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return associatedFile.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public String locale() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer localeAsByteBuffer() {
        return __vector_as_bytebuffer(10, 1);
    }

    public ByteBuffer localeInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 10, 1);
    }

    public byte type() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public AssociatedFileT unpack() {
        AssociatedFileT associatedFileT = new AssociatedFileT();
        unpackTo(associatedFileT);
        return associatedFileT;
    }

    public String version() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer versionAsByteBuffer() {
        return __vector_as_bytebuffer(12, 1);
    }

    public ByteBuffer versionInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 12, 1);
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endAssociatedFile(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public AssociatedFile __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(AssociatedFileT associatedFileT) {
        associatedFileT.setName(name());
        associatedFileT.setDescription(description());
        associatedFileT.setType(type());
        associatedFileT.setLocale(locale());
        associatedFileT.setVersion(version());
    }
}
