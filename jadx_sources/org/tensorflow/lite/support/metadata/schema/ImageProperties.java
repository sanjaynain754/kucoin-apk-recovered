package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ImageProperties extends Table {

    public static final class Vector extends BaseVector {
        public ImageProperties get(int i11) {
            return get(new ImageProperties(), i11);
        }

        public ImageProperties get(ImageProperties imageProperties, int i11) {
            return imageProperties.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addColorSpace(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static void addDefaultSize(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static int createImageProperties(FlatBufferBuilder flatBufferBuilder, byte b11, int i11) {
        flatBufferBuilder.startTable(2);
        addDefaultSize(flatBufferBuilder, i11);
        addColorSpace(flatBufferBuilder, b11);
        return endImageProperties(flatBufferBuilder);
    }

    public static ImageProperties getRootAsImageProperties(ByteBuffer byteBuffer) {
        return getRootAsImageProperties(byteBuffer, new ImageProperties());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ImagePropertiesT imagePropertiesT) {
        if (imagePropertiesT == null) {
            return 0;
        }
        return createImageProperties(flatBufferBuilder, imagePropertiesT.getColorSpace(), imagePropertiesT.getDefaultSize() != null ? ImageSize.pack(flatBufferBuilder, imagePropertiesT.getDefaultSize()) : 0);
    }

    public static void startImageProperties(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public byte colorSpace() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public ImageSize defaultSize() {
        return defaultSize(new ImageSize());
    }

    public static ImageProperties getRootAsImageProperties(ByteBuffer byteBuffer, ImageProperties imageProperties) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return imageProperties.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public ImageSize defaultSize(ImageSize imageSize) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return imageSize.__assign(__indirect(i__offset + this.bb_pos), this.f12714bb);
        }
        return null;
    }

    public ImagePropertiesT unpack() {
        ImagePropertiesT imagePropertiesT = new ImagePropertiesT();
        unpackTo(imagePropertiesT);
        return imagePropertiesT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endImageProperties(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ImageProperties __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ImagePropertiesT imagePropertiesT) {
        imagePropertiesT.setColorSpace(colorSpace());
        if (defaultSize() != null) {
            imagePropertiesT.setDefaultSize(defaultSize().unpack());
        } else {
            imagePropertiesT.setDefaultSize(null);
        }
    }
}
