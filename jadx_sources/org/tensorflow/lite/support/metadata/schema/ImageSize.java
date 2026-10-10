package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ImageSize extends Table {

    public static final class Vector extends BaseVector {
        public ImageSize get(int i11) {
            return get(new ImageSize(), i11);
        }

        public ImageSize get(ImageSize imageSize, int i11) {
            return imageSize.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addHeight(FlatBufferBuilder flatBufferBuilder, long j11) {
        flatBufferBuilder.addInt(1, (int) j11, 0);
    }

    public static void addWidth(FlatBufferBuilder flatBufferBuilder, long j11) {
        flatBufferBuilder.addInt(0, (int) j11, 0);
    }

    public static int createImageSize(FlatBufferBuilder flatBufferBuilder, long j11, long j12) {
        flatBufferBuilder.startTable(2);
        addHeight(flatBufferBuilder, j12);
        addWidth(flatBufferBuilder, j11);
        return endImageSize(flatBufferBuilder);
    }

    public static ImageSize getRootAsImageSize(ByteBuffer byteBuffer) {
        return getRootAsImageSize(byteBuffer, new ImageSize());
    }

    public static void startImageSize(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public long height() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return ((long) this.f12714bb.getInt(i__offset + this.bb_pos)) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public long width() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return ((long) this.f12714bb.getInt(i__offset + this.bb_pos)) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public static ImageSize getRootAsImageSize(ByteBuffer byteBuffer, ImageSize imageSize) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return imageSize.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ImageSizeT imageSizeT) {
        if (imageSizeT == null) {
            return 0;
        }
        return createImageSize(flatBufferBuilder, imageSizeT.getWidth(), imageSizeT.getHeight());
    }

    public ImageSizeT unpack() {
        ImageSizeT imageSizeT = new ImageSizeT();
        unpackTo(imageSizeT);
        return imageSizeT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endImageSize(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ImageSize __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ImageSizeT imageSizeT) {
        imageSizeT.setWidth(width());
        imageSizeT.setHeight(height());
    }
}
