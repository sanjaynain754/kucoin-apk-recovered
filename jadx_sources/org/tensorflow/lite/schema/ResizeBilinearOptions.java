package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ResizeBilinearOptions extends Table {

    public static final class Vector extends BaseVector {
        public ResizeBilinearOptions get(int i11) {
            return get(new ResizeBilinearOptions(), i11);
        }

        public ResizeBilinearOptions get(ResizeBilinearOptions resizeBilinearOptions, int i11) {
            return resizeBilinearOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAlignCorners(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(2, z11, false);
    }

    public static void addHalfPixelCenters(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(3, z11, false);
    }

    public static int createResizeBilinearOptions(FlatBufferBuilder flatBufferBuilder, boolean z11, boolean z12) {
        flatBufferBuilder.startTable(4);
        addHalfPixelCenters(flatBufferBuilder, z12);
        addAlignCorners(flatBufferBuilder, z11);
        return endResizeBilinearOptions(flatBufferBuilder);
    }

    public static ResizeBilinearOptions getRootAsResizeBilinearOptions(ByteBuffer byteBuffer) {
        return getRootAsResizeBilinearOptions(byteBuffer, new ResizeBilinearOptions());
    }

    public static void startResizeBilinearOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(4);
    }

    public static ResizeBilinearOptions getRootAsResizeBilinearOptions(ByteBuffer byteBuffer, ResizeBilinearOptions resizeBilinearOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return resizeBilinearOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ResizeBilinearOptionsT resizeBilinearOptionsT) {
        if (resizeBilinearOptionsT == null) {
            return 0;
        }
        return createResizeBilinearOptions(flatBufferBuilder, resizeBilinearOptionsT.getAlignCorners(), resizeBilinearOptionsT.getHalfPixelCenters());
    }

    public boolean alignCorners() {
        int i__offset = __offset(8);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public boolean halfPixelCenters() {
        int i__offset = __offset(10);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public ResizeBilinearOptionsT unpack() {
        ResizeBilinearOptionsT resizeBilinearOptionsT = new ResizeBilinearOptionsT();
        unpackTo(resizeBilinearOptionsT);
        return resizeBilinearOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endResizeBilinearOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ResizeBilinearOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ResizeBilinearOptionsT resizeBilinearOptionsT) {
        resizeBilinearOptionsT.setAlignCorners(alignCorners());
        resizeBilinearOptionsT.setHalfPixelCenters(halfPixelCenters());
    }
}
