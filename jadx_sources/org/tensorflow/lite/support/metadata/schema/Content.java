package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class Content extends Table {

    public static final class Vector extends BaseVector {
        public Content get(int i11) {
            return get(new Content(), i11);
        }

        public Content get(Content content, int i11) {
            return content.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addContentProperties(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static void addContentPropertiesType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static void addRange(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(2, i11, 0);
    }

    public static int createContent(FlatBufferBuilder flatBufferBuilder, byte b11, int i11, int i12) {
        flatBufferBuilder.startTable(3);
        addRange(flatBufferBuilder, i12);
        addContentProperties(flatBufferBuilder, i11);
        addContentPropertiesType(flatBufferBuilder, b11);
        return endContent(flatBufferBuilder);
    }

    public static Content getRootAsContent(ByteBuffer byteBuffer) {
        return getRootAsContent(byteBuffer, new Content());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ContentT contentT) {
        if (contentT == null) {
            return 0;
        }
        return createContent(flatBufferBuilder, contentT.getContentProperties() == null ? (byte) 0 : contentT.getContentProperties().getType(), contentT.getContentProperties() == null ? 0 : ContentPropertiesUnion.pack(flatBufferBuilder, contentT.getContentProperties()), contentT.getRange() != null ? ValueRange.pack(flatBufferBuilder, contentT.getRange()) : 0);
    }

    public static void startContent(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
    }

    public Table contentProperties(Table table) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __union(table, i__offset + this.bb_pos);
        }
        return null;
    }

    public byte contentPropertiesType() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public ValueRange range() {
        return range(new ValueRange());
    }

    public static Content getRootAsContent(ByteBuffer byteBuffer, Content content) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return content.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public ValueRange range(ValueRange valueRange) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return valueRange.__assign(__indirect(i__offset + this.bb_pos), this.f12714bb);
        }
        return null;
    }

    public ContentT unpack() {
        ContentT contentT = new ContentT();
        unpackTo(contentT);
        return contentT;
    }

    public void unpackTo(ContentT contentT) {
        ContentPropertiesUnion contentPropertiesUnion = new ContentPropertiesUnion();
        byte bContentPropertiesType = contentPropertiesType();
        contentPropertiesUnion.setType(bContentPropertiesType);
        if (bContentPropertiesType == 1) {
            Table tableContentProperties = contentProperties(new FeatureProperties());
            contentPropertiesUnion.setValue(tableContentProperties != null ? ((FeatureProperties) tableContentProperties).unpack() : null);
        } else if (bContentPropertiesType == 2) {
            Table tableContentProperties2 = contentProperties(new ImageProperties());
            contentPropertiesUnion.setValue(tableContentProperties2 != null ? ((ImageProperties) tableContentProperties2).unpack() : null);
        } else if (bContentPropertiesType == 3) {
            Table tableContentProperties3 = contentProperties(new BoundingBoxProperties());
            contentPropertiesUnion.setValue(tableContentProperties3 != null ? ((BoundingBoxProperties) tableContentProperties3).unpack() : null);
        } else if (bContentPropertiesType == 4) {
            Table tableContentProperties4 = contentProperties(new AudioProperties());
            contentPropertiesUnion.setValue(tableContentProperties4 != null ? ((AudioProperties) tableContentProperties4).unpack() : null);
        }
        contentT.setContentProperties(contentPropertiesUnion);
        if (range() != null) {
            contentT.setRange(range().unpack());
        } else {
            contentT.setRange(null);
        }
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endContent(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public Content __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }
}
