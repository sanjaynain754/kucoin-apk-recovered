package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataItem extends Table {

    /* JADX INFO: loaded from: classes34.dex */
    public static final class Vector extends BaseVector {
        public MetadataItem get(int i11) {
            return get(new MetadataItem(), i11);
        }

        public MetadataItem get(MetadataItem metadataItem, int i11) {
            return metadataItem.__assign(Table.__indirect(__element(i11), this.f2703bb), this.f2703bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addCodepoints(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(6, i11, 0);
    }

    public static void addCompatAdded(FlatBufferBuilder flatBufferBuilder, short s11) {
        flatBufferBuilder.addShort(3, s11, 0);
    }

    public static void addEmojiStyle(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(1, z11, false);
    }

    public static void addHeight(FlatBufferBuilder flatBufferBuilder, short s11) {
        flatBufferBuilder.addShort(5, s11, 0);
    }

    public static void addId(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static void addSdkAdded(FlatBufferBuilder flatBufferBuilder, short s11) {
        flatBufferBuilder.addShort(2, s11, 0);
    }

    public static void addWidth(FlatBufferBuilder flatBufferBuilder, short s11) {
        flatBufferBuilder.addShort(4, s11, 0);
    }

    public static int createCodepointsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createMetadataItem(FlatBufferBuilder flatBufferBuilder, int i11, boolean z11, short s11, short s12, short s13, short s14, int i12) {
        flatBufferBuilder.startTable(7);
        addCodepoints(flatBufferBuilder, i12);
        addId(flatBufferBuilder, i11);
        addHeight(flatBufferBuilder, s14);
        addWidth(flatBufferBuilder, s13);
        addCompatAdded(flatBufferBuilder, s12);
        addSdkAdded(flatBufferBuilder, s11);
        addEmojiStyle(flatBufferBuilder, z11);
        return endMetadataItem(flatBufferBuilder);
    }

    public static MetadataItem getRootAsMetadataItem(ByteBuffer byteBuffer) {
        return getRootAsMetadataItem(byteBuffer, new MetadataItem());
    }

    public static void startCodepointsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startMetadataItem(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(7);
    }

    public IntVector codepointsVector() {
        return codepointsVector(new IntVector());
    }

    public boolean emojiStyle() {
        int i__offset = __offset(6);
        return (i__offset == 0 || this.f2709bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: id */
    public int m2817id() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f2709bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static MetadataItem getRootAsMetadataItem(ByteBuffer byteBuffer, MetadataItem metadataItem) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return metadataItem.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public int codepoints(int i11) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return this.f2709bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer codepointsAsByteBuffer() {
        return __vector_as_bytebuffer(16, 4);
    }

    public ByteBuffer codepointsInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 4);
    }

    public int codepointsLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector codepointsVector(IntVector intVector) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f2709bb);
        }
        return null;
    }

    public short compatAdded() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f2709bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public short height() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.f2709bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public short sdkAdded() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f2709bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public short width() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.f2709bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_1_12_0();
    }

    public static int endMetadataItem(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public MetadataItem __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }
}
